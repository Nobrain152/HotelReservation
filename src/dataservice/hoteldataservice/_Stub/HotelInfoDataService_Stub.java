package dataservice.hoteldataservice._Stub;

import dataservice.hoteldataservice.HotelInfoDataService;
import po.HotelInfoPO;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class HotelInfoDataService_Stub implements HotelInfoDataService {

    @Override
    public vpid insert(HotelInfoPO po) throws RemoteException {
        System.out.println("insert succeed!");
    }

    @Override
    public void delete(HotelInfoPO po) throws RemoteException {
        System.out.println("delete succeed!");
    }

    @Override
    public void update(HotelInfoPO po) throws RemoteException {
        System.out.println("update succeed!");
    }

    @Override
    public HotelInfoPO findByName(String name) throws RemoteException {
        System.out.println("find succeed!");
        return new HotelInfoPO();
    }
	
	@Override
	public HotelInfoPO findByCondition(String condition) throws RemoteException {
        System.out.println("find succeed!");
        return new HotelInfoPO();
    }
	
	@Override
	public ArrayList<HotelInfoPO> show() throws RemoteException{
		System.out.println("show succeed!");
        return new ArrayList<HotelInfoInPO>();
	}
}