package businesslogicserviceimpl.userblserviceimpl;

import businesslogicservice.userblservice.LoginInputBLService;
import vo.LoginInputVO;

public class LoginInputBLServiceImpl implements LoginInputBLService {

	UserManagementDataServiceImpl data=new UserManagementDataServiceImpl();
	
    public boolean  LogIn(LoginInputVO vo){
    	String name=vo.getUserid();
    	String pass=vo.getUserpassword();
    	String real=data.GetLoginInfo(name);
    	return real.equals(pass);
    	
    }
	
	
	public boolean LogOut(LoginInputVO vo){
		
	}
	
	
	public String Register(LoginInputVO vo){
		return data.AddUser(vo);
	}
}
