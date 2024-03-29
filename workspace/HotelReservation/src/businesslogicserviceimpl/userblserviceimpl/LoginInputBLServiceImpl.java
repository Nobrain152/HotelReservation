package businesslogicserviceimpl.userblserviceimpl;

import businesslogicservice.userblservice.LoginInputBLService;
import dataserviceimpl.userdataserviceimpl.UserManagementDataServiceImpl;
import vo.LoginInputVO;


/**
 * 用户登录
 * @author 曹畅
 *
 */
public class LoginInputBLServiceImpl implements LoginInputBLService {

	UserManagementDataServiceImpl data=new UserManagementDataServiceImpl();
	
	
	/**
	 * 登录
	 * @param 登录输入信息VO
	 * @return 登录结果
	 */
    public boolean  LogIn(LoginInputVO vo){
    	String pass=vo.getUserpassword();
    	String real=data.GetLoginInfo(vo);
    	return real.equals(pass);
    	
    }
	
	
    /**
	 * 登出	
	 * @param 登录输入信息VO
	 * @return 登出结果
	 */
	public boolean LogOut(boolean ok){
		if(ok){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	/**
	 * 注册	
	 * @param 登录输入信息VO
	 * @return 注册结果
	 */
	public String Register(LoginInputVO vo){
		return data.AddUser(vo);
	}
}
