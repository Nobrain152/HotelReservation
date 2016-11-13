package businesslogicservice.userblservice;

import po.HotelIDPO;
import vo.HotelInfoVO;
import vo.UserIDVO;



public interface WebManagerHotelOperationBlService{
		
		
		public void HotelAdd(HotelInfoVO vo);
		
	
		public void StuffAdd(HotelIDPO vo1,UserIDVO vo2);
		
}