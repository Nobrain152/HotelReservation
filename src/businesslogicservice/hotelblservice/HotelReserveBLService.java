package businesslogicservice.hotelblservice;

import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;

public interface HotelReserveBLService {
	
	/**
	 * Ԥ���Ƶ�
	 *
	 */
	public HotelMsg reserveHotel(HotelInfoVO reserveHotelVO);
	
	/**
	 * ��������
	 * 
	 */
    public HotelMsg createOrder(HotelInfoVO orderInfoVO);
   
   /**
     * ��������ʧ��
     * 
     */
   public HotelMsg fail(HotelInfoVO reserveFailVO);

      
}