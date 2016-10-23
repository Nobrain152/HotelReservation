package dataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.PromotionHotelPO;

/**
 * �Ƶ�Ӫ�����Ե����ݲ�ӿ�
 * @author kevin
 *
 */

public interface PromotionHotelDataService {
	public void insert(PromotionHotelPO Promotion) throws RemoteException;
	
	public void delete(PromotionHotelPO Promotion) throws RemoteException;
	
	public void update(PromotionHotelPO Promotion) throws RemoteException;
	
	public PromotionHotelPO findByLevel(String name) throws RemoteException;
	
	public ArrayList<PromotionHotelPO> show() throws RemoteException;
	
	
}