package businesslogicservice.UserBLService._Driver;

import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import VO.LoginInputVO;

import java.util.ArrayList;
import businesslogic.util.ResultMsg;
import businesslogicservice.UserBLService.LoginInputBLService;
import businesslogicservice.UserBLService._Stub.LoginInputBLService_Stub;
import vo.OrderOnHotelVO;

public class LoginInputBLService_Driver {
	
	public static void main(String[] args){
		LoginInputBLService a = new LoginInputBLService_Stub();
		LoginInputBLService driver=new LoginInputBLService();
		driver.drive(a);
	}
	
	public void drive(LoginInputBLService LoginInputBLService){
		LoginInputVO v=new LoginInputVO("1234567","1234567");
				
		
		OrderMsg msg1 = LoginInputBLService.LogIn(v);
		if(msg1.isPass() == true)
			System.out.println("登录成功");
		else
			System.out.println("登录失败");
			
		OrderMsg msg2 = LoginInputBLService.LogOut(v);
		if(msg1.isPass() == true)
			System.out.println("登出成功");
		else
			System.out.println("登出失败");
		
		OrderMsg msg3 = LoginInputBLService.Register(v);
		if(msg1.isPass() == true)
			System.out.println("注册成功");
		else
			System.out.println("注册失败");
		
	}
}
