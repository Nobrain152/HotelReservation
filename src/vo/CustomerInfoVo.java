package vo;



public class CustomerInfoVo extends UserInfoVo{

		
		Private int credit;
		
		public CustomerInfoVo(String userid,String username,String contact,int credit){
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