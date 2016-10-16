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

//添加可用客房
	@Override
	public HotelMsg addRoom(RoomInfoVO roomInfoVO){
		if(RoomInfoVo.getType()==ROOM_ORDINARY)
			return new HotelMsg(true,"客房类型格式正确");
		else
			return new HotelMsg(false,"客房类型格式不正确");
	}
//更新客房信息
	@Override
    public HotelMsg updateRoom(RoomInfoVO roomInfoVO){
		if(RoomInfoVo.getType()==ROOM_ORDINARY)
			return new HotelMsg(true,"更新完成");
	}

//错误信息
	@Override
    public HotelMsg  wrongInfo(RoomInfoVO wrongInfoVO){	
			return new HotelMsg(false,"信息错误");
		
	}
	
}
