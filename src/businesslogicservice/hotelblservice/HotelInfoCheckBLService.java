package businesslogicservice.hotelblservice;

import vo.HotelInfoCheckVO;
import businesslogic.util.HotelMsg;

public interface HotelInfoCheckBLService {
	
	/**
	 * 选择酒店
	 *
	 */
	public HotelMsg selectHotel(HotelInfoVO selectHotelVO)；
	
	/**
	 * 显示酒店信息
	 * 
	 */
    public HotelMsg show(HotelInfoVO hotelInfoVO)；
   
      
}