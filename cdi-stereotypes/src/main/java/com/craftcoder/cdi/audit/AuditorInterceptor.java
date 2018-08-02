package com.craftcoder.cdi.audit;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor @Auditable @Priority(Interceptor.Priority.APPLICATION)
public class AuditorInterceptor {

	@Inject
	private Auditor auditor;

	@AroundInvoke
	public Object audit(InvocationContext ic) throws Exception {
		
		auditor.audit();

		Object result = ic.proceed();

		return result;
	}	
	
}
