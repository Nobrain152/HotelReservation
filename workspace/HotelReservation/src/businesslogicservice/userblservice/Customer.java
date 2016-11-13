package businesslogicservice.userblservice;

import java.util.ArrayList;

import businesslogicserviceimpl.userblserviceimpl.CustomerHotelOperationBLServoceImpl;
import businesslogicserviceimpl.userblserviceimpl.CustomerIndividualInformationManagementBLServiceImp;
import vo.CustomerInfoVO;
import vo.HotelInfoVO;
import vo.IntegralVO;
import vo.OrderOnUserVO;
import vo.UserIDVO;

public class Customer  {

	CustomerInfoVO infomation;
	CustomerIndividualInformationManagementBLServiceImp in;
	CustomerHotelOperationBLServoceImpl hotel;
	UserIDVO idvo;
	
	public Customer(String id){
		idvo=new UserIDVO(id);
		in=new CustomerIndividualInformationManagementBLServiceImp(idvo);
		hotel=new CustomerHotelOperationBLServoceImpl(id);
		infomation=(CustomerInfoVO)in.IndividualBaseInfolnquiry(idvo);
	}
	
	
	public boolean BaseInfoModification(CustomerInfoVO vo2){
		return in.IndividualBaseInfoModification(idvo,vo2);
	}
				
	
	public ArrayList<OrderOnUserVO> OrderInquiry(){
		return in.orderVOs;
	}
				
   
	public ArrayList<HotelInfoVO> HotelInquiry(){
		return in.hotelInfoVOs;
	}
				
	
	public IntegralVO IndividualCredictInquiry(){
		return in.integralVO;
	}
	
	public String getid(){
		return infomation.getUserid();
	}
	
	public String getname(){
		return infomation.getUsername();
	}
	
	public String getcontact(){
	    return infomation.getContact();
	}
}
