package dataservice.PromotionDataService._Stub;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.rmi.RemoteException;

import po.PromotionHotelPO;


import po.PromotionHotelPO;

public class PromotionHotelDataService_Stub {
	private PromotionHotelPO PromotionHotelPO1;
	private PromotionHotelPO PromotionHotelPO2;
	private ArrayList<PromotionHotelPO> PromotionHotelPOs;
	private String name;
	
	
	public PromotionHotelDataService_Stub(){
		
		PromotionHotelPO1 = new PromotionHotelPO(HOTEL_CUSTOM_PROMOTION,"会员","2016/10/10","2016/10/15","80");
		PromotionHotelPO2 = new PromotionHotelPO(HOTEL_CUSTOM_PROMOTION,"会员","2016/10/11","2016/10/16","90");
		PromotionHotelPOs = new ArrayList<PromotionHotelPO>();
		PromotionHotelPOs.add(PromotionHotelPO1);
		PromotionHotelPOs.add(PromotionHotelPO2);
	}


	@Override
	public PromotionHotelPO findByLevel(String name) throws RemoteException {
		return PromotionHotelPO1;
	}
	
	@Override
	public ArrayList<PromotionHotelPO> show() throws RemoteException {
		return PromotionHotelPOS;
	}
	
	
}