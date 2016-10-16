package businesslogicservice.hotelblservice;

import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;

public interface HotelSearchBLService {
	
	/**
	 * ËÑË÷¾Æµê
	 *
	 */
	public HotelMsg selectCondition(HotelInfoVO hotelConditionVO)£»
	
	/**
	 * ÏÔÊ¾¾ÆµêÁÐ±í
	 * 
	 */
    public HotelMsg show(HotelInfoVO hotelListInfoVO)£»
   
   /**
     * ±¨´í
     * 
     */
   public HotelMsg alarm(HotelInfoVO alarmVO)£»

      
}