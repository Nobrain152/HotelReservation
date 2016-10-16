package businesslogicservice.userservice._stub;

import java.until.ArrayList<>;
import VO.UserIDVO;
import VO.UserInfoVO;

public class WebManagerWebsiteManagementBLService_Stub {
    
	    UserInfoVO v=new UserInfoVO("1234569","Jerry","1234567890");
	
		
		//用户信息查询
		Public UserInfoVO UserInformationInquiry(UserIDVO VO){
		    return v;
		}
		
		//用户信息修改
		Public ResultMsg UserInformationModification(UserIDVO VO1,UserInfoVO VO2){
		    return new ResultMsg(true,"修改成功！");
		}
		
		//增加网络营销人员
		Public ResultMsg WebsiteStuffAdd(UserIDVO VO){
		    return new ResultMsg(true,"添加成功！")；
		}
}