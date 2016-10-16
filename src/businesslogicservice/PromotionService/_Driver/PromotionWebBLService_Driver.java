package businesslogicservice.PromotionWebBLService._Driver;

package businesslogicservice.PromotionWebBLService._Stub;

import java.util.ArrayList;

import vo.PromotionWebVO;
import vo.UserInfoVO.*;
import businesslogicservice.commodityblservice_Stub;

public class PromotionWebBLService_Driver {
public static void main(String[] args){
	PromotionWebBLService a=new PromotionWebBLService_Stub();
	PromotionWebBLService_Driver b=new PromotionWebBLService_Driver();
	b.drive(a);
	
}
public void drive(PromotionWebBLService a){
	ArrayList<Sting> info = new ArrayList<String>();
	PromotionWebVO Integra=new PromotionWebVO(Web_CUSTOM_PROMOTION,"会员","2016/10/10","2016/10/15","80");
	ArrayList<PromotionWebVO> IntegraInfo=new ArrayList<PromotionWebVO> ();
	IntegraInfo.add(Integra);
	StorageInVO	putInStorageVo=new StorageInVO(Web_CUSTOM_PROMOTION,"会员","2016/10/10","2016/10/15","80");
	ResultMsg result=a.addPutInStorgaeDoc(putInStorageVo);
	if(result.isPass()==true)
		System.out.println("输入的格式正确");
	else
		System.out.println("输入的格式不正确");
	PromotionMsg result=a.addPutInStorgaeDoc(putInStorageVo);
	if(ratio.qeual("0")){
			return new PromotionMsg(true,"输入促销策略降价比例没有问题");
		}else{
			return new PromotionMsg(false,"输入促销策略降价比例有问题");
		}
}
}