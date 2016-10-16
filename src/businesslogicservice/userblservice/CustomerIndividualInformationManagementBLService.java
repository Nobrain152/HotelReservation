package businesslogicservice.userblservice;

import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import businesslogic.util.OrderState;
import vo.CustomerInfoVo;
import vo.UserIDVo;



//客户个人信息管理接口
public CustomerIndividualInformationManagementBLService{
        
		
		//客户个人基本信息查询接口
		Public UserInfoVo IndividualBaseInfolnquiry(UserIDVo vo);
		
		//客户个人信息修改接口
		Public boolean IndividualBaseInfoModification(UserIDVo vo1,CustomerInfoVo vo2);
		
		//客户个人订单查询接口
		Public ArrayList<OrderVo> IndividualOrderInquiry(UserIDVo vo);
		
		//客户个人预定过的酒店查询接口
		Public ArrayList<HotelVo> IndividualHotelInquiry(UserIDVo vo);
		
		//客户个人信用度查询接口
		Public CreditVo IndividualCredictInquiry(UserIDVo vo);
		
		
		
}