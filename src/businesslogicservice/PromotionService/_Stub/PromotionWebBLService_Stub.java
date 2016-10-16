package businesslogicservice.PromotionService._Stub;
import java.util.ArrayList;

import businesslogic.util.*;


public class PromotionWebBLService_Stub {
	String ratio;
	String timeBegin;
	String timeOver;
	int maxLevel = 10;
	int minLevel = 1;
	public PromotionWebBLService_Stub(){
		ratio = "0";
		timeBegin = "2016/10/10";
		timeOver = "2016/10/16";
	}
	public PromotionWebBLService_Stub(String ratio,String timeBegin,String timeOver){
		this.ratio = ratio;
		this.timeBegin = timeBegin;
		this.timeOver = timeOver;
	}


	@Override
	public PromotionMsg changeLevelCut(int level,String ratio) {
		if(level>=minLevel&&level<=maxLevel){
			return new PromotionMsg(true,"输入促销策略降价比例没有问题");
		}else{
			return new PromotionMsg(false,"输入促销策略降价比例有问题");
		}
		
		if(ratio.qeual("0")){
			return new PromotionMsg(true,"输入促销策略降价比例没有问题");
		}else{
			return new PromotionMsg(false,"输入促销策略降价比例有问题");
		}
	}

	@Override
	public PromotionMsg changeCircleCut(String ratio) {
		if(ratio.qeual("0")){
			return new PromotionMsg(true,"输入促销策略降价比例没有问题");
		}else{
			return new PromotionMsg(false,"输入促销策略降价比例有问题");
		}
	}

	@Override
	public PromotionMsg changeWebCustomCut (String timeBegin,String timeOver, String ratio) {
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