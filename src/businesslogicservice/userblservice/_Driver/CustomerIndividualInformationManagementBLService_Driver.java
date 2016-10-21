package businesslogicservice.UserBLService._Driver;

import businesslogic.util.ResultMsg;
import businesslogicservice.CustomerIndividualInformationManagementBLService.BaseDataBuildingBLService;
import VO.CustomerInfoVO;
import VO.UserIDVO;
import java.util.ArrayList;
import businesslogic.util.ResultMsg;
import businesslogicservice.UserBLService.CustomerIndividualInformationManagementBLService;
import businesslogicservice.UserBLService._Stub.CustomerIndividualInformationManagementBLService_Stub;
import vo.OrderOnHotelVO;

public class CustomerIndividualInformationManagementBLService_Driver {
	
	public static void main(String[] args){
		CustomerIndividualInformationManagementBLService a = new CustomerIndividualInformationManagementBLService_Stub();
		CustomerIndividualInformationManagementBLService driver=new CustomerIndividualInformationManagementBLService();
		driver.drive(a);
	}
	
	public void drive(CustomerIndividualInformationManagementBLService CustomerIndividualInformationManagementBLService){
		
		UserIDVO v=new UserIDVO("12345672");
		
		CustomerInfoVO o=new CustomerInfoVO("12345673","LiMing","1234567890",100);
				
		UserInfoVO result = CustomerIndividualInformationManagementBLService.IndividualBaseInfolnquiry(v);
		if(result!=null)
			System.out.println("显示用户信息");
		else
			System.out.println("输入账号没有对应用户。");
		
		OrderMsg msg1 = CustomerIndividualInformationManagementBLService.IndividualBaseInfoModification(v,o);
		if(msg1.isPass() == true)
			System.out.println("修改成功！");
		else
			System.out.println("修改失败！");
		
		int n=CustomerIndividualInformationManagementBLService.IndividualCredictInquiry(UserIDVO VO);
		System.out.println(n);
	}
}

