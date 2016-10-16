package businesslogicservice.userblservice;

import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import vo.LoginInputVo;


//用户登录信息输入接口
public interface LoginInputBLService{
        
		//登录接口
        Public boolean  LogIn(LoginInputVo vo);
		
		//登出接口
		Public boolean LogOut(LoginInputVo vo);
		
		//注册接口
		Public boolean Register(LoginInputVo vo);
}