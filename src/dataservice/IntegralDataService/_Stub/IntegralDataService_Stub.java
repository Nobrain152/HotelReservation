package dataservice.IntegralDataService._Stub;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.IntegralPO;

public class IntegralDataService_Stub {
	private IntegralPO integralPO1;
	private IntegralPO integralPO2;
	private ArrayList<IntegralPO> IntegralPOs;
	private String name;
	private ArrayList<String> integralRecord;
	
	public StorageInDataService_Stub(){
		integralRecord = new ArrayList<String>();
		integralRecord.add("50/增加");
		integralPO1 = new IntegralPO(100,integralRecord);
		integralPO2 = new IntegralPO(500,integralRecord);
		IntegralPOs = new ArrayList<IntegralPO>();
		IntegralPOs.add(integralPO1);
		IntegralPOs.add(integralPO2);
	}


	@Override
	public IntegralPO findByLevel(String name) throws RemoteException {
		return integralPO1;
	}
	
	@Override
	public ArrayList<IntegralPO> show() throws RemoteException {
		return integralPOS;
	}
	
	
}