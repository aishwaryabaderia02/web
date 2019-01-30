//Declaring attributes in annotation : only certain types of data type are allowed primitive type,String,class annotation 
//To know at the runtime via reflection if annotation is applied or not use retention annotation
//to make attribute optional set a default value (if attribute is not specified it will take the string no name)
package com.psl.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestThis {
	public String name() default "<no-name>";
}
