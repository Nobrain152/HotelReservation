package businesslogicservice.userservice._stub;

import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import VO.LoginInputVO;

public class LoginInputBLService_Stub{
    
	Public ResultMsg  LogIn(LoginInputVO VO){
	    return new ResultMsg(true,"登陆成功！")；
	}
		
	Public ResultMsg LogOut(LoginInputVO VO){
	    return new ResultMsg(true,"已退出账号！")；
	}
		
	Public ResultMsg Register(LoginInputVO VO){
	    return new ResultMsg(true,"注册成功，请登录！")；
	}

}  