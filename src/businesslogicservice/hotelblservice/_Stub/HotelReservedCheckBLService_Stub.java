package businesslogicservice.hotelblservice._Stub;

import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;
import businesslogicservice.hotelblservice.HotelReservedCheckBLService;

public class HotelReservedCheckBLService_Stub implements HotelReservedCheckBLService{
	String name;
	public HotelReservedCheckBLService_Stub(){
		address = "XX��Ƶ�"; 
	}
	
	public HotelReservedCheckBLService_Stub(String name){
		this.name = name;
	}

//�����Ƶ�
	@Override
	public HotelMsg checkHotel(HotelInfoVO reservedHotelVO){
		if(HotelInfoVo.isReserved()==true)
			return new HotelMsg(true,"����");
		else
			return new HotelMsg(false,"δ����");
	}
//��ʾ�Ƶ�
	@Override
    public HotelMsg show(HotelInfoVO reservedHotelListVO){
		if(HotelInfoVo.getName().equals("XX��Ƶ�"))
			return new HotelMsg(true,"�Ƶ���Ϣ");
	}

}
