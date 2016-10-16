package businesslogicservice.hotelblservice._Stub;

import vo.RoomInfoVO;
import businesslogic.util.HotelMsg;
import businesslogic.util.RoomType;
import businesslogicservice.hotelblservice.RoomAddBLService;

public class RoomAddBLService_Stub implements RoomAddBLService{
	RoomType type;
	public RoomAddBLService_Stub(){
		type = ROOM_ORDINARY; 
	}
	
	public RoomAddBLService_Stub(){
		this.type = type;
	}

//��ӿ��ÿͷ�
	@Override
	public HotelMsg addRoom(RoomInfoVO roomInfoVO){
		if(RoomInfoVo.getType()==ROOM_ORDINARY)
			return new HotelMsg(true,"�ͷ����͸�ʽ��ȷ");
		else
			return new HotelMsg(false,"�ͷ����͸�ʽ����ȷ");
	}
//���¿ͷ���Ϣ
	@Override
    public HotelMsg updateRoom(RoomInfoVO roomInfoVO){
		if(RoomInfoVo.getType()==ROOM_ORDINARY)
			return new HotelMsg(true,"�������");
	}

//������Ϣ
	@Override
    public HotelMsg  wrongInfo(RoomInfoVO wrongInfoVO){	
			return new HotelMsg(false,"��Ϣ����");
		
	}
	
}
