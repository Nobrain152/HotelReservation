package businesslogicservice.userblservice;

import java.util.ArrayList;

import businesslogic.util.ResultMsg;
import vo.HotelConditionVO;
import vo.HotelEvaluateVO;
import vo.HotelIDVO;
import vo.HotelInfoVO;
import vo.OrderOnUserVO;




public interface CustomerHotelOperationBlService{
        
		
		
		
		public ArrayList<HotelInfoVO> HotelSearch(HotelConditionVO vo);
		
		
		public ResultMsg OederCreat(HotelIDVO vo1,OrderOnUserVO vo2);
		
		
		public void HotelEvaluate(HotelEvaluateVO vo);
		
	
		public void MemberRegisterApply(HotelIDVO vo1,MemberVO vo2);
		
		
		
		
}