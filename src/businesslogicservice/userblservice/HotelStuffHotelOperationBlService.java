package businesslogicservice.userblservice;

import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import vo.HotelStuffHotelOperationVo vo;


//酒店管理人员对酒店进行操作的接口
public interface HotelStuffHotelOperationBlService{
        
		
		
		
		//查询酒店信息
		Public HotelVo HotelInformationInquiry(HotelIDVo vo);
		
		//修改酒店信息
		Public boolean HotelInformationModification(HotelIDVo vo1,UserIDVo vo2);
		
		//调整酒店策略
		Public boolean HotelStrategeManage(HotelIDVo vo1,HotelStrategeVo vo); 
		
		//更新订单状态
		Public void OrderStateUpdate(UserIDVo vo1,OrderVo vo2);
		
		//酒店订单浏览
		Public ArrayList<OrderVo> OrderScan(HotelIDVo vo);
		
}