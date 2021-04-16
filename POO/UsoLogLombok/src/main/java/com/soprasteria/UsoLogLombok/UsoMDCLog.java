package com.soprasteria.UsoLogLombok;

import org.slf4j.MDC;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UsoMDCLog {
    private String dato1;
    private String dato2;
        
    public UsoMDCLog(String dato1, String dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    public void agregarDatosMDC() {
        MDC.put("dato1.id", dato1);
        MDC.put("dato2.id", dato2);
        escribirLogInfo();
    }

    private void escribirLogInfo() {
        log.info("Hola mundo");
        log.info("Hola mundo {} {}", MDC.get("dato1.id"), MDC.get("dato2.id"));
    }

}
