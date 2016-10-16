package dataservice.hoteldataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.RoomInfoPO;

public interface RoomInfoDataService {
	
	/**
	 * 增加
	 */
	public void insert(RoomInfoPO po) throws RemoteException;
	
	
	/**
	 * 删除
	 */
	public void delete(RoomInfoPO po) throws RemoteException;
	
	/**
	 * 更新
	 */
	public void update(RoomInfoPO po) throws RemoteException;
	
	/**
	 * 用名字查找
	 */
	public RoomInfoPO findByName(String name) throwsRemoteException;
	
	/**
	 * 用条件查找
	 */
	public RoomInfoPO findByCondition(String condition) throws RemoteException;
	
	/**
	 * 显示
	 */
	public ArrayList<RoomInfoPO> show() throws RemoteException;




}