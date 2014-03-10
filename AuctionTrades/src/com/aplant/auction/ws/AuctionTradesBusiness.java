package com.aplant.auction.ws;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.aplant.auction.ws.dto.Lots;

public class AuctionTradesBusiness {
	
	private static final String PERSISTENCE_UNIT_NAME = "todos";
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME) ;
	private EntityManager em = emf.createEntityManager();
	
	public void addLot(Lots lot)
	{
		em.getTransaction().begin();
		em.persist(lot);
		em.getTransaction().commit();
	}
}
