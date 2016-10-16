package businesslogic.util;

import businesslogic.util.OrderState;
import businesslogic.util.RoomType;

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
	public OrderState orderState;
	
	/**
	 * ��סʱ��
	 */
	public String checkInTime;
	
	/**
	 * �˷�ʱ��
	 */
	public String checkOutTime;
	
	/**
	 * ����ִ��ʱ��
	 */
	public String latestExecutionTime;
	
	/**
	 * ��������
	 */
	public String roomType;
	
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
	
	public OrderMsg(String initiator,OrderState orderState,String checkInTime,String checkOutTime,
		String latestExecutionTime,RoomType roomType,int roomNumber,int peopleNumber,boolean hasChild) {
		super();
		this.initiator = initiator;
		this.orderState = orderState;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.latestExecutionTime = latestExecutionTime;
		this.roomType = roomType;
		this.roomNumber = roomNumber;
		this.peopleNumber = peopleNumber;
		this.hasChild = hasChild;
	}
	
	@Override
	public String toString(){
		return initiator;
	}
	
    public boolean hasChild() {
        return hasChild;
    }

    public String getInitiator() {
        return initiator;
    }
	
	public OrderState getOrderState() {
		return orderState;
	}
	
	public String getCheckInTime() {
		return checkInTime;
	}
	
	public String getCheckOutTime() {
		return checkOutTime;
	}
	
	public String getLatestExecutionTime() {
		return latestExecutionTime;
	}
	
	public RoomType getRoomType() {
		return roomType;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public int getPeopleNumber() {
		return peopleNumber;
	}
}
