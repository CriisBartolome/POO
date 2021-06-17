package com.example.SpringAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MensajeAspectos {
    
    @Before(value = "execution(* com.example.SpringAOP.Mensaje.*(..))")
    public void ejecutarAntes(JoinPoint joinPoint) {
        System.out.println("Antes del método " + joinPoint.getSignature().getName());
        System.out.println("Leyendo mensaje...");
    }

    @After(value = "execution(* com.example.SpringAOP.Mensaje.escribirMensajeHola())")
    public void ejecutarDespues(JoinPoint joinPoint) {
        System.out.println("Después del método " + joinPoint.getSignature().getName());
        System.out.println("Mensaje leido...");
    }
    
    @Around(value = "execution(* com.example.SpringAOP.Mensaje.getNumEjecuciones())")
    public int ejecutarAlRededor(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Obteniendo el número de ejecuciones...");
        int totalEjecuciones = (int) proceedingJoinPoint.proceed();
        System.out.println("Total: " + totalEjecuciones);
        return totalEjecuciones;
    }
    
    @Around(value = "@annotation(MiAnotacionAspectos)")
    public int ejecutarAlRededorConAnotacion(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature method = (MethodSignature) proceedingJoinPoint.getSignature();
        MiAnotacionAspectos anotacion = method.getMethod().getAnnotation(MiAnotacionAspectos.class);
        System.out.println(anotacion.mensaje());
        System.out.println("Obteniendo el número de ejecuciones de método()...");
        int totalEjecuciones = (int) proceedingJoinPoint.proceed();
        System.out.println("Total: " + totalEjecuciones);
        return totalEjecuciones;
    }
}
