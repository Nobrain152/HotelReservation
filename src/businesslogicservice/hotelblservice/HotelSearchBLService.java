package businesslogicservice.hotelblservice;

import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;

public interface HotelSearchBLService {
	
	/**
	 * �����Ƶ�
	 *
	 */
	public HotelMsg selectCondition(HotelInfoVO hotelConditionVO)��
	
	/**
	 * ��ʾ�Ƶ��б�
	 * 
	 */
    public HotelMsg show(HotelInfoVO hotelListInfoVO)��
   
   /**
     * ����
     * 
     */
   public HotelMsg alarm(HotelInfoVO alarmVO)��

      
}