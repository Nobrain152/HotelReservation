package dataservice.orderdataservice._Driver;

import dataservice.orderdataservice.OrderOnWebDataService;
import dataservice.orderdataservice._Stub.OrderOnWebDataService_Stub;
import po.OrderOnWebPO;

import java.rmi.RemoteException;
import java.util.ArrayList;

import businesslogic.util.OrderState;
import businesslogic.util.RoomType;
/**
 * Created by txin on 16/10/15.
 */
public class OrderOnWebDataService_Driver {

    private OrderOnWebPO OrderOnWebPO;
    private OrderOnWebPO OrderOnWebPO2;
    private OrderOnWebPO OrderOnWebPO3;
    private ArrayList<OrderOnWebPO> pos;

    public OrderOnWebDataService_Driver() {
        pos = new ArrayList<OrderOnWebPO>();
        OrderOnWebPO = new OrderOnWebPO("txin",OrderState.EXECUTED,"The train I took was late.",
        		"2016-10-15 24:00",RoomType.ROOM_STANDARD,1,1,false);
        OrderOnWebPO2 = new OrderOnWebPO("gyf",OrderState.EXECUTED,"I didn't remember the correct time.",
        		"2016-10-15 24:00",RoomType.ROOM_STANDARD,1,1,false);
        OrderOnWebPO3 = new OrderOnWebPO("hkw",OrderState.EXECUTED,"The watch was wrong.",
        		"2016-10-15 24:00",RoomType.ROOM_STANDARD,1,1,false);
        pos.add(OrderOnWebPO);
        pos.add(OrderOnWebPO2);
        pos.add(OrderOnWebPO3);
    }


    public void drive(OrderOnWebDataService OrderOnWebDataService) throws RemoteException {
        if(OrderOnWebDataService.insert(OrderOnWebPO));
        	System.out.println("insert succeed");
        if(OrderOnWebDataService.insert(OrderOnWebPO2));
        	System.out.println("insert succeed");
        OrderOnWebDataService.findByName("txin");
        OrderOnWebDataService.findByCondition("2016-10-15");
        OrderOnWebDataService.show();
        if(OrderOnWebDataService.delete(OrderOnWebPO));
        	System.out.println("delete succeed");
        if(OrderOnWebDataService.update(OrderOnWebPO3));
        	System.out.println("update succeed");
    }

    public static void main(String[] args) throws RemoteException {
        OrderOnWebDataService stub = new OrderOnWebDataService_Stub();
        OrderOnWebDataService_Driver driver = new OrderOnWebDataService_Driver();
        driver.drive(stub);
    }
}
