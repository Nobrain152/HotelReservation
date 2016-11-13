package businesslogicservice.userblservice;

import java.util.ArrayList;
import businesslogic.util.MemberType;
import businesslogic.util.OrderState;
import vo.CustomerInfoVO;
import vo.HotelInfoVO;
import vo.OrderOnUserVO;
import vo.UserIDVO;
import vo.UserInfoVO;
import vo.IntegralVO;



//客户个人信息管理接口
public interface CustomerIndividualInformationManagementBLService{
        
		
		//客户个人基本信息查询接口
		public UserInfoVO IndividualBaseInfolnquiry(UserIDVO vo);
		
		//客户个人信息修改接口
		public boolean IndividualBaseInfoModification(UserIDVO vo1,CustomerInfoVO vo2);
		
		//客户个人订单查询接口
		public ArrayList<OrderOnUserVO> IndividualOrderInquiry(UserIDVO vo);
		
		//客户个人预定过的酒店查询接口
		public ArrayList<HotelInfoVO> IndividualHotelInquiry(UserIDVO vo);
		
		//客户个人信用度查询接口
		public IntegralVO IndividualCredictInquiry(UserIDVO vo);
		
		
		
}