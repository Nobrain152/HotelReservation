package dataservice.hoteldataservice._Stub;

import dataservice.hoteldataservice.HotelInfoDataService;
import po.HotelEvaluatePO;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class HotelEvaluateDataService_Stub implements HotelEvaluateDataService {

    @Override
    public vpid insert(HotelEvaluatePO po) throws RemoteException {
        System.out.println("insert succeed!");
    }

    @Override
    public void delete(HotelEvaluatePO po) throws RemoteException {
        System.out.println("delete succeed!");
    }

    @Override
    public HotelEvaluatePO find(String searchInfo) throws RemoteException {
        System.out.println("find succeed!");
        return new HotelEvaluatePO();
    }
	
	@Override
	public ArrayList<HotelEvaluatePO> show() throws RemoteException{
		System.out.println("show succeed!");
        return new ArrayList<HotelEvaluatePO>();
	}
}