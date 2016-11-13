package businesslogicservice.userblservice;

import java.util.ArrayList;
import vo.UserIDVO;
import vo.UserInfoVO;



//网站管理人员对网站进行操作的接口
public interface WebManagerWebsiteManagementBLService{
        
		
		
		//用户信息查询
		public UserInfoVO UserInformationInquiry(UserIDVO vo);
		
		//用户信息修改
		public boolean UserInformationModification(UserIDVO vo1,UserInfoVO vo2);
		
		//增加网络营销人员
		public void WebsiteStuffAdd(UserIDVO vo);
		
}