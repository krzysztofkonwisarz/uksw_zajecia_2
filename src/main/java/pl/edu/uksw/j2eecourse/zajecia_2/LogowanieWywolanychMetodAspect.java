package pl.edu.uksw.j2eecourse.zajecia_2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogowanieWywolanychMetodAspect {

    @After("execution(* pl.edu.uksw.j2eecourse.zajecia_2.*.*(..))")
    public void logujWywolanieMetody(JoinPoint joinPoint) {

        System.out.println("Wywołano metodę: " + joinPoint.getSignature().getName());

    }

}
