package dataservice.userdataservice;

import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import po.CustomerManagementDataServicePo;



//客户信息数据接口
public interface CustomerManagementDataService{
        
		
		
		//增加会员
		Public boolean AddMembers(CustomerManagementDataServicePo po);
		
		//得到客户订单信息
		Public ArrayList<OrderVo> GetCustomerOrders(CustomerManagementDataServicePo po);
		
		//更新客户订单信息
		Public boolean UpdateCustomerOrders(CustomerManagementDataServicePo po);
		
		//得到用户酒店信息
		Public ArrayList<HotelVo> GetCustomerHotel(CustomerManagementDataServicePo po);
		
		//更新客户酒店信息
		Public boolean SetCustomerHotel (CustomerManagementDataServicePo po);
		
		//更新用户信用记录
		Public boolean SetCustomerCredit(CustomerManagementDataServicePo po);
		
}