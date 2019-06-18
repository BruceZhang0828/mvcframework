package com.zhy.mvcframework.annotation;

import java.lang.annotation.*;
//Target指定注解修饰的那些程序单元
@Target({ElementType.FIELD})
//被修饰的注解被保留多长时间 SOURCE源码阶段,ClASS字节码文件中;RUNTIME运行时通过反射获取到
@Retention(RetentionPolicy.RUNTIME)
@Documented //被javadoc工具提取成文档
public @interface GPAutowired {
    String value() default "";
}
