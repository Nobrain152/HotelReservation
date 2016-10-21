package businesslogicservice.userservice._stub;

import java.until.ArrayList<>;
import VO.WebStuffWebsiteManagementVO;

public class WebStuffWebsiteManagementBLService_Stub{

    ArrayList<OrderVO> arry;
	HotelInfoVO hot;
	 
	public CustomerIndividualInformationManagementBLService_Stub(){
		Order order=new OrderVO();
		array.add(order);
		
	} 
    
	
	/创建网站策略
	Public ResultMsg WebsiteStrategeCreate(WebStuffWebsiteManagementVO VO){
	    return new ResultMsg(true,"创建成功！")；
	}
		
	//查看异常订单
	Public ArrayList<OrderVO> AbnormalOrderScan(){
	    return array;
	}
		
	//修改用户信用度
	Public ResultMsg UserCreditModification(WebStuffWebsiteManagementVO VO){
	    return ResultMsg(true,"修改成功！")；
	}
}