package businesslogicservice.hotelblservice;

import vo.HotelInfoCheckVO;
import businesslogic.util.HotelMsg;

public interface HotelInfoCheckBLService {
	
	/**
	 * ѡ��Ƶ�
	 *
	 */
	public HotelMsg selectHotel(HotelInfoVO selectHotelVO)��
	
	/**
	 * ��ʾ�Ƶ���Ϣ
	 * 
	 */
    public HotelMsg show(HotelInfoVO hotelInfoVO)��
   
      
}