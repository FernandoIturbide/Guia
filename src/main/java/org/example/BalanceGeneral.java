package org.example;

import java.util.Random;
import java.util.Scanner;

public class BalanceGeneral {
    public static void main(String[] args) {
        int Cont=1,Respuesta=1,opcio=0;
        int numero;
        Metodos metodos=new Metodos();
        Scanner i = new Scanner(System.in);
        while (Cont==1){
            numero= (int)(Math.random()*25);
            System.out.println("¿A qué pertenece \"" + metodos.Escoger(numero)+"\"?");
            metodos.opciones();
            Respuesta=i.nextInt();
            if (Respuesta==5){
                metodos.opciones2();
                Respuesta=i.nextInt();
            }
            if ((opcio=metodos.Conversion(numero))==Respuesta){
                System.out.println("Correcto");
            }else {
                System.out.println("Incorrecto");
            }
            System.out.println("¿Quieres otro?\n(1) Si\n(2) No");
            Cont=i.nextInt();
        }
    }
}
