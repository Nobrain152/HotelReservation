package dataservice.PromotionDataService._Stub;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.rmi.RemoteException;

import po.PromotionWebPO;


import po.PromotionWebPO;

public class PromotionWebDataService_Stub {
	private PromotionWebPO PromotionWebPO1;
	private PromotionWebPO PromotionWebPO2;
	private ArrayList<PromotionWebPO> PromotionWebPOs;
	private String name;
	
	
	public PromotionWebDataService_Stub(){
		
		PromotionWebPO1 = new PromotionWebPO(Web_CUSTOM_PROMOTION,"会员","2016/10/10","2016/10/15","80");
		PromotionWebPO2 = new PromotionWebPO(Web_CUSTOM_PROMOTION,"会员","2016/10/11","2016/10/16","90");
		PromotionWebPOs = new ArrayList<PromotionWebPO>();
		PromotionWebPOs.add(PromotionWebPO1);
		PromotionWebPOs.add(PromotionWebPO2);
	}


	public void drive(PromotionWebDataService PromotionWebDataService) throws RemoteException {
        if(PromotionWebDataService.insert(PromotionWebPO));
        	System.out.println("insert succeed");
        if(PromotionWebDataService.insert(PromotionWebPO2));
        	System.out.println("insert succeed");
        PromotionWebDataService.find(PromotionWebPO);
        PromotionWebDataService.find(PromotionWebPO2);
        PromotionWebDataService.findAll();
        if(PromotionWebDataService.delete(PromotionWebPO));
        	System.out.println("delete succeed");
        if(PromotionWebDataService.update(PromotionWebPO3));
        	System.out.println("update succeed");
    }

	public static void main(String[] args) throws RemoteException {
        PromotionWebDataService stub = new PromotionWebDataService_Stub();
        PromotionWebDataService_Driver driver = new PromotionWebDataService_Driver();
        driver.drive(stub);
    }
	
	
}