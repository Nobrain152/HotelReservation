package vo;

import vo.util.HotelIDVo;



public class StuffInfoVo extends UserInfoVo{
    
	
	    private String userid;
		
		private String username;
		
		private String contact;
		
		private HotelIDVo hotelvo;
		
		
		public StuffInfoVo(String userid,String username,String contact,HotelIDVo vo){
		    this.userid=userid;
			this.username=username;
			this.ucontact=contact;
			this.hotelvo=vo;
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
		
		public HotelIDVo getHotel(){
			return hotelvo;
		}
		
		
}