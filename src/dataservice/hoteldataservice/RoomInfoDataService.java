package dataservice.hoteldataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.RoomInfoPO;

public interface RoomInfoDataService {
	
	/**
	 * ����
	 */
	public void insert(RoomInfoPO po) throws RemoteException;
	
	
	/**
	 * ɾ��
	 */
	public void delete(RoomInfoPO po) throws RemoteException;
	
	/**
	 * ����
	 */
	public void update(RoomInfoPO po) throws RemoteException;
	
	/**
	 * �����ֲ���
	 */
	public RoomInfoPO findByName(String name) throwsRemoteException;
	
	/**
	 * ����������
	 */
	public RoomInfoPO findByCondition(String condition) throws RemoteException;
	
	/**
	 * ��ʾ
	 */
	public ArrayList<RoomInfoPO> show() throws RemoteException;




}