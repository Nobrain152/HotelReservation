package businesslogicservice.VipBLService._Driver;

package businesslogicservice.VipBLService._Stub;

import java.util.ArrayList;

import vo.VipVO;
import vo.UserInfoVO.*;
import businesslogicservice.commodityblservice_Stub;

public class VipBLService_Driver {
public static void main(String[] args){
	VipBLService a=new VipBLService_Stub();
	VipBLService_Driver b=new VipBLService_Driver();
	b.drive(a);
	
}
public void drive(VipBLService a){
	ArrayList<Sting> info = new ArrayList<String>();
	VipVO Integra=new VipVO("100",info);
	ArrayList<VipVO> IntegraInfo=new ArrayList<VipVO> ();
	IntegraInfo.add(Integra);
	StorageInVO	putInStorageVo=new StorageInVO("100",info);
	ResultMsg result=a.addPutInStorgaeDoc(putInStorageVo);
	if(result.isPass()==true)
		System.out.println("输入的格式正确");
	else
		System.out.println("输入的格式不正确");
	
}
}