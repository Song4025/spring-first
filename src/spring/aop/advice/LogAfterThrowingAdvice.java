package spring.aop.advice;


import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdvice implements ThrowsAdvice{
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("예외가 발생하면 실행하는 메소드" + e.getMessage());
	}
}
