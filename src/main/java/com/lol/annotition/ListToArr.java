package com.lol.annotition;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public  @interface  ListToArr{

    String value() default "";



}
