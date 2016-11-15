package businesslogicserviceimpl.userblserviceimpl;

import static org.junit.Assert.assertEquals;

import businesslogicservice.userblservice.Customer;
import vo.CustomerInfoVO;

public class CustomerTest {
	private CustomerInfoVO vo;
	private Customer cu;
	
	public void setup(){
		vo=new CustomerInfoVO("1234567","Jerry","13067893451",100);
		cu=new Customer("1234567");
		
	}
	
	public void testinquiry(){
		assertEquals(cu.getid(),"1234567");
		assertEquals(cu.getname(),"Jerry");
		assertEquals(cu.getcontact(),"13067893451");
	}
	
	public void testmodify(){
		CustomerInfoVO vo1=new CustomerInfoVO("1234567","Tom","13067893451",100);
		boolean cantest=cu.BaseInfoModification(vo1);
		if(cantest){
			assertEquals(cu.getid(),"1234567");
			assertEquals(cu.getname(),"Tom");
			assertEquals(cu.getcontact(),"13067893451");
			
		}
	}
}
