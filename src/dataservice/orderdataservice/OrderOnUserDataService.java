/**
 * �����ͻ�����
 * @author txin
 * @date 2016/10/15
 */
package dataservice.orderdataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.OrderOnUserPO;


public interface OrderOnUserDataService {
	/**
	 * �����ݿ��в��뵥һ�־û�����
	 */
	public boolean insert(OrderOnUserPO po) throws RemoteException;
	/**
	 * �����ݿ���ɾ����һ�־û�����
	 */
	public boolean delete(OrderOnUserPO po) throws RemoteException;
	/**
	 * �����ݿ��и��µ�һ�־û�����
	 */
	public boolean update(OrderOnUserPO po) throws RemoteException;
	/**
	 * �����ֽ��в��ҷ�����Ӧ��OrderOnUserPO���
	 */
	public OrderOnUserPO findByName(String name) throws RemoteException;
	/**
	 * ���������в��ҷ�����Ӧ��OrderOnUserPO���
	 */
	public ArrayList<OrderOnUserPO> findByContion(String condition) throws RemoteException;
	/**
	 * �������пͻ�����PO
	 */
	public ArrayList<OrderOnUserPO> show() throws RemoteException;
}