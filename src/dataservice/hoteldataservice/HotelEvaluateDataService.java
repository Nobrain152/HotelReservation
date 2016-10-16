package dataservice.hoteldataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.HotelEvaluatePO;

public interface HotelEvaluateDataService {
	
	/**
	 * ����
	 */
	public void insert(HotelEvaluatePO po) throws RemoteException;
	
	
	/**
	 * ɾ��
	 */
	public void delete(HotelEvaluatePO po) throws RemoteException;
	
	
	/**
	 * ����
	 */
	public HotelEvaluatePO findByName(String searchInfo) throwsRemoteException;
	
	
	/**
	 * ��ʾ
	 */
	public ArrayList<HotelEvaluatePO>show() throws RemoteException;




}	