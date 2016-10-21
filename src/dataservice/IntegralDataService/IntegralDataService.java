package dataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.IntegralPO;

/**
 * 信用值数据层的接口
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
