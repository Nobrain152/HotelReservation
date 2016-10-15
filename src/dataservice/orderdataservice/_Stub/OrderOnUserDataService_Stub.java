package dataservice.orderdataservice._Stub;


import dataservice.orderdataservice.OrderOnUserDataService;
import po.OrderOnUserPO;

import java.rmi.RemoteException;
import java.util.ArrayList;

import businesslogic.util.OrderState;
import businesslogic.util.RoomType;

/**
 * Created by txin on 16/10/15.
 */
public class OrderOnUserDataService_Stub implements OrderOnUserDataService {
	private OrderOnUserPO OrderOnUserPO;
	private OrderOnUserPO OrderOnUserPO2;
	private OrderOnUserPO OrderOnUserPO3;
	private ArrayList<OrderOnUserPO> pos;

	public OrderOnUserDataService_Stub() {
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


	@Override
	public boolean insert(OrderOnUserPO po) throws RemoteException {
		System.out.println("insert OrderOnUserPO succeed");
		return true;
	}

	@Override
	public boolean delete(OrderOnUserPO po) throws RemoteException {
		System.out.println("delete OrderOnUserPO succeed");
		return true;
	}

	@Override
	public boolean update(OrderOnUserPO po) throws RemoteException {
		System.out.println("update OrderOnUserPO succeed");
		return true;
	}

	@Override
	public OrderOnUserPO findByName(String name) throws RemoteException {
		System.out.println("findByName OrderOnUserPO succeed");
		return pos;
	}

	@Override
	public ArrayList<OrderOnUserPO> findByCondition(String condition) throws RemoteException {
		System.out.println("findByCondition OrderOnUserPO succeed");
		return pos;
	}

	@Override
	public ArrayList<OrderOnUserPO> show() throws RemoteException {
		System.out.println("show OrderOnUserPO succeed");
		return pos;
	}
}
