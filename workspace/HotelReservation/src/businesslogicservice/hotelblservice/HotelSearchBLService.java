package businesslogicservice.hotelblservice;

import java.util.ArrayList;

import businesslogic.util.HotelMsg;
import vo.HotelInfoVO;

public interface HotelSearchBLService {
	
	/**
	 * ѡ��Ƶ�����
	 *
	 */
	public HotelMsg selectCondition(HotelInfoVO hotelConditionVO);
	
	/**
	 * ��ʾ�Ƶ��б�
	 * 
	 */
    public ArrayList<HotelInfoVO> showList(HotelInfoVO hotelListInfoVO);
   

      
}