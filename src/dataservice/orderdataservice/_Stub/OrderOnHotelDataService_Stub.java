package dataservice.orderdataservice._Stub;


import dataservice.orderdataservice.OrderOnHotelDataService;
import po.OrderOnHotelPO;

import java.rmi.RemoteException;
import java.util.ArrayList;

import businesslogic.util.OrderState;
import businesslogic.util.RoomType;

/**
 * Created by txin on 16/10/15.
 */
public class OrderOnHotelDataService_Stub implements OrderOnHotelDataService {
	private OrderOnHotelPO OrderOnHotelPO;
	private OrderOnHotelPO OrderOnHotelPO2;
	private OrderOnHotelPO OrderOnHotelPO3;
	private ArrayList<OrderOnHotelPO> pos;

	public OrderOnHotelDataService_Stub() {
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


	@Override
	public boolean insert(OrderOnHotelPO po) throws RemoteException {
		System.out.println("insert OrderOnHotelPO succeed");
		return true;
	}

	@Override
	public boolean delete(OrderOnHotelPO po) throws RemoteException {
		System.out.println("delete OrderOnHotelPO succeed");
		return true;
	}

	@Override
	public boolean update(OrderOnHotelPO po) throws RemoteException {
		System.out.println("update OrderOnHotelPO succeed");
		return true;
	}

	@Override
	public OrderOnHotelPO find(String searchInfo) throws RemoteException {
		System.out.println("find OrderOnHotelPO succeed");
		return pos;
	}

	@Override
	public ArrayList<OrderOnHotelPO> show() throws RemoteException {
		System.out.println("show OrderOnHotelPO succeed");
		return pos;
	}
}
