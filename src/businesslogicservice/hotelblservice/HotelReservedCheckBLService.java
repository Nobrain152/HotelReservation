package businesslogicservice.hotelblservice;

import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;

public interface HotelReservedCheckBLService {
	
	/**
	 * ºÏ≤È“—‘§∂©æ∆µÍ
	 *
	 */
	public HotelMsg checkHotel(HotelInfoVO reservedHotelVO);
	
	/**
	 * œ‘ æ“—‘§∂©æ∆µÍ¡–±Ì
	 * 
	 */
    public HotelMsg show(HotelInfoVO reservedHotelListVO);
   

      
}