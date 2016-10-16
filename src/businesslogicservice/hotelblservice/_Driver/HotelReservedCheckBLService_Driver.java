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
		HotelInfoVO info=new HotelInfoVO("XX��Ƶ�");
		
		HotelMsg result=a.checkHotel(info);
		if(result.isPass()==true)
			System.out.println("�Ƶ�����ִ�ж�����");
		else
			System.out.println("�Ƶ겻����ִ�ж�����");
		
		HotelMsg result2=a.show(info);
}
