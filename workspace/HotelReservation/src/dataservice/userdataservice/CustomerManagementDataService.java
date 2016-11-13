package dataservice.userdataservice;

import java.util.ArrayList;

import vo.HotelInfoVO;
import vo.OrderVO;

public interface CustomerManagementDataService{
        
		
		
		
		public boolean AddMembers(CustomerManagementDataServicePO po);
		
		
		public ArrayList<OrderVO> GetCustomerOrders(CustomerManagementDataServicePO po);
		
		
		public boolean UpdateCustomerOrders(CustomerManagementDataServicePO po);
		
		
		public ArrayList<HotelInfoVO> GetCustomerHotel(CustomerManagementDataServicePO po);
		
		
		public boolean SetCustomerHotel (CustomerManagementDataServicePO po);
		
		
		public boolean SetCustomerCredit(CustomerManagementDataServicePO po);
		
}