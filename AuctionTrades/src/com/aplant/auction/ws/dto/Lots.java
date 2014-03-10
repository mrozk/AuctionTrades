package com.aplant.auction.ws.dto;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Lots {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name="user_id")
	private Users user;
	
	private double startprice;
	
	private String name;
	
	private String description;
	
	@Temporal(TemporalType.DATE)
	private java.util.Date startdate;
	
	@Temporal(TemporalType.DATE)
	private java.util.Date finishdate;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public java.util.Date getFinishdate() {
		return finishdate;
	}

	public void setFinishdate(java.util.Date finishdate) {
		this.finishdate = finishdate;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public java.util.Date getStartdate() {
		return startdate;
	}

	public void setStartdate(java.util.Date startdate) {
		this.startdate = startdate;
	}
	
	
	public double getStartprice() {
		return startprice;
	}

	public void setStartprice(double startprice) {
		this.startprice = startprice;
	}
	
	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	
}
