package businesslogicservice.hotelblservice._Stub;

import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;
import businesslogicservice.hotelblservice.HotelReservedCheckBLService;

public class HotelReservedCheckBLService_Stub implements HotelReservedCheckBLService{
	String name;
	public HotelReservedCheckBLService_Stub(){
		address = "XX´ó¾Æµê"; 
	}
	
	public HotelReservedCheckBLService_Stub(String name){
		this.name = name;
	}

//ËÑË÷¾Æµê
	@Override
	public HotelMsg checkHotel(HotelInfoVO reservedHotelVO){
		if(HotelInfoVo.isReserved()==true)
			return new HotelMsg(true,"¶©¹ý");
		else
			return new HotelMsg(false,"Î´¶©¹ý");
	}
//ÏÔÊ¾¾Æµê
	@Override
    public HotelMsg show(HotelInfoVO reservedHotelListVO){
		if(HotelInfoVo.getName().equals("XX´ó¾Æµê"))
			return new HotelMsg(true,"¾ÆµêÐÅÏ¢");
	}

}
