package com.collectionF.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//another method level annotation
//Let's imagine before serializing the object to a Json String
//we want to execute one method to initialize an object
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface init {
	
}
