package businesslogicservice.hotelblservice;

import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;

public interface HotelReservedCheckBLService {
	
	/**
	 * �����Ԥ���Ƶ�
	 *
	 */
	public HotelMsg checkHotel(HotelInfoVO reservedHotelVO);
	
	/**
	 * ��ʾ��Ԥ���Ƶ��б�
	 * 
	 */
    public HotelMsg show(HotelInfoVO reservedHotelListVO);
   

      
}