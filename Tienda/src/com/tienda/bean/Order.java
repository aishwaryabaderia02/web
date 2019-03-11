package com.tienda.bean;

import java.util.Date;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

import com.tienda.util.OrderStatus;
@XmlRootElement(name = "order")
public class Order {
	private int OrderId;
	private String number;
	private Date orderOn;
	private User orderBy;
	private OrderStatus status;
	private Set<Product> cart;
	
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, String number, Date orderOn, User orderBy,
			OrderStatus status, Set<Product> cart) {
		super();
		OrderId = orderId;
		this.number = number;
		this.orderOn = orderOn;
		this.orderBy = orderBy;
		this.status = status;
		this.cart = cart;
	}

	public int getOrderId() {
		return OrderId;
	}
	
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public Date getOrderOn() {
		return orderOn;
	}
	
	public void setOrderOn(Date orderOn) {
		this.orderOn = orderOn;
	}
	
	public User getOrderBy() {
		return orderBy;
	}
	
	public void setOrderBy(User orderBy) {
		this.orderBy = orderBy;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public Set<Product> getCart() {
		return cart;
	}
	public void setCart(Set<Product> cart) {
		this.cart = cart;
	}
	
	
}
