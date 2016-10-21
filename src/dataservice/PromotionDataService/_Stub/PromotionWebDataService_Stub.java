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


	@Override
	public PromotionWebPO findByLevel(String name) throws RemoteException {
		return PromotionWebPO1;
	}
	
	@Override
	public ArrayList<PromotionWebPO> show() throws RemoteException {
		return PromotionWebPOS;
	}
	
	
}