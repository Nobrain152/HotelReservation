package businesslogicservice.hotelblservice;

import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;

public interface HotelInfoMaintainBLService {
	
	/**
	 * 输入酒店信息
	 *
	 */
	public HotelMsg inputHotelInfo(HotelInfoVO hotelInfoVO);
	
	/**
	 * 提交酒店信息
	 * 
	 */
    public HotelMsg submitInfo(HotelInfoVO hotelInfoVO);
   
   /**
     * 错误格式
     * 
     */
   public HotelMsg wrongForm(HotelInfoVO wrongFormVO);

      
}