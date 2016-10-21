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
	
	 public void drive(IntegralDataService IntegralDataService) throws RemoteException {
        if(IntegralDataService.insert(IntegralPO));
        	System.out.println("insert succeed");
        if(IntegralDataService.insert(IntegralPO2));
        	System.out.println("insert succeed");
        IntegralDataService.find(IntegralPO);
        IntegralDataService.find(IntegralPO2);
        IntegralDataService.findAll();
        if(IntegralDataService.delete(IntegralPO));
        	System.out.println("delete succeed");
        if(IntegralDataService.update(IntegralPO3));
        	System.out.println("update succeed");
    }

	public static void main(String[] args) throws RemoteException {
        IntegralDataService stub = new IntegralDataService_Stub();
        IntegralDataService_Driver driver = new IntegralDataService_Driver();
        driver.drive(stub);
    }
	
	
}