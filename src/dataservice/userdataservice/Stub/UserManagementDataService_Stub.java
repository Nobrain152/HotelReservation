package dataservice.userdataservice._Stub;

import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import po.UserManagementPo;
import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import po.UserManagementDataServicePo;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.DriverPO;
import po.VehiclePO;
import dataservice.infodataservice.UserManagementDataService;
import dataservice.exception.ElementNotFoundException;
import dataservice.exception.InterruptWithExistedElementException;

public class UserManagementDataService_Stub implements UserManagementDataService {


	@Override
	Public String GetLoginInfo(UserManagementPo po)throws RemoteException,
			InterruptWithExistedElementException {
		
		return "getting  success";
	}

	


	@Override
	public Public String AddUser(UserManagementPo po) throws RemoteException,
			ElementNotFoundException {
		
		return "add user success";
	}

	

	

	@Override
	Public UserVo GetUserBaseInfo(UserManagementPo po)throws RemoteException {
		System.out.println("success getting");
		return null;
	}

	@Override
    Public boolean SetUserBaseInfo(UserManagementPo po)throws RemoteException {
		System.out.println("success setting");
		return true;
	}

	


}
