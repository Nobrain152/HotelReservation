package dataservice.userdataservice;

import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import po.UserManagementPo;


//用户信息数据接口
public interface UserManagementDataService{
        
		
		
		
		//得到登录信息
		Public String GetLoginInfo(UserManagementPo po);
		
		//注册新用户
		Public String AddUser(UserManagementPo po);
		
		//得到用户基本信息
		Public UserVo GetUserBaseInfo(UserManagementPo po);
		
		//修改用户基本信息
		Public boolean SetUserBaseInfo(UserManagementPo po);
		
}