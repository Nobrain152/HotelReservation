package businesslogicservice.userblservice;

import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import businesslogic.util.OrderState;
import vo.UserIDVo;
import vo.StuffInfoVo;


//酒店管理人员个人信息接口
public interface StuffIndividualInformationManagementBLService{
        
		
		
		//酒店管理人员查询个人信息的接口
		Public StuffInfoVo IndividualBaseInfolnquiry(UserIDVo vo);
		
		//酒店管理人员修改个人信息的接口
		Public boolean IndividualBaseInfoModification(UserIDVo vo1,StuffInfoVo vo2);
		
}