package businesslogicservice.hotelblservice._Driver;


import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;
import businesslogicservice.hotelblservice.HotelReservedCheckBLService;
import businesslogicservice.hotelblservice._Stub.HotelReservedCheckBLService_Stub;

public class HotelReservedCheckBLService_Driver {
	public static void main(String[] args){
		HotelReservedCheckBLService a=new HotelReservedCheckBLService_Stub();
		HotelReservedCheckBLService_Driver b=new HotelReservedCheckBLService_Driver();
		b.drive(a);
	
	}
	public void drive(HotelReservedCheckBLService a){
		HotelInfoVO info=new HotelInfoVO("XX大酒店");
		
		HotelMsg result=a.checkHotel(info);
		if(result.isPass()==true)
			System.out.println("酒店在已执行订单中");
		else
			System.out.println("酒店不在已执行订单中");
		
		HotelMsg result2=a.show(info);
}
