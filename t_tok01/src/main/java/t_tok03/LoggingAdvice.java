package t_tok03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class LoggingAdvice {

	public void beforeAdvice() {
		System.out.println("---메소드 실행전 로그 출력");
	}
	
	public void beforeBuyConfirm() {
		System.out.println("구매전 아이템 확인 필수");
	}
	
	public void afterAdvice() {
		System.out.println("구매 완료");
	}
	
	public void aroundAdivce(ProceedingJoinPoint joinPoint) throws Throwable {
	
		//추가 로직
		Signature method = joinPoint.getSignature();
		System.out.println("내가 실행한 메소드 " + method.getName());
		
		//메소드 실행
		joinPoint.proceed();
		
		//추가 로직
		if("buyGoods".equals(method.getName())) {
			System.out.println("Goods를 구매해주셔서 감사합니다");
		} else {
			System.out.println("Item을 구매해주셔서 감사합니다.");
		}
	}
}
