package businesslogicservice.IntegralBLService._Stub;

import java.util.ArrayList;

import vo.IntegralVO;
import vo.UserInfoVO.*;


public class StorageInBLService_Stub implements StorageInBLService{
	String integral;
	ArrayList<String> integralNote;
	public StorageInBLService_Stub(){
		integral = "0";
		integralNote = new ArrayList<String>(); 
	}
	
	public StorageInBLService_Stub(String integral,ArrayList<String> integralNote){
		this.integral = integral;
		this.integralNote = integralNote;
	}

//获得信用值
	@Override
	public IntegralVO getIntegral(UserInfoVO client) {
			return new IntegerVO(UserInfoVO.getCresit,null);
	}
//增加信用值
	@Override
	public IntegralVO addIntegral(UserInfoVO client,int value) {
		return new IntegerVO(UserInfoVO.getCresit+value,null);
	}
//减少信用值
	@Override
	public IntegralVO addIntegral(UserInfoVO client,int value) {
		return new IntegerVO(UserInfoVO.getCresit-value,null);
	}

//修改信用值
	@Override
	public IntegralVO changeIntegral(UserInfoVO client,int value) {
		return new IntegerVO(value,null)
	}
	
}