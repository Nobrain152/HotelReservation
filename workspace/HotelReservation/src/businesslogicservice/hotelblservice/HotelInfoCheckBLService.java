package businesslogicservice.hotelblservice;

import businesslogic.util.HotelMsg;
import vo.HotelInfoVO;

public interface HotelInfoCheckBLService {
	
	
	/**
	 * ��ʾ�Ƶ���Ϣ
	 * 
	 */
    public HotelMsg checkHotelInfo(HotelInfoVO hotelInfoVO);
   
      
}