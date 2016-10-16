package businesslogicservice.orderblservice._Driver;

import java.util.ArrayList;

import businesslogic.util.ResultMsg;
import businesslogic.util.OrderMsg;
import businesslogicservice.orderblservice.OrderOnHotelBLService;
import businesslogicservice.orderblservice._Stub.OrderOnHotelBLService_Stub;
import vo.OrderOnHotelVO;

public class OrderOnHotelBLService_Driver {
	
	public static void main(String[] args){
		OrderOnHotelBLService a = new OrderOnHotelBLService_Stub();
		OrderOnHotelBLService_Driver driver=new OrderOnHotelBLService_Driver();
		driver.drive(a);
	}
	
	public void drive(OrderOnHotelBLService OrderOnHotelBLService){
		OrderOnHotelVO orderVO = new OrderOnHotelVO("txin",OrderState.EXECUTED,"2016-10-15 12:00","2016-10-16 12:00",
        		"2016-10-15 24:00",RoomType.ROOM_STANDARD,1,1,false); 
				
		ResultMsg result = OrderOnHotelBLService.hotelOrderModify(orderVO);
		if(result.isPass() == true)
			System.out.println("�޸Ķ���״̬�ɹ�");
		else
			System.out.println("�޸�ʧ��");
		
		OrderMsg msg1 = OrderOnHotelBLService.hotelOrderDetail(orderVO);
		if(msg1.isPass() == true)
			System.out.println("��ʾ�Ƶ궩������");
		else
			System.out.println("��ʾʧ��");
		
		ArrayList<OrderOnHotelVO> arr = OrderOnHotelBLService.personalOrderScan();
		if(arr != null)
			System.out.println("��ʾ�Ƶ궩���б�");
		else
			System.out,println("��ʾʧ��");
	}
}
