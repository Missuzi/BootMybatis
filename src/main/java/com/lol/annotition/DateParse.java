package com.lol.annotition;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author xuleicai
 * @Description:自定义注解
 * @Date 2019/12/18 14:11
 */
@Target(ElementType.FIELD)//作用于字段
@Retention(RetentionPolicy.SOURCE)//保留到运行期
public @interface DateParse {

    String format() default "yyyy-MM-dd HH:mm:ss";


}


