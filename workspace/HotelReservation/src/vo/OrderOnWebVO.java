package vo;

import businesslogic.util.User;
import businesslogic.util.OrderState;

/**
 * �ͻ�����VO
 * 
 * @author txin
 *
 */
public class OrderOnWebVO extends OrderVO{
	
	/**
	 * ��������
	 */
	public String reason;
	
	public OrderOnWebVO(User initiator,OrderState orderState,int price,String reason) {
		this.initiator = initiator;
		this.orderState = orderState;
		this.price = price;
		this.reason = reason;
	}

    public User getInitiator() {
        return initiator;
    }
	
	public OrderState getOrderState() {
		return orderState;
	}

	public String getReason() {
		return reason;
	}
	
}
