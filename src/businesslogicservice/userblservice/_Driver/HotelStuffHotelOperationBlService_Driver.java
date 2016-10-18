package businesslogicservice.UserBLService._Driver;

import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import VO.HotelStuffHotelOperationVO VO;

import java.util.ArrayList;
import businesslogic.util.ResultMsg;
import businesslogicservice.UserBLService.HotelStuffHotelOperationBlService;
import businesslogicservice.UserBLService._Stub.HotelStuffHotelOperationBlService_Stub;
import vo.OrderOnHotelVO;

public class HotelStuffHotelOperationBlService_Driver {
	
	public static void main(String[] args){
		HotelStuffHotelOperationBlService a = new HotelStuffHotelOperationBlService_Stub();
		HotelStuffHotelOperationBlService driver=new HotelStuffHotelOperationBlService();
		driver.drive(a);
	}
	
	public void drive(HotelStuffHotelOperationBlService HotelStuffHotelOperationBlService){
		
		HotelIDVO v=new HotelIDVO("12345671");
		UserIDVO o=new UserIDVO("12345674");
		OrderOnHotelVO orderVO = new OrderOnHotelVO("txin",OrderState.EXECUTED,"2016-10-15 12:00","2016-10-16 12:00",
        		"2016-10-15 24:00",RoomType.ROOM_STANDARD,1,1,false); 
				
		HotelInfoVO result = HotelStuffHotelOperationBlService.HotelInformationInquiry(v);
		if(result!=null)
			System.out.println("显示酒店信息");
		else
			System.out.println("没有符合条件的酒店");
		
		OrderMsg msg1 = HotelStuffHotelOperationBlService.HotelInformationModification(v,o);
		if(msg1.isPass() == true)
			System.out.println("修改成功");
		else
			System.out.println("修改失败");
		
		
	}
}
