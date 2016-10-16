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
		RoomInfoVO info=new RoomInfoVO("��׼��",2);
		
		HotelMsg result=a.addRoom(info);
		if(result.isPass()==true)
			System.out.println("����ͷ���Ϣ��ʽ��ȷ");
		else
			System.out.println("����ͷ���Ϣ��ʽ����");
		
		HotelMsg result2=a.submitRoom(info);
		if(result.isPass()==true)
			System.out.println("��ӳɹ�");
		else
			System.out.println("���ʧ��");
}
