package businesslogicservice.hotelblservice._Driver;


import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;
import businesslogicservice.hotelblservice.HotelInfoCheckBLService;
import businesslogicservice.hotelblservice._Stub.HotelInfoCheckBLService_Stub;

public class HotelInfoCheckBLService_Driver {
	public static void main(String[] args){
		HotelInfoCheckBLService a=new HotelInfoCheckBLService_Stub();
		HotelInfoCheckBLService_Driver b=new HotelInfoCheckBLService_Driver();
		b.drive(a);
	
	}
	public void drive(HotelInfoCheckBLService a){
		HotelInfoVO info=new HotelInfoVO("XX大酒店");
		
		HotelMsg result=a.selectHotel(info);
		if(result.isPass()==true)
			System.out.println("显示酒店信息");
		else
			System.out.println("出错");
}
