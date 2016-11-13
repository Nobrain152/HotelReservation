package po;

import java.io.Serializable;

import businesslogic.util.User;
import businesslogic.util.OrderState;

/**
 * 所有订单VO的父类
 * 
 * @author txin
 *
 */
public abstract class OrderPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4372713957287414663L;

	/**
	 * 订单发起人
	 */
	public User initiator;
	
	/**
	 * 价格
	 */
	public int price;
	
	/**
	 * 订单状态
	 */
	public OrderState orderState;
	
    public User getInitiator() {
        return initiator;
    }
	
	public OrderState getOrderState() {
		return orderState;
	}
	
	public int getPrice(){
		return price;
	}

    public void setInitiator(User initiator) {
        this.initiator = initiator;
    }
	
	public void setOrderState(OrderState orderState) {
		this.orderState = orderState;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
