package dataservice.orderdataservice._Stub;


import dataservice.orderdataservice.OrderOnWebDataService;
import po.OrderOnWebPO;

import java.rmi.RemoteException;
import java.util.ArrayList;

import businesslogic.util.OrderState;
import businesslogic.util.RoomType;

/**
 * Created by txin on 16/10/15.
 */
public class OrderOnWebDataService_Stub implements OrderOnWebDataService {
	private OrderOnWebPO OrderOnWebPO;
	private OrderOnWebPO OrderOnWebPO2;
	private OrderOnWebPO OrderOnWebPO3;
	private ArrayList<OrderOnWebPO> pos;

	public OrderOnWebDataService_Stub() {
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


	@Override
	public boolean insert(OrderOnWebPO po) throws RemoteException {
		System.out.println("insert OrderOnWebPO succeed");
		return true;
	}

	@Override
	public boolean delete(OrderOnWebPO po) throws RemoteException {
		System.out.println("delete OrderOnWebPO succeed");
		return true;
	}

	@Override
	public boolean update(OrderOnWebPO po) throws RemoteException {
		System.out.println("update OrderOnWebPO succeed");
		return true;
	}

	@Override
	public OrderOnWebPO findByName(String name) throws RemoteException {
		System.out.println("findByName OrderOnWebPO succeed");
		return pos;
	}

	@Override
	public ArrayList<OrderOnWebPO> findByCondition(String condition) throws RemoteException {
		System.out.println("findByCondition OrderOnWebPO succeed");
		return pos;
	}

	@Override
	public ArrayList<OrderOnWebPO> show() throws RemoteException {
		System.out.println("show OrderOnWebPO succeed");
		return pos;
	}
}
