package po;

import java.io.Serializable;

public class WebInfoPo implements Serializable{

    
	private static final long serialVersionUID = -7187002330817151504L;
	
	
		
	public WebInfoPo(String userid,String username,String contact){
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