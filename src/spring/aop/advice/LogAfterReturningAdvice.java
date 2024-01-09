package spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterReturningAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("반환값을 가지고 뭘할거면 returnValue 이걸 사용");
		System.out.println("returnValue: "+ returnValue + "   method:" + method.getName());
	}

}
