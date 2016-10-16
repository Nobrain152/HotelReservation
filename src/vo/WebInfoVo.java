package vo;



public class WebInfoVo extends UserInfoVo{
    
	
	    
		
		
		public WebInfoVo(String userid,String username,String contact){
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