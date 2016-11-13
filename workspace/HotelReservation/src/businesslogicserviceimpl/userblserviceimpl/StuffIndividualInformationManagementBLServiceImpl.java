package businesslogicserviceimpl.userblserviceimpl;

import vo.StuffInfoVO;
import vo.UserIDVO;
import vo.UserInfoVO;
import dataservice.userdataservice.UserManagementDataService;

public class StuffIndividualInformationManagementBLServiceImpl implements StuffIndividualInformationManagementBLService {

	UserInfoVO voi;
	UserManagementDataServiceImpl user;
	
	public StuffIndividualInformationManagementBLServiceImpl(UserIDVO vo){
		user=new UserManagementDataServiceImpl();
		voi=user.GetUserBaseInfo(vo);
	}
	
	public StuffInfoVO IndividualBaseInfolnquiry(UserIDVO vo){
		return (StuffInfoVO)voi;
	}
			
	
	public boolean IndividualBaseInfoModification(UserIDVO vo1,StuffInfoVO vo2){
		return user.SetUserBaseInfo(vo1,vo2);
	}
			
}
