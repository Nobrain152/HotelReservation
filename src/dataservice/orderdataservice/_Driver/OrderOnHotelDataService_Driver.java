package dataservice.orderdataservice._Driver;

import dataservice.orderdataservice.OrderOnHotelDataService;
import dataservice.orderdataservice._Stub.OrderOnHotelDataService_Stub;
import po.OrderOnHotelPO;

import java.rmi.RemoteException;
import java.util.ArrayList;

import businesslogic.util.OrderState;
import businesslogic.util.RoomType;
/**
 * Created by txin on 16/10/15.
 */
public class OrderOnHotelDataService_Driver {

    private OrderOnHotelPO OrderOnHotelPO;
    private OrderOnHotelPO OrderOnHotelPO2;
    private OrderOnHotelPO OrderOnHotelPO3;
    private ArrayList<OrderOnHotelPO> pos;

    public OrderOnHotelDataService_Driver() {
    	ArrayList<String> barCodes = new ArrayList<String>();
        pos = new ArrayList<OrderOnHotelPO>();
        OrderOnHotelPO = new OrderOnHotelPO("txin",OrderState.EXECUTED,"2016-10-15 12:00","2016-10-16 12:00",
        		"2016-10-15 24:00",RoomType.ROOM_STANDARD,1,1,false);
        OrderOnHotelPO2 = new OrderOnHotelPO("gyf",OrderState.EXECUTED,"2016-10-15 12:00","2016-10-16 12:00",
        		"2016-10-15 24:00",RoomType.ROOM_STANDARD,1,1,false);
        OrderOnHotelPO3 = new OrderOnHotelPO("hkw",OrderState.EXECUTED,"2016-10-15 12:00","2016-10-16 12:00",
        		"2016-10-15 24:00",RoomType.ROOM_STANDARD,1,1,false);
        pos.add(OrderOnHotelPO);
        pos.add(OrderOnHotelPO2);
        pos.add(OrderOnHotelPO3);
    }


    public void drive(OrderOnHotelDataService OrderOnHotelDataService) throws RemoteException {
        if(OrderOnHotelDataService.insert(OrderOnHotelPO));
        	System.out.println("insert succeed");
        if(OrderOnHotelDataService.insert(OrderOnHotelPO2));
        	System.out.println("insert succeed");
        OrderOnHotelDataService.find("txin");
        OrderOnHotelDataService.find("2016-10-15");
        OrderOnHotelDataService.show();
        if(OrderOnHotelDataService.delete(OrderOnHotelPO));
        	System.out.println("delete succeed");
        if(OrderOnHotelDataService.update(OrderOnHotelPO3));
        	System.out.println("update succeed");
    }

    public static void main(String[] args) throws RemoteException {
        OrderOnHotelDataService stub = new OrderOnHotelDataService_Stub();
        OrderOnHotelDataService_Driver driver = new OrderOnHotelDataService_Driver();
        driver.drive(stub);
    }
}
