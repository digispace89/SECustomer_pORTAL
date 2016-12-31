package com.se.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.se.app.Town;
import com.se.model.Customer;
import com.se.util.ConnectionFactory;

public class CustomerDaoImpl implements CustomerDao {

	private static SessionFactory sessionFactory;
	static {
		sessionFactory = ConnectionFactory.getSessionFactory();
	}

	@Override
	public void saveCustomer(Customer customer) {
		Session session = sessionFactory.openSession();
		if (!session.getTransaction().isActive()) {
			session.beginTransaction();
		}
		try {
			Serializable id = session.save(customer);
			System.out.println("Object saved- id :" + id);
			session.getTransaction().commit();

		} catch (Exception e) {
			if (session.getTransaction().isActive()) {
				session.getTransaction().rollback();
			}
			System.out.println(e.getMessage());
		}

		finally {
			session.close();
		}

	}

	@Override
	public List<Customer> getAllCustomers(Customer customer) {
		Session session = sessionFactory.openSession();
		List<Customer> list = null;
		
		if (!session.getTransaction().isActive()) {
			session.beginTransaction();
		}
		try {
			list = session.createQuery("from Customer").list();
			session.getTransaction().commit();

		} catch (Exception e) {
			if (session.getTransaction().isActive()) {
				session.getTransaction().rollback();
			}
			System.out.println(e.getMessage());
		}

		finally {
			session.close();
		}
		
		return list;
	}

	@Override
	public Customer getCustomer(String customerCode) {
		Session session = sessionFactory.openSession();
		
		Customer customer = null;
		
		
		if (!session.getTransaction().isActive()) {
			session.beginTransaction();
		}
		try {
			Query query = session.createQuery("from Customer where customerCode=:customerCode");
			query.setString("customerCode", customerCode);
			customer = (Customer) query.uniqueResult();
			session.getTransaction().commit();

		} catch (Exception e) {
			if (session.getTransaction().isActive()) {
				session.getTransaction().rollback();
			}
			System.out.println(e.getMessage());
		}

		finally {
			session.close();
		}

		
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Session session = sessionFactory.openSession();
		if (!session.getTransaction().isActive()) {
			session.beginTransaction();
		}
		try {
			session.merge(customer);
			session.getTransaction().commit();

		}  catch (Exception e) {
			if (session.getTransaction().isActive()) {
				session.getTransaction().rollback();
			}
			System.out.println(e.getMessage());

		} finally {
			session.close();

		}		
		return customer;
	}

	@Override
	public Customer deleteCustomer(Customer customer) {
		customer.setActive(false);
		customer.setDeletedDate(new Date());
		updateCustomer(customer);
		return customer;
	}

	
	public static void getTown() {
		Session session = sessionFactory.openSession();
		
		Town town = null;
		
		
		if (!session.getTransaction().isActive()) {
			session.beginTransaction();
		}
		try {
			Query query = session.createQuery("from Town where townCode=:townCode");
			query.setInteger("townCode", 1);
			town = (Town) query.uniqueResult();
			System.out.println("Town:"+town.toString());
			session.getTransaction().commit();

		} catch (Exception e) {
			if (session.getTransaction().isActive()) {
				session.getTransaction().rollback();
			}
			System.out.println(e.getMessage());
		}

		finally {
			session.close();
		}

		
		//return customer;
	}
	
}
