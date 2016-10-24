package businesslogic.util;

import businesslogic.util.OrderState;

/**
 * ������Ϣ
 * 
 * @author txin
 *
 */
public class OrderMsg extends ResultMsg{
	
	/**
	 * ����������
	 */
	private String initiator;
	
	/**
	 * ����״̬
	 */
	
	public OrderMsg(String initiator,OrderState orderState) {
		super();
		this.initiator = initiator;
		this.orderState = orderState;
	}
	
	@Override
	public String toString(){
		return initiator;
	}
	
    public String getInitiator() {
        return initiator;
    }
	
	public OrderState getOrderState() {
		return orderState;
	}

}
