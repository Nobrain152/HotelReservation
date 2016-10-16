package businesslogicservice.userblservice;

import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import businesslogic.util.OrderState;
import vo.IndividualInformationManagementVo;



//用户个人信息管理接口
public IndividualInformationManagementBLService{
        
		
		//个人基本信息查询接口
		Public UserInfoVo IndividualBaseInfolnquiry(IndividualInformationManagementVo vo);
		
		//个人信息修改接口
		Public boolean IndividualBaseInfoModification(IndividualInformationManagementVo vo);
		
		//个人订单查询接口
		Public ArrayList<OrderVo> IndividualOrderInquiry(IndividualInformationManagementVo vo);
		
		//用户个人预定过的酒店查询接口
		Public ArrayList<HotelVo> IndividualHotelInquiry(IndividualInformationManagementVo vo);
		
		//用户个人信用度查询接口
		Public CreditVo IndividualCredictInquiry(IndividualInformationManagementVo vo);
		
		
		
}