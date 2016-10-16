package businesslogicservice.hotelblservice._Stub;

import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;
import businesslogicservice.hotelblservice.HotelInfoCheckBLService;

public class HotelInfoCheckBLService_Stub implements HotelInfoCheckBLService{
	String name;
	public HotelInfoCheckBLService_Stub(){
		name = "XX大酒店"; 
	}
	
	public HotelInfoCheckBLService_Stub(String name){
		this.name = name;
	}

//选择酒店
	@Override
	public HotelMsg selectHotel(HotelInfoVO selectHotelVO){
		if(HotelInfoVo.getName().equals("XX大酒店"))
			return new HotelMsg(true,"选择成功");
	}
//显示酒店
	@Override
	public HotelMsg show(HotelInfoVO hotelInfoVO){
		if(HotelInfoVo.getName().equals("XX大酒店"))
			return new HotelMsg(true,"酒店信息");
	}
	
}
