package businesslogicserviceimpl.userblserviceimpl;

import java.util.ArrayList;

import businesslogicservice.userblservice.CustomerIndividualInformationManagementBLService;
import vo.CustomerInfoVO;
import vo.HotelInfoVO;
import vo.IntegralVO;
import vo.OrderOnUserVO;
import vo.UserIDVO;
import vo.UserInfoVO;

public class CustomerIndividualInformationManagementBLServiceImp
		implements CustomerIndividualInformationManagementBLService {
	
	UserInfoVO userInfoVO;
	ArrayList<OrderOnUserVO> orderVOs;
	ArrayList<HotelInfoVO> hotelInfoVOs;
	IntegralVO integralVO;
	UserManagementDataServiceImp usermanage;
	CustomerManagementDataServiceImp customermanage;
	IntegerBLserviceImp integral;
	
	public CustomerIndividualInformationManagementBLServiceImp(UserIDVO vo){
		usermanage=new UserManagementDataServiceImp(vo);
		customermanage=new CustomerManagementDataServiceImp(vo);
		integral=new IntegerBLserviceImp();
		userInfoVO=usermanage.GetUserBaseInfo(vo);
		orderVOs=customermanage.GetCustomerOrders(vo);
		hotelInfoVOs=customermanage.GetCustomerHotel(vo);
		integralVO=integral.getIntegral(vo);
		
	}
	
	
	
	public UserInfoVO IndividualBaseInfolnquiry(UserIDVO vo){
		return userInfoVO;
	}
			
	
	public boolean IndividualBaseInfoModification(UserIDVO vo1,CustomerInfoVO vo2){
		return usermanage.SetUserBaseInfo(vo1,vo2);
	}
			
	
	public ArrayList<OrderOnUserVO> IndividualOrderInquiry(UserIDVO vo){
		return orderVOs;
	}
			
	
	public ArrayList<HotelInfoVO> IndividualHotelInquiry(UserIDVO vo){
		return hotelInfoVOs;
	}
			
	
	public IntegralVO IndividualCredictInquiry(UserIDVO vo){
		return 	integralVO;
	}
			
}
