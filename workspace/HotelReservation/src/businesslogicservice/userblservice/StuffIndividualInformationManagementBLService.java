package businesslogicservice.userblservice;

import java.util.ArrayList;
import businesslogic.util.MemberType;
import businesslogic.util.OrderState;
import vo.UserIDVO;
import vo.StuffInfoVO;


//酒店管理人员个人信息接口
public interface StuffIndividualInformationManagementBLService{
        
		
		
		//酒店管理人员查询个人信息的接口
		public StuffInfoVO IndividualBaseInfolnquiry(UserIDVO vo);
		
		//酒店管理人员修改个人信息的接口
		public boolean IndividualBaseInfoModification(UserIDVO vo1,StuffInfoVO vo2);
		
}