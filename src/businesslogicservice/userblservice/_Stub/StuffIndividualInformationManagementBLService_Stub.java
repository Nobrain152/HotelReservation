package businesslogicservice.userservice._stub;

import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import businesslogic.util.OrderState;
import VO.UserIDVO;
import VO.StuffInfoVO;

public class StuffIndividualInformationManagementBLService_Stub{
    
	
	ArrayList<OrderVO> arry;
	HotelInfoVO hot;
	ArrayList<HotelInfoVO> arr;
	StuffIfoVO VO;
	 
	public CustomerIndividualInformationManagementBLService_Stub(){
		Order order=new OrderVO();
		array.add(order);
		hot=new HotelInfoVO("电力宾馆","南京","新街口",3,"very nice","空调", false);
		arr=new ArrayList<HotelInfoVO>();
		arr.add(hot);
		VO=new StuffInfoVO("1234568","Tom","1234567889",hot);
	} 
	
	Public StuffInfoVO IndividualBaseInfolnquiry(UserIDVO VO){
	    return VO;
	}
	
	Public ResultMsg IndividualBaseInfoModification(UserIDVO VO1,StuffInfoVO VO2){
	    return new ResultMsg(true,"修改成功！");
	}
}