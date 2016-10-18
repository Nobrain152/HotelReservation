package businesslogicservice.userservice._stub;

import java.until.ArrayList<>;
import VO.UserIDVO;
import VO.WebInfoVO;

public class WebIndividualInformationManagementBLService_Stub {
    
	WebInfoVO v=new WebInfoVO("1234569","Jerry","1234567890");
	
	Public WebInfoVO IndividualBaseInfolnquiry(UserIDVO VO){
	    return v;
	}
	
	Public ResultMsg IndividualBaseInfoModification(UserIDVO VO1,WebInfoVO VO2){
	    return new ResultMsg(true,"修改成功");
	}
}