package businesslogicserviceimpl.hotelblserviceimpl;

import java.util.ArrayList;

import businesslogic.util.HotelMsg;
import vo.HotelInfoVO;

public class HotelSearchBLServiceImpl {
	ArrayList<HotelInfoVO> hotelList;
	
	public HotelSearchBLServiceImpl() {
		hotelList = new ArrayList<HotelInfoVO>();
	}
	
	/**
	 * ѡ��Ƶ�����
	 *
	 */
	public HotelMsg selectCondition(HotelInfoVO hotelInfoVO){
		return new HotelMsg(hotelInfoVO.getName(),hotelInfoVO.getAddress(),
    			hotelInfoVO.getArea(),hotelInfoVO.getLevel(),hotelInfoVO.getIntroduction(),
    			hotelInfoVO.getFacility(),hotelInfoVO.isReserved());
	}
	
	/**
	 * ��ʾ�Ƶ��б�
	 * 
	 */
    public ArrayList<HotelInfoVO> showList(HotelInfoVO hotelListInfoVO){
    	return hotelList;
    }
}