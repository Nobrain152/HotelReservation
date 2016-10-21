package businesslogicservice.userservice._stub;

import businesslogic.util.ResultMsg;
import businesslogicservice.CustomerIndividualInformationManagementBLService.BaseDataBuildingBLService;
import VO.CustomerInfoVO;
import VO.UserIDVO;


public class CustomerIndividualInformationManagementBLService_Stub  {
	
	ArrayList<OrderVO> arry;
	HotelInfoVO hot;
	ArrayList<HotelInfoVO> arr;
	 
	public CustomerIndividualInformationManagementBLService_Stub(){
		Order order=new OrderVO();
		array.add(order);
		hot=new HotelInfoVO("电力宾馆","南京","新街口",3,"very nice","空调", false);
		arr=new ArrayList<HotelInfoVO>();
		arr.add(hot);
	} 
    
	Public UserInfoVO IndividualBaseInfolnquiry(UserIDVO VO){
		return new UserIDVO("1234567");
	}
	
	Public ResultMsg IndividualBaseInfoModification(UserIDVO VO1,CustomerInfoVO VO2){
		
		return new ResultMsg(true,"修改成功");
	}
	
	Public ArrayList<OrderVO> IndividualOrderInquiry(UserIDVO VO){
		return array;
	}
	
	Public ArrayList<HotelInfoVO> IndividualHotelInquiry(UserIDVO VO){
		return arr;
	}
	Public int IndividualCredictInquiry(UserIDVO VO){
		return 100;
	}
	
}
