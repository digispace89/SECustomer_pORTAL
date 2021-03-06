package com.se.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class ConnectionFactory {
	  private static final SessionFactory sessionFactory = buildSessionFactory();
	     private static SessionFactory buildSessionFactory() {
	    	 
	    	 Configuration configuration = new Configuration().configure();
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties());
			SessionFactory sessionFactory = configuration
					.buildSessionFactory(builder.build());
			return sessionFactory;
			
	     }
	   
	     public static SessionFactory getSessionFactory() {
	         return sessionFactory;
	     }
}
