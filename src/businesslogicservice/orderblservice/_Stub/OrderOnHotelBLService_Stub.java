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
	//�ύ����õ��޸Ķ���״̬�ķ������
	public ResultMsg hotelOrderModify(OrderOnHotelVO orderVO) {
		if(orderVO.getOrderState() != OrderState.UNEXECUTED))
			return new ResultMsg(true,"�޸ĳɹ�");
		else
			return new ResultMsg(false,"�޸�ʧ��");
	}
	
	@Override
	//�ύ����õ��Բ鿴�Ƶ궩������ķ������
	public OrderMsg hotelOrderDetail(OrderOnHotelVO orderVO) {
		String name = "txin";
		if(orderVO.getInitiator().equals("txin"))
			return new OrderMsg(true,"��ʾ��ȷ");
		else
			return new OrderMsg(false,"��ʾ����ȷ");
	}

}
