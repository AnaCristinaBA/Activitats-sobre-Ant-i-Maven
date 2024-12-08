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
            //System.out.println("Con tu permiso voy a proceder a hacer la suma de los siguientes números" +a+ "i" +b+ "lo que resulta en la suma: "+(a+b));
                break;
            
            case 'R', 'r': 
                Calculadora.Restar(a, b);
            //System.out.println("Con tu permiso voy a proceder a hacer la resta de los siguientes números" +a+ "i" +b+ "lo que resulta en la suma: "+(a-b));
                break;
            case 'M','m': 
                Calculadora.Multiplicar(a, b);
            //System.out.println("Con tu permiso voy a proceder a hacer la multiplicación de los siguientes números" +a+ "i" +b+ "lo que resulta en la suma: "+(a*b));
                break;
            case 'D','d': 
                Calculadora.Dividir(a, b);
            //System.out.println("Con tu permiso voy a proceder a hacer la división de los siguientes números" +a+ "i" +b+ "lo que resulta en la división: "+(a/b));
                break;          
              
            default: System.out.println("¿Qué dise pndjo?");
                break;
        }
    }

}
