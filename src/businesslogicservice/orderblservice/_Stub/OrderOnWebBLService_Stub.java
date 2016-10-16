package businesslogicservice.orderblservice._Stub;

import java.util.ArrayList;

import vo.OrderOnWebVO;
import businesslogic.util.ResultMsg;
import businesslogic.util.OrderMsg;
import businesslogicservice.orderblservice.OrderOnWebBLService;

public class OrderOnWebBLService_Stub implements OrderOnWebBLService{

	@Override
	public ArrayList<OrderOnWebVO> complaintListScan() {
		return new ArrayList<OrderOnWebVO>();
	}
	
	@Override
	public ArrayList<OrderOnWebVO> abnormalOrderScan() {
		return new ArrayList<OrderOnWebVO>();
	}
	
	@Override
	//提交界面得到对处理申诉的反馈结果
	public ResultMsg complaintHandle(OrderOnWebVO orderVO) {
		if(orderVO.getReason().equals("The train I took was late.")
			return new ResultMsg(true,"通过处理");
		else
			return new ResultMsg(false,"申诉失败");
	}
	
	@Override
	//提交界面得到对查看异常订单详情的反馈结果
	public OrderMsg abnormalOrderDetail(OrderOnWebVO orderVO) {
		String name = "txin";
		if(orderVO.getInitiator().equals("txin"))
			return new OrderMsg(true,"显示正确");
		else
			return new OrderMsg(false,"显示不正确");
	}

}
