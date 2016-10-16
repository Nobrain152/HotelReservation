package businesslogicservice.userblservice;

import java.until.ArrayList<>;
import vo.UserIDVo;
import vo.UserInfoVo;



//网站管理人员对网站进行操作的接口
public interface WebManagerWebsiteManagementBLService{
        
		
		
		//用户信息查询
		Public UserVo UserInformationInquiry(UserIDVo vo);
		
		//用户信息修改
		Public boolean UserInformationModification(UserIDVo vo1,UserInfoVo vo2);
		
		//增加网络营销人员
		Public void WebsiteStuffAdd(UserIDVo vo);
		
}