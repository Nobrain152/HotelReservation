package businesslogicservice.orderblservice._Stub;

import java.util.ArrayList;

import vo.OrderOnUserVO;
import businesslogic.util.OrderState;
import businesslogic.util.ResultMsg;
import businesslogic.util.OrderMsg;
import businesslogicservice.orderblservice.OrderOnUserBLService;

public class OrderOnUserBLService_Stub implements OrderOnUserBLService{

	OrderState orderState;

	public OrderOnUserBLService_Stub(){

	}
	
	public OrderOnUserBLService_Stub(OrderState orderState) {
		super();
		this.orderState = orderState;
	}
	
	@Override
	public ArrayList<OrderOnUserVO> personalOrderScan() {
		return new ArrayList<OrderOnUserVO>();
	}
	
	@Override
	//提交界面得到对撤销订单的反馈结果
	public ResultMsg personalOrderCancel(OrderOnUserVO orderVO) {
		if(orderVO.getOrderState() == OrderState.CANCELLED))
			return new ResultMsg(true,"撤销成功");
		else
			return new ResultMsg(false,"撤销失败");
	}
	
	@Override
	//提交界面得到对查看个人订单详情的反馈结果
	public OrderMsg personalOrderDetail(OrderOnUserVO orderVO) {
		String name = "txin";
		if(orderVO.getInitiator().equals("txin"))
			return new OrderMsg(true,"显示正确");
		else
			return new OrderMsg(false,"显示不正确");
	}

}
