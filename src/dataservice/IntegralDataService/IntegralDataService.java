package dataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.IntegralPO;

/**
 * ����ֵ���ݲ�Ľӿ�
 * @author T5-SK
 *
 */

public interface IntegralDataService {
	public void insert(IntegralPO integral) throws RemoteException;
	
	public void delete(IntegralPO integral) throws RemoteException;
	
	public void update(IntegralPO Integral) throws RemoteException;
	
	public IntegralPO findByLevel(String name) throws RemoteException;
	
	public ArrayList<IntegralPO> show() throws RemoteException;
}
