package vo;

import org.omg.CORBA.FloatHolder;

public class CustomerInfoVO extends UserInfoVO{
		
		private int credit;
		String userid;
		String username;
		String contact;
		boolean isMember;
		
		public CustomerInfoVO(String userid,String username,String contact,int credit){
		    super(userid, username, contact);
			this.credit=credit;
			isMember=false;
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
		
		public boolean isMember(){
			return isMember;
		}
}