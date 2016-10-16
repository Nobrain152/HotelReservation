package businesslogicservice.hotelblservice._Stub;

import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;
import businesslogicservice.hotelblservice.HotelInfoMaintainBLService;

public class HotelInfoMaintainBLService_Stub implements HotelInfoMaintainBLService{
	String address;
	public HotelInfoMaintainBLService_Stub(){
		address = "�½ֿ�"; 
	}
	
	public HotelInfoMaintainBLService_Stub(String address){
		this.address = address;
	}

//����Ƶ���Ϣ
	@Override
	public HotelMsg inputHotelInfo(HotelInfoVO hotelInfoVO){
		if(HotelInfoVo.getAddress().equals("�½ֿ�"))
			return new HotelMsg(true,"�����ַ��ʽ��ȷ");
	}
//�ύ��Ϣ
	@Override
    public HotelMsg submitInfo(HotelInfoVO hotelInfoVO){
		if(HotelInfoVo.getAddress().equals("�½ֿ�"))
			return new HotelMsg(true,"�ύ�ɹ�");
	}

//��ʽ����
	@Override
    public HotelMsg wrongForm(HotelInfoVO wrongFormVO){
		return new HotelMsg(false,"�����ַ��ʽ����");
		
	}
	
}
