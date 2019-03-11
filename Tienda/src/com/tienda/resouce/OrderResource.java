package com.tienda.resouce;

import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tienda.bean.Order;
import com.tienda.service.TiendaService;
import com.tienda.util.OrderNotFoundException;


public class OrderResource {				//sub resource
	
	@GET
	@Produces(value = {MediaType.APPLICATION_XML ,MediaType.APPLICATION_JSON})
	@Path("{ord-num}")
	public Order fetchOrderDetailsForUser(@PathParam("uname") String username,@PathParam("ord-num") String number) throws OrderNotFoundException
	{
		Order order;
		order = new TiendaService().getOrderDetailsForUser(username, number);
		return order;
	}
	
	@GET
	@Produces(value = {MediaType.APPLICATION_XML ,MediaType.APPLICATION_JSON})
	
	public Set<Order> fetchAllOrderForUser(@PathParam("uname")String username)
	{
		Set<Order> orders;
		orders = new TiendaService().getAllOrdersForUser(username);
		return orders;
	}
	
	@POST
	@Consumes(value = {MediaType.APPLICATION_XML ,MediaType.APPLICATION_JSON})
	public void createOrder(Order order){
		System.out.println(order.getNumber());
		System.out.println(order.getOrderOn());
	}
}	
