package businesslogicservice.UserBLService._Driver;

import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import VO.HotelStuffHotelOperationVO VO;

import java.util.ArrayList;
import businesslogic.util.ResultMsg;
import businesslogicservice.UserBLService.WebManagerHotelOperationBlService;
import businesslogicservice.UserBLService._Stub.WebManagerHotelOperationBlService_Stub;
import vo.OrderOnHotelVO;

public class WebManagerHotelOperationBlService_Driver {
	
	public static void main(String[] args){
		WebManagerHotelOperationBlService a = new WebManagerHotelOperationBlService_Stub();
		WebManagerHotelOperationBlService driver=new WebManagerHotelOperationBlService();
		driver.drive(a);
	}
	
	public void drive(WebManagerHotelOperationBlService WebManagerHotelOperationBlService){
		
		HotelIDVO v=new HotelIDVO("12345671");
		UserIDVO o=new UserIDVO("12345674");
		HotelInfoVO hot=new HotelInfoVO("电力宾馆","南京","新街口",3,"very nice","空调", false);
				
		
		OrderMsg msg1 = WebManagerHotelOperationBlService.HotelAdd(hot);
		if(msg1.isPass() == true)
			System.out.println("添加成功");
		else
			System.out.println("添加失败");
			
		
		OrderMsg msg1 = WebManagerHotelOperationBlService.StuffAdd(v,o);
		if(msg1.isPass() == true)
			System.out.println("添加成功");
		else
			System.out.println("添加失败");
		
	}
}
