package com.se.app;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="town")
public class Town {
	
	@Column(name="TownCode")
	private Integer townCode;
	
	@Column(name="townName")
	private String townName;
	
	@Id
	@Column(name="ID")
	private Integer id;
	
	@Column(name="TS")
	private Timestamp timestamp;

	public Integer getTownCode() {
		return townCode;
	}

	public void setTownCode(Integer townCode) {
		this.townCode = townCode;
	}

	public String getTownName() {
		return townName;
	}

	public void setTownName(String townName) {
		this.townName = townName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Town [townCode=" + townCode + ", townName=" + townName + ", id=" + id + ", timestamp=" + timestamp
				+ "]";
	}
	
	

}
