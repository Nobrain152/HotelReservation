package businesslogicservice.userblservice;

import java.until.ArrayList<>;
import vo.UserIDVo;
import vo.WebInfoVo;


//网站管理和营销人员管理个人信息接口
public interface WebIndividualInformationManagementBLService{
        
		
		
		
		//查看个人信息接口
		Public WebInfoVo IndividualBaseInfolnquiry(UserIDVo vo);
		
		//修改个人信息接口
		Public boolean IndividualBaseInfoModification(UserIDVo vo1,WebInfoVo vo2);
		
}