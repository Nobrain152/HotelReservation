package businesslogicservice.IntegralBLService._Driver;

package businesslogicservice.IntegralBLService._Stub;

import java.util.ArrayList;

import vo.IntegralVO;
import vo.UserInfoVO.*;
import businesslogicservice.commodityblservice_Stub;

public class IntegralBLService_Driver {
public static void main(String[] args){
	IntegralBLService a=new IntegralBLService_Stub();
	IntegralBLService_Driver b=new IntegralBLService_Driver();
	b.drive(a);
	
}
public void drive(IntegralBLService a){
	
	IntegralVO Integra=new IntegralVO("Tom",VipLevel,4,"生日促销策略",COMMON_VIP);
	ArrayList<IntegralVO> IntegraInfo=new ArrayList<IntegralVO> ();
	IntegraInfo.add(Integra);
	StorageInVO	putInStorageVo=new StorageInVO("Tom",VipLevel,4,"生日促销策略",COMMON_VIP);
	ResultMsg result=a.addPutInStorgaeDoc(putInStorageVo);
	if(result.isPass()==true)
		System.out.println("输入的格式正确");
	else
		System.out.println("输入的格式不正确");
	
}
}