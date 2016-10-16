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
	//�ύ����õ��Դ������ߵķ������
	public ResultMsg complaintHandle(OrderOnWebVO orderVO) {
		if(orderVO.getReason().equals("The train I took was late.")
			return new ResultMsg(true,"ͨ������");
		else
			return new ResultMsg(false,"����ʧ��");
	}
	
	@Override
	//�ύ����õ��Բ鿴�쳣��������ķ������
	public OrderMsg abnormalOrderDetail(OrderOnWebVO orderVO) {
		String name = "txin";
		if(orderVO.getInitiator().equals("txin"))
			return new OrderMsg(true,"��ʾ��ȷ");
		else
			return new OrderMsg(false,"��ʾ����ȷ");
	}

}
