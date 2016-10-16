package dataservice.Customerdataservice._Driver;

import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import po.CustomerManagementDataServicePo;
import java.rmi.RemoteException;
import java.util.ArrayList;

import dataservice.infodataservice.CustomerManagementDataService;
import dataservice.infodataservice._Stub.CustomerManagementDataService_Stub;
import dataservice.exception.ElementNotFoundException;
import dataservice.exception.InterruptWithExistedElementException;
import po.CustomerManagementDataServicePo;
import po.CustomerManagementDataServicePo;

public class CustomerManagementDataService_Driver {
	private CustomerManagementDataServicePo CustomerManagementDataServicePo1;
	private CustomerManagementDataServicePo CustomerManagementDataServicePo2;
	private CustomerManagementDataServicePo  CustomerManagementDataServicePo3;
	
	
	public CustomerManagementDataService_Driver() {
		CustomerManagementDataServicePo1 = new CustomerManagementDataServicePo("025010009","魏彦淑"
				"320323199512122345");
		CustomerManagementDataServicePo2 = new CustomerManagementDataServicePo("025010007","王会",
				"320323199611122345");
		CustomerManagementDataServicePo3 = new CustomerManagementDataServicePo("025010007","王小二",
				"320323199711122345");
		
		ArrayList<CustomerManagementDataServicePo> driverList = new ArrayList<CustomerManagementDataServicePo>();
	    ArrayList<CustomerManagementDataServicePo> vehicleList = new ArrayList<CustomerManagementDataServicePo>();
	    driverList.add(CustomerManagementDataServicePo1);
		driverList.add(CustomerManagementDataServicePo2);
		vehicleList.add(CustomerManagementDataServicePo2);
		vehicleList.add(CustomerManagementDataServicePo3);
	}
	
	public void drive(CustomerManagementDataService CustomerManagementDataService) throws RemoteException, 
	InterruptWithExistedElementException, ElementNotFoundException {
	
		CustomerManagementDataService.SetCustomerBaseInfo(CustomerManagementDataServicePo1);
		CustomerManagementDataService.SetCustomerBaseInfo(CustomerManagementDataServicePo2);
		CustomerManagementDataService.SetCustomerBaseInfo(CustomerManagementDataServicePo3);
		
		CustomerManagementDataService.UpdateCustomerOrders(CustomerManagementDataServicePo1, CustomerManagementDataServicePo2);
		
		
		if(CustomerManagementDataService.SetCustomerBaseInfo(CustomerManagementDataServicePo1))
			System.out.println("success");
		else
			System.out.println("fail");		
		if(CustomerManagementDataService.SetCustomerBaseInfo(CustomerManagementDataServicePo2))
			System.out.println("success");
		else
			System.out.println("fail");		
		if(CustomerManagementDataService.SetCustomerBaseInfo(CustomerManagementDataServicePo3))
			System.out.println("success");
		else
			System.out.println("fail");
		if(CustomerManagementDataService.addVehicle(CustomerManagementDataServicePo1))
			System.out.println("success");
		else
			System.out.println("fail");	
		if(CustomerManagementDataService.addVehicle(CustomerManagementDataServicePo2))
			System.out.println("success");
		else
			System.out.println("fail");
		if(CustomerManagementDataService.addVehicle(CustomerManagementDataServicePo3))
			System.out.println("success");
		else
			System.out.println("fail");
		if(CustomerManagementDataService.UpdateCustomerOrders(CustomerManagementDataServicePo1, CustomerManagementDataServicePo2))
			System.out.println("success");
		else
			System.out.println("fail");
		if(CustomerManagementDataService.modifyDriver(CustomerManagementDataServicePo1, CustomerManagementDataServicePo2))
			System.out.println("success");
		else
			System.out.println("fail");
		if(CustomerManagementDataService.removeDriver(CustomerManagementDataServicePo2))
			System.out.println("success");
		else
			System.out.println("fail");
		if(CustomerManagementDataService.removeVehicle(CustomerManagementDataServicePo1))
			System.out.println("success");
		else
			System.out.println("fail");
			
	}
	
	public static void main(String[] args) throws RemoteException, InterruptWithExistedElementException, ElementNotFoundException {
		CustomerManagementDataService_Stub stub = new CustomerManagementDataService_Stub();
		CustomerManagementDataService_Driver driver  = new CustomerManagementDataService_Driver();
		driver.drive(stub);
		
	}

}
