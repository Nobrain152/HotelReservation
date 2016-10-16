package businesslogicservice.hotelblservice._Driver;


import vo.HotelInfoVO;
import businesslogic.util.HotelMsg;
import businesslogicservice.hotelblservice.HotelSearchBLService;
import businesslogicservice.hotelblservice._Stub.HotelSearchBLService_Stub;

public class HotelSearchBLService_Driver {
	public static void main(String[] args){
		HotelSearchBLService a=new HotelSearchBLService_Stub();
		HotelSearchBLService_Driver b=new HotelSearchBLService_Driver();
		b.drive(a);
	
	}
	public void drive(HotelSearchBLService a){
		HotelInfoVO info=new HotelInfoVO("新街口",4);
		
		HotelMsg result=a.selectCondition(info);
		if(result.isPass()==true)
			System.out.println("输入酒店信息格式正确");
		else
			System.out.println("输入酒店信息格式错误");
		
		HotelMsg result2=a.show(info);
		if(result.isPass()==true)
			System.out.println("搜索成功");
		else
			System.out.println("搜索失败");
}
