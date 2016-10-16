package businesslogicservice.orderblservice._Driver;

import java.util.ArrayList;

import businesslogic.util.ResultMsg;
import businesslogic.util.OrderMsg;
import businesslogicservice.orderblservice.OrderOnWebBLService;
import businesslogicservice.orderblservice._Stub.OrderOnWebBLService_Stub;
import vo.OrderOnWebVO;

public class OrderOnWebBLService_Driver {
	
	public static void main(String[] args){
		OrderOnWebBLService a = new OrderOnWebBLService_Stub();
		OrderOnWebBLService_Driver driver = new OrderOnWebBLService_Driver();
		driver.drive(a);
	}
	
	public void drive(OrderOnWebBLService OrderOnWebBLService){
		OrderOnWebVO orderVO = new OrderOnWebVO("txin",OrderState.EXECUTED,"The train I took was late.",
        		"2016-10-15 24:00",RoomType.ROOM_STANDARD,1,1,false); 
				
		ResultMsg result = OrderOnWebBLService.complaintHandle(orderVO);
		if(result.isPass() == true)
			System.out.println("ÉêËßÍ¨¹ý");
		else
			System.out.println("ÉêËß²»Í¨¹ý");
		
		OrderMsg msg1 = OrderOnWebBLService.abnormalOrderDetail(orderVO);
		if(msg1.isPass() == true)
			System.out.println("ÏÔÊ¾Òì³£¶©µ¥ÏêÇé");
		else
			System.out.println("ÏÔÊ¾Ê§°Ü");
		
		ArrayList<OrderOnWebVO> arr = OrderOnWebBLService.complaintListScan();
		if(arr != null)
			System.out.println("ÏÔÊ¾ÉêËßÁÐ±í");
		else
			System.out,println("ÏÔÊ¾Ê§°Ü");
		
		ArrayList<OrderOnWebVO> arr = OrderOnWebBLService.abnormalOrderScan();
		if(arr != null)
			System.out.println("ÏÔÊ¾Òì³£¶©µ¥ÁÐ±í");
		else
			System.out,println("ÏÔÊ¾Ê§°Ü");
	}
}
