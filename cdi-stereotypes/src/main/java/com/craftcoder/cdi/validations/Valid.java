package com.craftcoder.cdi.validations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.interceptor.InterceptorBinding;

@InterceptorBinding
@Documented
@Retention(RUNTIME)
@Target({ ElementType.METHOD, ElementType.TYPE})
public @interface Valid {

}
