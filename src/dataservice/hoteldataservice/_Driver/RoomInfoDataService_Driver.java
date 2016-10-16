import po.RoomInfoPO;

import java.rmi.RemoteException;
import java.util.ArrayList;

import dataservice.hoteldataservice.RoomInfoDataService;
import dataservice.hoteldataservice._Stub.RoomInfoDataService_Stub;


public class RoomInfoDataService_Driver {

    public static void main(String[] args) throws RemoteException {
        RoomInfoDataService hotelInfoDataService = new RoomInfoDataService_Stub();
        RoomInfoDataService_Driver driver = new RoomInfoDataService_Driver();
        driver.drive(hotelInfoDataService);
    }

    public void drive(RoomInfoDataService hotelInfoDataService) throws RemoteException {
        ArrayList<RoomInfoPO> RoomInfo = new  ArrayList<RoomInfoPO>();
        RoomInfoPO inPO = new RoomInfoPO("标准房",RoomInfo);
        RoomInfoPO inPO2 = new RoomInfoPO("标准房",RoomInfo);
        RoomInfoPO inPO3 = new RoomInfoPO("标准房",RoomInfo);
        ArrayList<RoomInfoPO> pos =  hotelInfoDataService.find(inPO);
        System.out.println("find "+pos.size()+" RoomInfoPO");
        if(hotleInfoDataService.insert(inPO3))
        	System.out.println("insert succeed");
        else
        	System.out.println("insert failed");
        if(hotelInfoDataService.delete(inPO2))
        	System.out.println("delete succeed");
        else
        	System.out.println("delete failed");
        inPO3 = new RoomInfoPO("2015-10-11",RoomInfo);
        if(hotelInfoDataService.update(inPO3))
       		System.out.println("update succeed");
        else
        	System.out.println("update failed");
    }

}