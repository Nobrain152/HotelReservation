import po.HotelEvaluatePO;

import java.rmi.RemoteException;
import java.util.ArrayList;

import dataservice.hoteldataservice.HotelEvaluateDataService;
import dataservice.hoteldataservice._Stub.HotelEvaluateDataService_Stub;


public class HotelEvaluateDataService_Driver {

    public static void main(String[] args) throws RemoteException {
        HotelEvaluateDataService hotelEvaluateDataService = new HotelEvaluateDataService_Stub();
        HotelEvaluateDataService_Driver driver = new HotelEvaluateDataService_Driver();
        driver.drive(hotelEvaluateDataService);
    }

    public void drive(HotelEvaluateDataService hotelEvaluateDataService) throws RemoteException {
        ArrayList<HotelEvaluatePO> HotelEvaluate = new  ArrayList<HotelEvaluatePO>();
        HotelEvaluatePO inPO = new HotelEvaluatePO("XX´ó¾Æµê",HotelEvaluate);
        HotelEvaluatePO inPO2 = new HotelEvaluatePO("XX´ó¾Æµê",HotelEvaluate);
        ArrayList<HotelEvaluatePO> pos =  hotelEvaluateDataService.find(inPO);
        System.out.println("find "+pos.size()+" HotelEvaluatePO");
        if(hotleEvaluateDataService.insert(inPO3))
        	System.out.println("insert succeed");
        else
        	System.out.println("insert failed");
        if(hotelEvaluateDataService.delete(inPO2))
        	System.out.println("delete succeed");
        else
        	System.out.println("delete failed");
    }

}