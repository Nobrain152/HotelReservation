package dataservice.hoteldataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.HotelInfoPO;

public interface HotelInfoDataService {
	
	/**
	 * ����
	 */
	public void insert(HotelInfoPO po) throws RemoteException;
	
	
	/**
	 * ɾ��
	 */
	public void delete(HotelInfoPO po) throws RemoteException;
	
	/**
	 * ����
	 */
	public void update(HotelInfoPO po) throws RemoteException;
	
	/**
	 * �����ֲ���
	 */
	public HotelInfoPO findByName(String name) throws RemoteException;
	
	/**
	 * ����������
	 */
	public HotelInfoPO findByCondition(String condition) throws RemoteException;
	
	/**
	 * ��ʾ
	 */
	public ArrayList<HotelInfoPO> show() throws RemoteException;




}