package com.ieseljust.edd;

import java.util.Scanner;

public class Calcula {
    public static void main(String[] args) {
        
        int a,b;
        char operacion;
        

        Scanner t = new Scanner(System.in);
        System.out.println("Primer número");
        a = t.nextInt();
        System.out.println("Segundo número");
        b = t.nextInt();
        
        System.out.println("Operación");
        operacion = t.nextLine().charAt(0);
        t.nextLine();

        switch (operacion) {
            case 'S','s': 
                Calculadora.Sumar(a, b);           
                break;
            
            case 'R', 'r': 
                Calculadora.Restar(a, b);
                break;
            case 'M','m': 
                Calculadora.Multiplicar(a, b);
                break;
            case 'D','d': 
                Calculadora.Dividir(a, b);
                break;          
              
            default: System.out.println("no está bien");
                break;
        }
    }

}
