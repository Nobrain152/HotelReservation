package businesslogicservice.hotelblservice;

import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;

public interface HotelInfoMaintainBLService {
	
	/**
	 * ����Ƶ���Ϣ
	 *
	 */
	public HotelMsg inputHotelInfo(HotelInfoVO hotelInfoVO);
	
	/**
	 * �ύ�Ƶ���Ϣ
	 * 
	 */
    public HotelMsg submitInfo(HotelInfoVO hotelInfoVO);
   
   /**
     * �����ʽ
     * 
     */
   public HotelMsg wrongForm(HotelInfoVO wrongFormVO);

      
}