package businesslogicservice.UserBLService._Driver;

import java.until.ArrayList<>;
import VO.UserIDVO;
import VO.UserInfoVO;
import java.util.ArrayList;
import businesslogic.util.ResultMsg;
import businesslogicservice.UserBLService.WebManagerWebsiteManagementBLService;
import businesslogicservice.UserBLService._Stub.WebManagerWebsiteManagementBLService_Stub;
import vo.OrderOnHotelVO;

public class WebManagerWebsiteManagementBLService_Driver {
	
	public static void main(String[] args){
		WebManagerWebsiteManagementBLService a = new WebManagerWebsiteManagementBLService_Stub();
		WebManagerWebsiteManagementBLService driver=new WebManagerWebsiteManagementBLService();
		driver.drive(a);
	}
	
	public void drive(WebManagerWebsiteManagementBLService WebManagerWebsiteManagementBLService){
		UserInfoVO v=new UserInfoVO("1234567","Tom","1234567890",100);
		UserIDVO o=new UserIDVO("1234567");
		
				
		UserInfoVO result = WebManagerWebsiteManagementBLService.UserInformationInquiry(o);
		if(result!=null)
			System.out.println("显示用户信息");
		else
			System.out.println("获取用户信息失败");
		
		OrderMsg msg1 = WebManagerWebsiteManagementBLService.UserInformationModification(o,v);
		if(msg1.isPass() == true)
			System.out.println("修改成功");
		else
			System.out.println("修改失败");
		
		OrderMsg msg1 = WebManagerWebsiteManagementBLService.WebsiteStuffAdd(o);
		if(msg1.isPass() == true)
			System.out.println("添加成功");
		else
			System.out.println("添加失败");
	}
}
