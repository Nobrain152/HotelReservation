package businesslogicservice.hotelblservice;

import vo.RoomInfoVO;
import businesslogic.util.HotelMsg;

public interface RoomAddBLService {
	
	/**
	 * 添加可用客房
	 *
	 */
	public HotelMsg addRoom(RoomInfoVO roomInfoVO);
	
	/**
	 * 更新客房信息
	 * 
	 */
    public HotelMsg updateRoom(RoomInfoVO roomInfoVO);
   
   /**
     * 错误信息
     * 
     */
   public HotelMsg  wrongInfo(RoomInfoVO wrongInfoVO);

      
}