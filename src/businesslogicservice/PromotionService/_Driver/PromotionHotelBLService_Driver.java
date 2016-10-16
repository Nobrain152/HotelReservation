package businesslogicservice.PromotionHotelBLService._Driver;

package businesslogicservice.PromotionHotelBLService._Stub;

import java.util.ArrayList;

import vo.PromotionHotelVO;
import vo.UserInfoVO.*;
import businesslogicservice.commodityblservice_Stub;

public class PromotionHotelBLService_Driver {
public static void main(String[] args){
	PromotionHotelBLService a=new PromotionHotelBLService_Stub();
	PromotionHotelBLService_Driver b=new PromotionHotelBLService_Driver();
	b.drive(a);
	
}
public void drive(PromotionHotelBLService a){
	ArrayList<Sting> info = new ArrayList<String>();
	PromotionHotelVO Integra=new PromotionHotelVO(HOTEL_CUSTOM_PROMOTION,"会员","2016/10/10","2016/10/15","80");
	ArrayList<PromotionHotelVO> IntegraInfo=new ArrayList<PromotionHotelVO> ();
	IntegraInfo.add(Integra);
	StorageInVO	putInStorageVo=new StorageInVO(HOTEL_CUSTOM_PROMOTION,"会员","2016/10/10","2016/10/15","80");
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