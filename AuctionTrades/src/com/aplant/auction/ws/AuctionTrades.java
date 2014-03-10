package com.aplant.auction.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface AuctionTrades {
	
	@WebMethod
	public int autorize();
	
	@WebMethod
	public void addLot( String name );
	
	@WebMethod
	public void addUser();
	
	@WebMethod
	public void addBids();
	
	@WebMethod
	public String getBids();
	
	
	@WebMethod
	public void canselTrades();
}
