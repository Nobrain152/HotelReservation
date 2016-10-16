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
	//�ύ����õ��Գ��������ķ������
	public ResultMsg personalOrderCancel(OrderOnUserVO orderVO) {
		if(orderVO.getOrderState() == OrderState.CANCELLED))
			return new ResultMsg(true,"�����ɹ�");
		else
			return new ResultMsg(false,"����ʧ��");
	}
	
	@Override
	//�ύ����õ��Բ鿴���˶�������ķ������
	public OrderMsg personalOrderDetail(OrderOnUserVO orderVO) {
		String name = "txin";
		if(orderVO.getInitiator().equals("txin"))
			return new OrderMsg(true,"��ʾ��ȷ");
		else
			return new OrderMsg(false,"��ʾ����ȷ");
	}

}
