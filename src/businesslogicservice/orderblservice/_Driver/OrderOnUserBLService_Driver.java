package businesslogicservice.orderblservice._Driver;

import java.util.ArrayList;

import businesslogic.util.ResultMsg;
import businesslogic.util.OrderMsg;
import businesslogicservice.orderblservice.OrderOnUserBLService;
import businesslogicservice.orderblservice._Stub.OrderOnUserBLService_Stub;
import vo.OrderOnUserVO;

public class OrderOnUserBLService_Driver {
	
	public static void main(String[] args){
		OrderOnUserBLService a = new OrderOnUserBLService_Stub();
		OrderOnUserBLService_Driver driver = new OrderOnUserBLService_Driver();
		driver.drive(a);
	}
	
	public void drive(OrderOnUserBLService OrderOnUserBLService){
		OrderOnUserVO orderVO = new OrderOnUserVO("txin",OrderState.EXECUTED,"2016-10-15 12:00","2016-10-16 12:00",
        		"2016-10-15 24:00",RoomType.ROOM_STANDARD,1,1,false); 
				
		ResultMsg result = OrderOnUserBLService.personalOrderCancel(orderVO);
		if(result.isPass() == true)
			System.out.println("撤销订单成功");
		else
			System.out.println("撤销订单失败");
		
		OrderMsg msg1 = OrderOnUserBLService.personalOrderDetail(orderVO);
		if(msg1.isPass() == true)
			System.out.println("显示个人订单详情");
		else
			System.out.println("显示失败");
		
		ArrayList<OrderOnUserVO> arr = OrderOnUserBLService.personalOrderScan();
		if(arr != null)
			System.out.println("显示个人订单列表");
		else
			System.out,println("显示失败");
	}
}
