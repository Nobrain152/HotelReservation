package businesslogicserviceimpl.userblserviceimpl;

import java.util.ArrayList;

import businesslogicservice.userblservice.WebManagerHotelOperationBlService;
import dataserviceimpl.userdataserviceimpl.UserManagementDataServiceImpl;
import vo.HotelIDVO;
import vo.HotelInfoVO;
import vo.UserIDVO;


/**
 * ��վ������Ա�ԾƵ�Ĳ���
 * @author �ܳ�
 *
 */
public class WebManagerHotelOperationBlServiceImpl implements WebManagerHotelOperationBlService {

	UserManagementDataServiceImpl check;
	
	public WebManagerHotelOperationBlServiceImpl(){
		check=new UserManagementDataServiceImpl();
	}
	
	/**
	 * ���ӾƵ�	
	 * @param �Ƶ���ϢVO
	 */
	public void HotelAdd(HotelInfoVO vo){
		
	}
			
	/**
	 * ���ӾƵ깤����Ա
	 * @param �Ƶ�IDVO
	 * @param �û�IDVO
	 */
	public boolean StuffAdd(HotelIDVO vo1,UserIDVO vo2){
		return check.addHotelStuff(vo1,vo2);
	}


	/**
	 * �鿴�Ƶ��б�
	 * @return �Ƶ���Ϣ�б�
	 */
	public ArrayList<HotelInfoVO> HotelScan() {
		// TODO Auto-generated method stub
		return null;
	}


}