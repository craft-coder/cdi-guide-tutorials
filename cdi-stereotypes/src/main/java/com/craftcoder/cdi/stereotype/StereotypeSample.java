package com.craftcoder.cdi.stereotype;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.enterprise.inject.Stereotype;

import com.craftcoder.cdi.audit.Auditable;
import com.craftcoder.cdi.validations.Valid;

@Stereotype
@Auditable
@Valid
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface StereotypeSample {

	//this annotation will join other annotations  
	
}
