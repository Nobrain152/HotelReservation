package businesslogicserviceimpl.userblserviceimpl;

import vo.UserIDVO;
import vo.UserInfoVO;
import dataservice.userdataservice.UserManagementDataServiceImp;

public class WebManagerWebsiteManagementBLServiceImpl implements WebManagerWebsiteManagementBLService {

	UserManagementDataServiceImpl check;
	
	public WebManagerWebsiteManagementBLServiceImpl(){
		check=new 	UserManagementDataServiceImpl();
	}
	
	public UserInfoVO UserInformationInquiry(UserIDVO vo){
		return check.GetUserBaseInfo(vo);
	}
			
	
	public boolean UserInformationModification(UserIDVO vo1,UserInfoVO vo2){
		return check.SetUserBaseInfo(vo1,vo2);
	}
			
	
	public void WebsiteStuffAdd(UserIDVO vo){
		return check.addWebStuff(vo);
	}
}
