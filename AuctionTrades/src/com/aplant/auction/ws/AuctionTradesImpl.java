package com.aplant.auction.ws;

import javax.jws.WebService;

import com.aplant.auction.ws.dto.Lots;

@WebService(endpointInterface="com.aplant.auction.ws.AuctionTrades")
public class AuctionTradesImpl implements AuctionTrades{
	
	private AuctionTradesBusiness business = new AuctionTradesBusiness();
	
	@Override
	public int autorize() {
		return 0;
	}

	@Override
	public void addLot( String name ) {
		Lots lot = new Lots();
		lot.setName("Some lot");
		business.addLot(lot);
	}

	@Override
	public void addUser() {
		
	}

	@Override
	public void addBids() {
		
	}

	@Override
	public String getBids() {
		return "oxk";
	}

	@Override
	public void canselTrades() {
		// TODO Auto-generated method stub
		
	}

}
