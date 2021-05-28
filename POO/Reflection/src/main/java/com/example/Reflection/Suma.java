package com.example.Reflection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Suma {

    private int sumando1;
    private int sumando2;

    public int sumar() {
        System.out.print(this.sumando1 + " + " + this.sumando2);
        return this.sumando1 + this.sumando2;
    }
    
    public int sumar(int sumando1, int sumando2) {
        this.sumando1 = sumando1;
        this.sumando2 = sumando2;
        return sumar();
    }

}
