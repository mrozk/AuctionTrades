package com.aplant.auction.ws.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LotsTraids {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	
	private java.util.Date inputdate;
	
	@ManyToOne
	private Users user;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public java.util.Date getInputdate() {
		return inputdate;
	}

	public void setInputdate(java.util.Date inputdate) {
		this.inputdate = inputdate;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Lots getLot() {
		return lot;
	}

	public void setLot(Lots lot) {
		this.lot = lot;
	}

	@ManyToOne
	private Lots lot;
}
