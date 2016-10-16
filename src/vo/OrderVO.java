package vo;

import businesslogic.util.OrderState;
import businesslogic.util.RoomType;

/**
 * ���ж���VO�ĸ���
 * 
 * @author txin
 *
 */
public abstract class OrderVO {
	/**
	 * ����������
	 */
	public String initiator;
	
	/**
	 * �۸�
	 */
	public int price;
	
	/**
	 * ����״̬
	 */
	public OrderState orderState;

	/**
	 * ��������
	 */
	public RoomType roomType;
	
	/**
	 * ��������
	 */
	public int roomNumber;
	
	/**
	 * ��ס����
	 */
	public int peopleNumber;
	
	/**
	 * �Ƿ�Я����ͯ
	 */
	public boolean hasChild;

	public boolean hasChild() {
        return hasChild;
    }

    public String getInitiator() {
        return initiator;
    }
	
	public OrderState getOrderState() {
		return orderState;
	}
	
	public String getRoomType() {
		return roomType;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public int getPeopleNumber() {
		return peopleNumber;
	}
	
	public int getPrice(){
		return price;
	}
	
	public boolean hasChild() {
        return hasChild;
    }

    public String setInitiator(String initiator) {
        this.initiator = initiator;
    }
	
	public OrderState setOrderState(OrderState orderState) {
		this.orderState = orderState;
	}
	
	public RoomType setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	
	public int setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public int setPeopleNumber(int peopleNumber) {
		this.peopleNumber = peopleNumber;
	}
}
