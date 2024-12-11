package com.ieseljust.edd;

public class Calculadora {
    public static int Sumar(int a, int b){
        return(a+b);
    }
    public static int Restar(int a, int b){
        return(a-b);
    }
    public static int Multiplicar(int a, int b){
        return(a*b);
    }
    public static int Dividir(int a, int b){
        if (b==0) {
            System.out.println("No se puede dividir entre 0");
            return(0);
        }
        else {return(a/b);}
    }
}
