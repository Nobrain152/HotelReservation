package businesslogicservice.userservice._stub;

import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import VO.HotelStuffHotelOperationVO VO;

public class HotelStuffHotelOperationBLService_Stub{

    HotelInfoVO hot;
	public CustomerIndividualInformationManagementBLService_Stub(){
		Order order=new OrderVO();
		array.add(order);
		hot=new HotelInfoVO("电力宾馆","南京","新街口",3,"very nice","空调", false);
		arr=new ArrayList<HotelInfoVO>();
		arr.add(hot);
	} 
	
	Public HotelInfoVO HotelInformationInquiry(HotelIDVO VO){
	    return hot;
	}
	
	Public ResultMsg HotelInformationModification(HotelIDVO VO1,UserIDVO VO2){
	    return ResdultMsg(true,"修改成功")；
	}
	
	Public ResultMsg HotelStrategeManage(HotelIDVO VO1,HotelStrategeVO VO){
	    return RessultMsg(true,"修改成功")；
	}
	
	Public VOid OrderStateUpdate(UserIDVO VO1,OrderVO VO2){
	    String s=VO1.getUserID;
	}
	
	Public ArrayList<OrderVO> OrderScan(HotelIDVO VO){
	    return array;
	}
}