package dataservice.PromotionDataService;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.PromotionHotelPO;

/**
 * ��վ�������Ե����ݲ�ӿ�
 * @author T5-SK
 *
 */

public interface PromotionWebDataService {
	public void insert(PromotionHotelPO Promotion) throws RemoteException;
	
	public void delete(PromotionHotelPO Promotion) throws RemoteException;
	
	public void update(PromotionHotelPO Promotion) throws RemoteException;
	
	public PromotionHotelPO findByLevel(String name) throws RemoteException;
	
	public ArrayList<PromotionHotelPO> show() throws RemoteException;
	
}
