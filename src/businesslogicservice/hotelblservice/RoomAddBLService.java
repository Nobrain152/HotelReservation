package businesslogicservice.hotelblservice;

import vo.RoomInfoVO;
import businesslogic.util.HotelMsg;

public interface RoomAddBLService {
	
	/**
	 * ��ӿ��ÿͷ�
	 *
	 */
	public HotelMsg addRoom(RoomInfoVO roomInfoVO);
	
	/**
	 * ���¿ͷ���Ϣ
	 * 
	 */
    public HotelMsg updateRoom(RoomInfoVO roomInfoVO);
   
   /**
     * ������Ϣ
     * 
     */
   public HotelMsg  wrongInfo(RoomInfoVO wrongInfoVO);

      
}