package dataservice.userdataservice;

public interface UserManagementDataService{
        
		
		
		
		
		public String GetLoginInfo(UserManagementPo po);
		
		
		public String AddUser(UserManagementPo po);
		
		
		public UserVO GetUserBaseInfo(UserManagementPo po);
		
		
		public boolean SetUserBaseInfo(UserManagementPo po);
		
}