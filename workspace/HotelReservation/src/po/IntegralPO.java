package po;

import java.util.ArrayList;

import java.io.Serializable;

/**
 * 
 * ��������ֵ���PO
 * 
 * @author kevin
 *
 */

public class IntegralPO implements Serializable {

	private static final long serialVersionUID = 1L;
	public IntegralPO(int integral,ArrayList<String> integralRecord) {
		// TODO Auto-generated constructor stub
		super();
		this.integral = integral;
		this.integralRecord = integralRecord;
	}
	
	/**
	 * ����ֵ
	 */
	int integral ;
	
	/**
	 * ����ֵ��ֵ��¼
	 *
	 */
	ArrayList<String> integralRecord ;
	
	public int getIntegral() {
		return integral;
	}
	
	public ArrayList<String> getIntegralRecord() {
		return integralRecord;
	}
	
}
