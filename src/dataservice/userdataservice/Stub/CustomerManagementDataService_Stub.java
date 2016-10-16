package dataservice.userdataservice._Stub;

import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import po.CustomerManagementDataServicePo;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.DriverPO;
import po.VehiclePO;
import dataservice.infodataservice.CustomerManagementDataService;
import dataservice.exception.ElementNotFoundException;
import dataservice.exception.InterruptWithExistedElementException;

public class CustomerManagementDataService_Stub implements CustomerManagementDataService {


	@Override
	public boolean addMembers(CustomerManagementDataServicePo po) throws RemoteException,
			InterruptWithExistedElementException {
		System.out.println("add member success");
		return true;
	}

	

	@Override
	public boolean UpdateCustomerOrders(CustomerManagementDataServicePo po) throws RemoteException,
			ElementNotFoundException {
		System.out.println("update customer orders success");
		return true;
	}

	@Override
	public boolean SetCustomerHotel (CustomerManagementDataServicePo po) throws RemoteException,
			ElementNotFoundException {
		System.out.println("Set customer Hotel success");
		return true;
	}

	@Override
	public boolean SetCustomerCredit(CustomerManagementDataServicePo po)
			throws RemoteException, ElementNotFoundException,
			InterruptWithExistedElementException {
		System.out.println("set customer credit success");
		return true;
	}

	

	@Override
	Public ArrayList<OrderVo> GetCustomerOrders(CustomerManagementDataServicePo po) throws RemoteException {
		System.out.println("success getting");
		return null;
	}

	@Override
    Public ArrayList<HotelVo> GetCustomerHotel(CustomerManagementDataServicePo po)throws RemoteException {
		System.out.println("success getting");
		return null;
	}

	


}
