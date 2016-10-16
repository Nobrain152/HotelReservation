package businesslogicservice.userblservice;

import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import vo.HotelConditionVo;
import vo.HotelIDVo;
import vo.OrderVo;
import vo.HotelEvaluateVo;
import vo.MemberVo;



//客户对酒店进行操作的接口
public interface CustomerHotelOperationBlService{
        
		
		
		//查询酒店
		Public ArrayList HotelSearch<HotelVo>(HotelConditionVo vo);
		
		//预定酒店
		Public boolean OederCreat(HotelIDVo vo1,OrderVo vo2);
		
		//评价酒店
		Public void HotelEvaluate(HotelEvaluateVo vo)
		
		//申请酒店会员
		Public void MemberRegisterApply(HotelIDVo vo1,MemberVo vo2);
		
		//查询酒店详细信息
		Public HotelVo HotelInformationInquiry(HotelIDVo vo);
		
		
}