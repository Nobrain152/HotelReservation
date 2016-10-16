package businesslogicservice.hotelblservice._Driver;


import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;
import businesslogicservice.hotelblservice.HotelInfoMaintainBLService;
import businesslogicservice.hotelblservice._Stub.HotelInfoMaintainBLService_Stub;

public class HotelInfoMaintainBLService_Driver {
	public static void main(String[] args){
		HotelInfoMaintainBLService a=new HotelInfoMaintainBLService_Stub();
		HotelInfoMaintainBLService_Driver b=new HotelInfoMaintainBLService_Driver();
		b.drive(a);
	
	}
	public void drive(HotelInfoMaintainBLService a){
		HotelInfoVO info=new HotelInfoVO("XX大酒店","新街口",4);
		
		HotelMsg result=a.inputHotelInfo(info);
		if(result.isPass()==true)
			System.out.println("输入酒店信息格式正确");
		else
			System.out.println("输入酒店信息格式错误");
		
		HotelMsg result2=a.submitInfo(info);
		if(result.isPass()==true)
			System.out.println("提交成功");
		else
			System.out.println("提交失败");
}
