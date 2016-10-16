package dataservice.hoteldataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.HotelEvaluatePO;

public interface HotelEvaluateDataService {
	
	/**
	 * 增加
	 */
	public void insert(HotelEvaluatePO po) throws RemoteException;
	
	
	/**
	 * 删除
	 */
	public void delete(HotelEvaluatePO po) throws RemoteException;
	
	
	/**
	 * 查找
	 */
	public HotelEvaluatePO findByName(String searchInfo) throwsRemoteException;
	
	
	/**
	 * 显示
	 */
	public ArrayList<HotelEvaluatePO>show() throws RemoteException;




}	