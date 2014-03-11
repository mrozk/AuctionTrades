package com.aplant.auction.ws.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class LotsTraids {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	
	@Temporal(TemporalType.DATE)
	private java.util.Date inputdate;
	
	public int user_id;
	
	@ManyToOne
	private Lots lot;
	
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

	

	public void setLot(Lots lot) {
		this.lot = lot;
	}
	
	@ManyToOne
	public Lots getLot() {
		return lot;
	}

	

}
