package dataservice.userdataservice._Driver;

import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import po.UserManagementPo;
import java.rmi.RemoteException;
import java.util.ArrayList;

import dataservice.infodataservice.UserManagementDataService;
import dataservice.infodataservice._Stub.UserManagementDataService_Stub;
import dataservice.exception.ElementNotFoundException;
import dataservice.exception.InterruptWithExistedElementException;
import po.UserManagementPo;
import po.UserManagementPo;

public class UserManagementDataService_Driver {
	private UserManagementPo UserManagementPo1;
	private UserManagementPo UserManagementPo2;
	private UserManagementPo  UserManagementPo3;
	
	
	public UserManagementDataService_Driver() {
		UserManagementPo1 = new UserManagementPo("025010009","魏彦淑"
				"320323199512122345");
		UserManagementPo2 = new UserManagementPo("025010007","王会",
				"320323199611122345");
		UserManagementPo3 = new UserManagementPo("025010007","王小二",
				"320323199711122345");
		
		ArrayList<UserManagementPo> driverList = new ArrayList<UserManagementPo>();
	    ArrayList<UserManagementPo> vehicleList = new ArrayList<UserManagementPo>();
	    driverList.add(UserManagementPo1);
		driverList.add(UserManagementPo2);
		vehicleList.add(UserManagementPo2);
		vehicleList.add(UserManagementPo3);
	}
	
	public void drive(UserManagementDataService UserManagementDataService) throws RemoteException, 
	InterruptWithExistedElementException, ElementNotFoundException {
	
		UserManagementDataService.SetUserBaseInfo(UserManagementPo1);
		UserManagementDataService.SetUserBaseInfo(UserManagementPo2);
		UserManagementDataService.SetUserBaseInfo(UserManagementPo3);
		
		UserManagementDataService.UpdateCustomerOrders(UserManagementPo1, UserManagementPo2);
		
		
		if(UserManagementDataService.SetUserBaseInfo(UserManagementPo1))
			System.out.println("success");
		else
			System.out.println("fail");		
		if(UserManagementDataService.SetUserBaseInfo(UserManagementPo2))
			System.out.println("success");
		else
			System.out.println("fail");		
		if(UserManagementDataService.SetUserBaseInfo(UserManagementPo3))
			System.out.println("success");
		else
			System.out.println("fail");
		if(UserManagementDataService.addVehicle(UserManagementPo1))
			System.out.println("success");
		else
			System.out.println("fail");	
		if(UserManagementDataService.addVehicle(UserManagementPo2))
			System.out.println("success");
		else
			System.out.println("fail");
		if(UserManagementDataService.addVehicle(UserManagementPo3))
			System.out.println("success");
		else
			System.out.println("fail");
		if(UserManagementDataService.UpdateCustomerOrders(UserManagementPo1, UserManagementPo2))
			System.out.println("success");
		else
			System.out.println("fail");
		if(UserManagementDataService.modifyDriver(UserManagementPo1, UserManagementPo2))
			System.out.println("success");
		else
			System.out.println("fail");
		if(UserManagementDataService.removeDriver(UserManagementPo2))
			System.out.println("success");
		else
			System.out.println("fail");
		if(UserManagementDataService.removeVehicle(UserManagementPo1))
			System.out.println("success");
		else
			System.out.println("fail");
			
	}
	
	public static void main(String[] args) throws RemoteException, InterruptWithExistedElementException, ElementNotFoundException {
		UserManagementDataService_Stub stub = new UserManagementDataService_Stub();
		UserManagementDataService_Driver driver  = new UserManagementDataService_Driver();
		driver.drive(stub);
		
	}

}
