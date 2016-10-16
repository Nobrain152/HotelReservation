package businesslogicservice.hotelblservice._Driver;


import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;
import businesslogicservice.hotelblservice.HotelReserveBLService;
import businesslogicservice.hotelblservice._Stub.HotelReserveBLService_Stub;

public class HotelReserveBLService_Driver {
	public static void main(String[] args){
		HotelReserveBLService a=new HotelReserveBLService_Stub();
		HotelReserveBLService_Driver b=new HotelReserveBLService_Driver();
		b.drive(a);
	
	}
	public void drive(HotelReserveBLService a){
		HotelInfoVO info=new HotelInfoVO("XX大酒店");
		
		HotelMsg result=a.createOrder(info);
		if(result.isPass()==true)
			System.out.println("预定成功");
		else
			System.out.println("预定失败");
		
}
