package businesslogicservice.userblservice;

import java.until.ArrayList<>;
import vo.HotelVo;
import vo.UserIDVo;


//网站管理人员对酒店进行操作的接口
public interface WebManagerHotelOperationBlService{
        
		
		
		
		//增加酒店
		Public void HotelAdd(HotelVo vo);
		
		//增加酒店管理人员
		Public void StuffAdd(HotelIDVo vo1,UserIDVo vo2);
		
}