import po.HotelInfoPO;

import java.rmi.RemoteException;
import java.util.ArrayList;

import dataservice.hoteldataservice.HotelInfoDataService;
import dataservice.hoteldataservice._Stub.HotelInfoDataService_Stub;


public class HotelInfoDataService_Driver {

    public static void main(String[] args) throws RemoteException {
        HotelInfoDataService hotelInfoDataService = new HotelInfoDataService_Stub();
        HotelInfoDataService_Driver driver = new HotelInfoDataService_Driver();
        driver.drive(hotelInfoDataService);
    }

    public void drive(HotelInfoDataService hotelInfoDataService) throws RemoteException {
        ArrayList<HotelInfoPO> HotelInfo = new  ArrayList<HotelInfoPO>();
        HotelInfoPO inPO = new HotelInfoPO("XX´ó¾Æµê",HotelInfo);
        HotelInfoPO inPO2 = new HotelInfoPO("XX´ó¾Æµê",HotelInfo);
        HotelInfoPO inPO3 = new HotelInfoPO("XX´ó¾Æµê",HotelInfo);
        ArrayList<HotelInfoPO> pos =  hotelInfoDataService.find(inPO);
        System.out.println("find "+pos.size()+" HotelInfoPO");
        if(hotleInfoDataService.insert(inPO3))
        	System.out.println("insert succeed");
        else
        	System.out.println("insert failed");
        if(hotelInfoDataService.delete(inPO2))
        	System.out.println("delete succeed");
        else
        	System.out.println("delete failed");
        inPO3 = new HotelInfoPO("2015-10-11",HotelInfo);
        if(hotelInfoDataService.update(inPO3))
       		System.out.println("update succeed");
        else
        	System.out.println("update failed");
    }

}