package businesslogicservice.UserBLService._Driver;

import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import businesslogic.util.OrderState;
import VO.UserIDVO;
import VO.StuffInfoVO;

import java.util.ArrayList;
import businesslogic.util.ResultMsg;
import businesslogicservice.UserBLService.StuffIndividualInformationManagementBLService;
import businesslogicservice.UserBLService._Stub.StuffIndividualInformationManagementBLService_Stub;
import vo.OrderOnHotelVO;

public class StuffIndividualInformationManagementBLService_Driver {
	
	public static void main(String[] args){
		StuffIndividualInformationManagementBLService a = new StuffIndividualInformationManagementBLService_Stub();
		StuffIndividualInformationManagementBLService driver=new StuffIndividualInformationManagementBLService();
		driver.drive(a);
	}
	
	public void drive(StuffIndividualInformationManagementBLService StuffIndividualInformationManagementBLService){
		UserIDVO v=new UserIDVO("1234567");
		HotelInfoVO hot=new HotelInfoVO("电力宾馆","南京","新街口",3,"very nice","空调", false);
		StuffInfoVO o=new StuffInfoVO("1234563","Jimmy","1234567",hot);
				
		StuffInfoVO result = StuffIndividualInformationManagementBLService.IndividualBaseInfolnquiry(v);
		if(result!=null)
			System.out.println("显示酒店管理人员基本信息");
		else
			System.out.println("查询失败");
		
		OrderMsg msg1 = StuffIndividualInformationManagementBLService.IndividualBaseInfoModification(v,o);
		if(msg1.isPass() == true)
			System.out.println("修改成功");
		else
			System.out.println("修改失败");
		
		
	}
}
