package vo;

import java.util.ArrayList;

import businesslogic.util.OrderState;
import businesslogic.util.RoomType;

/**
 * �ͻ�����VO
 * 
 * @author txin
 *
 */
public class OrderOnUserVO extends OrderVO{
	
	/**
	 * ����������
	 */
	public String initiator;
	
	/**
	 * ����״̬
	 */
	public OrderState orderState;
	
	/**
	 * ��סʱ��
	 */
	public Date checkInTime;
	
	/**
	 * �˷�ʱ��
	 */
	public Date checkOutTime;
	
	/**
	 * ����ִ��ʱ��
	 */
	public Date latestExecutionTime;
	
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
	
	public OrderOnUserVO(String initiator,OrderState orderState,Date checkInTime,Date checkOutTime,
		Date latestExecutionTime,RoomType roomType,int roomNumber,int peopleNumber,boolean hasChild) {
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
	
	public Date getCheckInTime() {
		return checkInTime;
	}
	
	public Date getCheckOutTime() {
		return checkOutTime;
	}
	
	public Date getLatestExecutionTime() {
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
