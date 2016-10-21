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


	public void drive(PromotionHotelDataService PromotionHotelDataService) throws RemoteException {
        if(PromotionHotelDataService.insert(PromotionHotelPO));
        	System.out.println("insert succeed");
        if(PromotionHotelDataService.insert(PromotionHotelPO2));
        	System.out.println("insert succeed");
        PromotionHotelDataService.find(PromotionHotelPO);
        PromotionHotelDataService.find(PromotionHotelPO2);
        PromotionHotelDataService.findAll();
        if(PromotionHotelDataService.delete(PromotionHotelPO));
        	System.out.println("delete succeed");
        if(PromotionHotelDataService.update(PromotionHotelPO3));
        	System.out.println("update succeed");
    }

	public static void main(String[] args) throws RemoteException {
        PromotionHotelDataService stub = new PromotionHotelDataService_Stub();
        PromotionHotelDataService_Driver driver = new PromotionHotelDataService_Driver();
        driver.drive(stub);
    }
	
	
}