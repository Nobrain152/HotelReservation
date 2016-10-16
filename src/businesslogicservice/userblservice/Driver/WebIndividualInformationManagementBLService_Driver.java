package businesslogicservice.UserBLService._Driver;

import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import businesslogic.util.OrderState;
import VO.UserIDVO;
import VO.StuffInfoVO;

import java.util.ArrayList;
import businesslogic.util.ResultMsg;
import businesslogicservice.UserBLService.WebIndividualInformationManagementBLService;
import businesslogicservice.UserBLService._Stub.WebIndividualInformationManagementBLService_Stub;
import vo.OrderOnHotelVO;

public class WebIndividualInformationManagementBLService_Driver {
	
	public static void main(String[] args){
		WebIndividualInformationManagementBLService a = new WebIndividualInformationManagementBLService_Stub();
		WebIndividualInformationManagementBLService driver=new WebIndividualInformationManagementBLService();
		driver.drive(a);
	}
	
	public void drive(WebIndividualInformationManagementBLService WebIndividualInformationManagementBLService){
		UserIDVO v=new UserIDVO("1234567");
		WebInfoVO o=new StuffInfoVO("1234563","Jimmy","1234567");
				
		StuffInfoVO result = WebIndividualInformationManagementBLService.IndividualBaseInfolnquiry(v);
		if(result!=null)
			System.out.println("显示基本信息");
		else
			System.out.println("查询失败");
		
		OrderMsg msg1 = WebIndividualInformationManagementBLService.IndividualBaseInfoModification(v,o);
		if(msg1.isPass() == true)
			System.out.println("修改成功");
		else
			System.out.println("修改失败");
		
		
	}
}
