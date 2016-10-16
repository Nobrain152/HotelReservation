package businesslogicservice.hotelblservice._Driver;


import vo.RoomInfoVO;
import businesslogic.util.HotelMsg;
import businesslogicservice.hotelblservice.RoomAddBLService;
import businesslogicservice.hotelblservice._Stub.RoomAddBLService_Stub;

public class RoomAddBLService_Driver {
	public static void main(String[] args){
		RoomAddBLService a=new RoomAddBLService_Stub();
		RoomAddBLService_Driver b=new RoomAddBLService_Driver();
		b.drive(a);
	
	}
	public void drive(RoomAddBLService a){
		RoomInfoVO info=new RoomInfoVO("标准房",2);
		
		HotelMsg result=a.addRoom(info);
		if(result.isPass()==true)
			System.out.println("输入客房信息格式正确");
		else
			System.out.println("输入客房信息格式错误");
		
		HotelMsg result2=a.submitRoom(info);
		if(result.isPass()==true)
			System.out.println("添加成功");
		else
			System.out.println("添加失败");
}
