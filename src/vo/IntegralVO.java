package vo;

import java.util.ArrayList;

/**
 * ����ֵVO
 * 
 * @author kevin
 *
 */

public class IntegralVO {
	/**
	 * �û�����ֵ
	 */
	int integral;
	/**
	*  ����ֵ�޸ļ�¼
	*/
	ArrayList<String> integralNote;
	
	public IntegralVO(int integral,ArrayList<String> integralNote) {
		// TODO Auto-generated constructor stub
		this.integral = integral;
		this.integralNote = integralNote;
	}
	
	public int getIntegral() {
		return integral;
	}
	
	public ArrayList<String>  getIntegralNote() {
		return integralNote;
	}
}
