package businesslogicservice.hotelblservice._Stub;

import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;
import businesslogicservice.hotelblservice.HotelReserveBLService;

public class HotelReserveBLService_Stub implements HotelReserveBLService{
	String address;
	public HotelReserveBLService_Stub(){
		name = "XX��Ƶ�"; 
	}
	
	public HotelReserveBLService_Stub(String name){
		this.name = name;
	}

//Ԥ���Ƶ�
	@Override
	public HotelMsg reserveHotel(HotelInfoVO reserveHotelVO){
		if(HotelInfoVo.getName().equals("XX��Ƶ�"))
			return new HotelMsg(true,"ѡ��ɹ�");
	}
//��������
	@Override
    public HotelMsg createOrder(HotelInfoVO orderInfoVO){
		if(HotelInfoVo.getName().equals("XX��Ƶ�"))
			return new HotelMsg(true,"�����ɹ�");
	}

//��������ʧ��
	@Override
    public HotelMsg fail(HotelInfoVO reserveFailVO) {
		
		return new HotelMsg(false,"����ʧ��")��
		
	}
	
}
