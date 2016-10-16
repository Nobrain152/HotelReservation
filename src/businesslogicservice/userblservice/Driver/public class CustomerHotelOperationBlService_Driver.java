package businesslogicservice.UserBLService._Driver;

import java.util.ArrayList;
import businesslogic.util.ResultMsg;
import businesslogicservice.UserBLService.CustomerHotelOperationBlService;
import businesslogicservice.UserBLService._Stub.CustomerHotelOperationBlService_Stub;
import vo.OrderOnHotelVO;

public class CustomerHotelOperationBlService_Driver {
	
	public static void main(String[] args){
		CustomerHotelOperationBlService a = new CustomerHotelOperationBlService_Stub();
		CustomerHotelOperationBlService driver=new CustomerHotelOperationBlService();
		driver.drive(a);
	}
	
	public void drive(CustomerHotelOperationBlService CustomerHotelOperationBlService){
		HotelConditionVO ho;
	    int[] checkIn;
	    int[] checkOut;
	    int[] mark;
	    HotelInfoVO hot;
	    ArrayList<HotelInfoVO> arr;
		checkIn={2016,11,22};
		checkOut={2016,11,24};
		mark={60,80};
		ho=new HotelConditongVO(ADD_NANJING,BUS_XINJIEKOU,null,ROOM_BIGBED,600,200,checkIn,checkOut,3,mark);
		hot=new HotelInfoVO("电力宾馆","南京","新街口",3,"very nice","空调", false);
		arr=new ArrayList<HotelInfoVO>();
		arr.add(hot);
		HotelIDVO v=new HotelIDVO("12345671");
		OrderOnHotelVO orderVO = new OrderOnHotelVO("txin",OrderState.EXECUTED,"2016-10-15 12:00","2016-10-16 12:00",
        		"2016-10-15 24:00",RoomType.ROOM_STANDARD,1,1,false); 
				
		HotelSearch ArrayList<HotelInfoVO> result = CustomerHotelOperationBlService.HotelSearch(ho);
		if(result!=null)
			System.out.println("显示酒店");
		else
			System.out.println("没有符合条件的酒店");
		
		OrderMsg msg1 = CustomerHotelOperationBlService.OederCreat(v,orderVO);
		if(msg1.isPass() == true)
			System.out.println("预订成功");
		else
			System.out.println("预定失败");
		
		
	}
}
