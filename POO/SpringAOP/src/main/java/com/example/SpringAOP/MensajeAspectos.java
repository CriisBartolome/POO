package com.example.SpringAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MensajeAspectos {
    
    @Before(value= "execution(* com.example.SpringAOP.Mensaje.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Antes del método " + joinPoint.getSignature().getName());
        System.out.println("Leyendo mensaje...");
    }

    @After(value= "execution(* com.example.SpringAOP.Mensaje.escribirMensajeHola())")
    public void afterAdvice(JoinPoint joinPoint) {
        System.out.println("Después del método " + joinPoint.getSignature().getName());
        System.out.println("Mensaje leido...");
    }
}
