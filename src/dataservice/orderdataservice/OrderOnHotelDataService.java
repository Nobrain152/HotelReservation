/**
 * ����Ƶ궩��
 * @author txin
 * @date 2016/10/15
 */
package dataservice.orderdataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.OrderOnHotelPO;


public interface OrderOnHotelDataService {
	/**
	 * �����ݿ��в��뵥һ�־û�����
	 */
	public boolean insert(OrderOnHotelPO po) throws RemoteException;
	/**
	 * �����ݿ���ɾ����һ�־û�����
	 */
	public boolean delete(OrderOnHotelPO po) throws RemoteException;
	/**
	 * �����ݿ��и��µ�һ�־û�����
	 */
	public boolean update(OrderOnHotelPO po) throws RemoteException;
	/**
	 * ��������Ϣ���в��ҷ�����Ӧ��OrderOnHotelPO���
	 */
	public OrderOnHotelPO find(String searchInfo) throws RemoteException;
	/**
	 * �������оƵ궩��PO
	 */
	public ArrayList<OrderOnHotelPO> show() throws RemoteException;
}
