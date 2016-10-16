package businesslogicservice.hotelblservice._Stub;

import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;
import businesslogicservice.hotelblservice.HotelSearchBLService;

public class HotelSearchBLService_Stub implements HotelSearchBLService{
	String address;
	public HotelSearchBLService_Stub(){
		address = "�½ֿ�"; 
	}
	
	public HotelSearchBLService_Stub(String address){
		this.address = address;
	}

//�����Ƶ�
	@Override
	public HotelMsg selectCondition(HotelInfoVO hotelConditionVO){
		if(HotelInfoVo.getAddress().equals("�½ֿ�"))
			return new HotelMsg(true,"�����ַ��ʽ��ȷ");
		else
			return new HotelMsg(false,"�����ַ��ʽ����ȷ");
	}
//��ʾ�Ƶ�
	@Override
	public HotelMsg show(HotelInfoVO hotelListInfoVO){
		if(HotelInfoVo.getAddress().equals("�½ֿ�"))
			return new HotelMsg(true,"�����ɹ�");
	}

	@Override
	public HotelMsg alarm(HotelInfoVO alarmVO) {
		
		if(HotelInfoVo.getAddress().equals("�½ֿ�")){
			
		}
		else{
			return new HotelMsg(false,"����ʧ��");
		}
		
	}
	
}
