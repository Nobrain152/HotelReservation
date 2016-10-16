package businesslogicservice.hotelblservice._Stub;

import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;
import businesslogicservice.hotelblservice.HotelReserveBLService;

public class HotelReserveBLService_Stub implements HotelReserveBLService{
	String address;
	public HotelReserveBLService_Stub(){
		name = "XX大酒店"; 
	}
	
	public HotelReserveBLService_Stub(String name){
		this.name = name;
	}

//预定酒店
	@Override
	public HotelMsg reserveHotel(HotelInfoVO reserveHotelVO){
		if(HotelInfoVo.getName().equals("XX大酒店"))
			return new HotelMsg(true,"选择成功");
	}
//创建订单
	@Override
    public HotelMsg createOrder(HotelInfoVO orderInfoVO){
		if(HotelInfoVo.getName().equals("XX大酒店"))
			return new HotelMsg(true,"创建成功");
	}

//创建订单失败
	@Override
    public HotelMsg fail(HotelInfoVO reserveFailVO) {
		
		return new HotelMsg(false,"创建失败")；
		
	}
	
}
