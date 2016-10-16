import po.RoomInfoPO;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class RoomInfoDataService_Stub implements RoomInfoDataService {

    @Override
    public vpid insert(RoomInfoPO po) throws RemoteException {
        System.out.println("insert succeed!");
    }

    @Override
    public void delete(RoomInfoPO po) throws RemoteException {
        System.out.println("delete succeed!");
    }

    @Override
    public void update(RoomInfoPO po) throws RemoteException {
        System.out.println("update succeed!");
    }

    @Override
    public RoomInfoPO findByName(String name) throws RemoteException {
        System.out.println("find succeed!");
        return new RoomInfoPO();
    }
	
	@Override
	public RoomInfoPO findByCondition(String condition) throws RemoteException {
        System.out.println("find succeed!");
        return new RoomInfoPO();
    }
	
	@Override
	public ArrayList<RoomInfoPO> show() throws RemoteException{
		System.out.println("show succeed!");
        return new ArrayList<RoomInfoInPO>();
	}
}