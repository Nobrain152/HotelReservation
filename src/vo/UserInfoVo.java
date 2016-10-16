package vo;


public class UserInfoVo{
    
	private String userid;
	
	private String username;
	
	private String contact;
	
	
	
	public UserInfoVo(String userid,String username,String contact){
		    this.userid=userid;
			this.username=username;
			this.ucontact=contact;
	}
	
	
	    public String getUserid(){
		    return userid;
		}
		
		public String getUsername(){
		    return username;
		}
		
		public String getContact(){
		    return contact;
		}
}