package businesslogicservice.hotelblservice;

import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;

public interface HotelReserveBLService {
	
	/**
	 * 预定酒店
	 *
	 */
	public HotelMsg reserveHotel(HotelInfoVO reserveHotelVO);
	
	/**
	 * 创建订单
	 * 
	 */
    public HotelMsg createOrder(HotelInfoVO orderInfoVO);
   
   /**
     * 创建订单失败
     * 
     */
   public HotelMsg fail(HotelInfoVO reserveFailVO);

      
}