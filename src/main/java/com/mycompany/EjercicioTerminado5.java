package com.mycompany.ejercicioterminado5;
import java.util.Scanner;
        
/**
 *
 * @author Luis Daniel Yepez G
 */
public class EjercicioTerminado5 {

    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);
        double suma, x, y;
        
        System.out.println("Ingrese un valor para suma: ");
        suma = valores.nextDouble();
        
        System.out.println("Ingrese un valor para x: ");
        x = valores.nextDouble();
        
        System.out.println("Ingrese un valor para y: ");
        y = valores.nextDouble();
        
        
        suma = CalculosN.calcular_suma(suma, x);
        x = CalculosN.calcular_x(x, y);
        
        suma = suma + (x/y);
        System.out.println("El valor de la suma es: " + suma);
    }
}
