/*
 * To tell jersey that what resources are been made we use class that inherits from application
 * jersey is responsible for making the objects and return values
 */
package com.tienda.util;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.tienda.resouce.UserResource;

@ApplicationPath("/")          //Current base url is application path as well
public class TiendaApplication extends Application{

	@Override
	
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(UserResource.class);
		classes.add(TiendaExceptionMapper.class);
		return classes;
	}

	
}
