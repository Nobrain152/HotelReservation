package dataservice.orderdataservice._Driver;

import dataservice.orderdataservice.OrderOnUserDataService;
import dataservice.orderdataservice._Stub.OrderOnUserDataService_Stub;
import po.OrderOnUserPO;

import java.rmi.RemoteException;
import java.util.ArrayList;

import businesslogic.util.OrderState;
import businesslogic.util.RoomType;
/**
 * Created by txin on 16/10/15.
 */
public class OrderOnUserDataService_Driver {

    private OrderOnUserPO OrderOnUserPO;
    private OrderOnUserPO OrderOnUserPO2;
    private OrderOnUserPO OrderOnUserPO3;
    private ArrayList<OrderOnUserPO> pos;

    public OrderOnUserDataService_Driver() {
    	ArrayList<String> barCodes = new ArrayList<String>();
        pos = new ArrayList<OrderOnUserPO>();
        OrderOnUserPO = new OrderOnUserPO("txin",OrderState.EXECUTED,"2016-10-15 12:00","2016-10-16 12:00",
        		"2016-10-15 24:00",RoomType.ROOM_STANDARD,1,1,false);
        OrderOnUserPO2 = new OrderOnUserPO("gyf",OrderState.EXECUTED,"2016-10-15 12:00","2016-10-16 12:00",
        		"2016-10-15 24:00",RoomType.ROOM_STANDARD,1,1,false);
        OrderOnUserPO3 = new OrderOnUserPO("hkw",OrderState.EXECUTED,"2016-10-15 12:00","2016-10-16 12:00",
        		"2016-10-15 24:00",RoomType.ROOM_STANDARD,1,1,false);
        pos.add(OrderOnUserPO);
        pos.add(OrderOnUserPO2);
        pos.add(OrderOnUserPO3);
    }


    public void drive(OrderOnUserDataService OrderOnUserDataService) throws RemoteException {
        if(OrderOnUserDataService.insert(OrderOnUserPO));
        	System.out.println("insert succeed");
        if(OrderOnUserDataService.insert(OrderOnUserPO2));
        	System.out.println("insert succeed");
        OrderOnUserDataService.findByName("txin");
        OrderOnUserDataService.findByCondition("2016-10-15");
        OrderOnUserDataService.show();
        if(OrderOnUserDataService.delete(OrderOnUserPO));
        	System.out.println("delete succeed");
        if(OrderOnUserDataService.update(OrderOnUserPO3));
        	System.out.println("update succeed");
    }

    public static void main(String[] args) throws RemoteException {
        OrderOnUserDataService stub = new OrderOnUserDataService_Stub();
        OrderOnUserDataService_Driver driver = new OrderOnUserDataService_Driver();
        driver.drive(stub);
    }
}
