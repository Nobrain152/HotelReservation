package businesslogicservice.userblservice;

import java.util.ArrayList;
import businesslogic.util.MemberType;
import vo.LoginInputVO;


//用户登录信息输入接口
public interface LoginInputBLService{
        
		//登录接口
        public boolean  LogIn(LoginInputVO vo);
		
		//登出接口
		public boolean LogOut(LoginInputVO vo);
		
		//注册接口
		public boolean Register(LoginInputVO vo);
}