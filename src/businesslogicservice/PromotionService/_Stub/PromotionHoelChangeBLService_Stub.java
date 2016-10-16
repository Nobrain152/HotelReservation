package businesslogicservice.PromotionService._Stub;
import java.util.ArrayList;

import businesslogic.util.*;


public class PromotionHotelBLService_Stub {
	String ratio;
	String timeBegin;
	String timeOver;
	public PromotionHotelBLService_Stub(){
		ratio = "0";
		timeBegin = "2016/10/10";
		timeOver = "2016/10/16";
	}
	public PromotionHotelBLService_Stub(String ratio,String timeBegin,String timeOver){
		this.ratio = ratio;
		this.timeBegin = timeBegin;
		this.timeOver = timeOver;
	}


	@Override
	public PromotionMsg changeBirthCut(String ratio) {
		if(ratio.qeual("0")){
			return new PromotionMsg(true,"输入促销策略降价比例没有问题");
		}else{
			return new PromotionMsg(false,"输入促销策略降价比例有问题");
		}
	}

	@Override
	public PromotionMsg changeOverCut(String ratio) {
		if(ratio.qeual("0")){
			return new PromotionMsg(true,"输入促销策略降价比例没有问题");
		}else{
			return new PromotionMsg(false,"输入促销策略降价比例有问题");
		}
	}

	@Override
	public PromotionMsg changeHotelCustomCut (String timeBegin,String timeOver, String ratio) {
		if(timeBegin.qeual("2016/10/10")){
			return new PromotionMsg(true,"输入促销策略开始时间没有问题");
		}else{
			return new PromotionMsg(false,"输入促销策略开始时间有问题");
		}
		if(timeOver.qeual("2016/10/16")){
			return new PromotionMsg(true,"输入促销策略结束时间没有问题");
		}else{
			return new PromotionMsg(false,"输入促销策略结束时间有问题");
		}
		if(ratio.qeual("0")){
			return new PromotionMsg(true,"输入促销策略降价比例没有问题");
		}else{
			return new PromotionMsg(false,"输入促销策略降价比例有问题");
		}
	}
	
}