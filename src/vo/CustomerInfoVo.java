package vo;

public class CustomerInfoVO extends UserInfoVO{
		
		Private int credit;
		
		public CustomerInfoVO(String userid,String username,String contact,int credit){
		    this.userid=userid;
			this.username=username;
			this.ucontact=contact;
			this.credit=credit;
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
		
		public int getCredit(){
		    return credit;
		}
}