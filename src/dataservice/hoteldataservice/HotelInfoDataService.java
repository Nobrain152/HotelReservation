package dataservice.hoteldataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.HotelInfoPO;

public interface HotelInfoDataService {
	
	/**
	 * 增加
	 */
	public void insert(HotelInfoPO po) throws RemoteException;
	
	
	/**
	 * 删除
	 */
	public void delete(HotelInfoPO po) throws RemoteException;
	
	/**
	 * 更新
	 */
	public void update(HotelInfoPO po) throws RemoteException;
	
	/**
	 * 用名字查找
	 */
	public HotelInfoPO findByName(String name) throws RemoteException;
	
	/**
	 * 用条件查找
	 */
	public HotelInfoPO findByCondition(String condition) throws RemoteException;
	
	/**
	 * 显示
	 */
	public ArrayList<HotelInfoPO> show() throws RemoteException;




}