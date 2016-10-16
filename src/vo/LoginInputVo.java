package vo;



public class LoginInputVo{

    private String userid;
	
	private String userpassword;
	
	public LoginInputVo(String userid,String userpassword){
	    this.userid=userid;
		this.userpassword=userpassword;
	}
	
	public String getUserid(){
	    return userid;
	}
	
	public String getUserpassword(){
	    return userpassword;
	}
}