package businesslogicservice.hotelblservice._Stub;

import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;
import businesslogicservice.hotelblservice.HotelInfoCheckBLService;

public class HotelInfoCheckBLService_Stub implements HotelInfoCheckBLService{
	String name;
	public HotelInfoCheckBLService_Stub(){
		name = "XX��Ƶ�"; 
	}
	
	public HotelInfoCheckBLService_Stub(String name){
		this.name = name;
	}

//ѡ��Ƶ�
	@Override
	public HotelMsg selectHotel(HotelInfoVO selectHotelVO){
		if(HotelInfoVo.getName().equals("XX��Ƶ�"))
			return new HotelMsg(true,"ѡ��ɹ�");
	}
//��ʾ�Ƶ�
	@Override
	public HotelMsg show(HotelInfoVO hotelInfoVO){
		if(HotelInfoVo.getName().equals("XX��Ƶ�"))
			return new HotelMsg(true,"�Ƶ���Ϣ");
	}
	
}
