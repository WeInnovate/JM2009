package com.wellnwill.jm2009.learn.annotation.custom;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface ClassInfo {
	
	String author();

	String creationDate();

	String[] reviewers();

	int numberOfMethods();

	String message();
}
