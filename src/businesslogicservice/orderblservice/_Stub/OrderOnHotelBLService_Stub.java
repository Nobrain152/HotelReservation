package businesslogicservice.orderblservice._Stub;

import java.util.ArrayList;

import vo.OrderOnHotelVO;
import businesslogic.util.OrderState;
import businesslogic.util.ResultMsg;
import businesslogic.util.OrderMsg;
import businesslogicservice.orderblservice.OrderOnHotelBLService;

public class OrderOnHotelBLService_Stub implements OrderOnHotelBLService{
	OrderState orderState;

	public OrderOnUserBLService_Stub(){

	}
	
	public OrderOnUserBLService_Stub(OrderState orderState) {
		super();
		this.orderState = orderState;
	}
	
	@Override
	public ArrayList<OrderOnHotelVO> hotelOrderScan() {
		return new ArrayList<OrderOnHotelVO>();
	}
	
	@Override
	//提交界面得到修改订单状态的反馈结果
	public ResultMsg hotelOrderModify(OrderOnHotelVO orderVO) {
		if(orderVO.getOrderState() != OrderState.UNEXECUTED))
			return new ResultMsg(true,"修改成功");
		else
			return new ResultMsg(false,"修改失败");
	}
	
	@Override
	//提交界面得到对查看酒店订单详情的反馈结果
	public OrderMsg hotelOrderDetail(OrderOnHotelVO orderVO) {
		String name = "txin";
		if(orderVO.getInitiator().equals("txin"))
			return new OrderMsg(true,"显示正确");
		else
			return new OrderMsg(false,"显示不正确");
	}

}
