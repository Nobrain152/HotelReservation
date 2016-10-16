package businesslogicservice.hotelblservice._Stub;

import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;
import businesslogicservice.hotelblservice.HotelInfoMaintainBLService;

public class HotelInfoMaintainBLService_Stub implements HotelInfoMaintainBLService{
	String address;
	public HotelInfoMaintainBLService_Stub(){
		address = "新街口"; 
	}
	
	public HotelInfoMaintainBLService_Stub(String address){
		this.address = address;
	}

//输入酒店信息
	@Override
	public HotelMsg inputHotelInfo(HotelInfoVO hotelInfoVO){
		if(HotelInfoVo.getAddress().equals("新街口"))
			return new HotelMsg(true,"输入地址格式正确");
	}
//提交信息
	@Override
    public HotelMsg submitInfo(HotelInfoVO hotelInfoVO){
		if(HotelInfoVo.getAddress().equals("新街口"))
			return new HotelMsg(true,"提交成功");
	}

//格式错误
	@Override
    public HotelMsg wrongForm(HotelInfoVO wrongFormVO){
		return new HotelMsg(false,"输入地址格式错误");
		
	}
	
}
