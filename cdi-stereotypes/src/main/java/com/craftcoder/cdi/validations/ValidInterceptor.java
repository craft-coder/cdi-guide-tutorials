package com.craftcoder.cdi.validations;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import com.craftcoder.cdi.model.Sale;

@Interceptor @Valid @Priority(Interceptor.Priority.APPLICATION)
public class ValidInterceptor {

	@AroundInvoke
	public Object valid(InvocationContext ic) throws Exception {

		Sale sale = (Sale) ic.getParameters()[0];
		
		if( sale != null ) {
			
			return ic.proceed();
		}else {
			
			throw new Exception("Sale Invalid");
		}
	}	
}
