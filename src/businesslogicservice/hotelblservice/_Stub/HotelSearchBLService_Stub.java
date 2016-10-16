package businesslogicservice.hotelblservice._Stub;

import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;
import businesslogicservice.hotelblservice.HotelSearchBLService;

public class HotelSearchBLService_Stub implements HotelSearchBLService{
	String address;
	public HotelSearchBLService_Stub(){
		address = "新街口"; 
	}
	
	public HotelSearchBLService_Stub(String address){
		this.address = address;
	}

//搜索酒店
	@Override
	public HotelMsg selectCondition(HotelInfoVO hotelConditionVO){
		if(HotelInfoVo.getAddress().equals("新街口"))
			return new HotelMsg(true,"输入地址格式正确");
		else
			return new HotelMsg(false,"输入地址格式不正确");
	}
//显示酒店
	@Override
	public HotelMsg show(HotelInfoVO hotelListInfoVO){
		if(HotelInfoVo.getAddress().equals("新街口"))
			return new HotelMsg(true,"搜索成功");
	}

	@Override
	public HotelMsg alarm(HotelInfoVO alarmVO) {
		
		if(HotelInfoVo.getAddress().equals("新街口")){
			
		}
		else{
			return new HotelMsg(false,"搜索失败");
		}
		
	}
	
}
