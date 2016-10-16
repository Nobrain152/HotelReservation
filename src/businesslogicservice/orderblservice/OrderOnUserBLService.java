package businesslogicservice.orderblservice;

import java.util.ArrayList;
import businesslogic.util.OrderMsg;
import businesslogic.util.ResultMsg;
import vo.OrderOnUserVO;

/**
 * �ͻ���ѯ���˶�����Ϣ�����飬ִ�ж����ĳ���
 * 
 * @author txin
 *
 */
public interface OrderOnUserBLService {
	
	/**
	 * �ͻ��鿴���˶�����Ϣ
	 *
	 * @param void
	 * @return ���˶����б�
	 */
	public ArrayList<OrderOnUserVO> personalOrderScan();
	
	/**
	 * �ͻ��������˶���
	 *
	 * @param orderVO ����VO
	 * @return ϵͳ��ʾ��Ϣ
	 */
	public ResultMsg personalOrderCancel(OrderOnUserVO orderVO);
	
	/**
	 * �ͻ��鿴���˶�������
	 *
	 * @param void
	 * @return ���˶�������
	 */
	public OrderMsg personalOrderDetail(OrderOnUserVO orderVO);
	
}