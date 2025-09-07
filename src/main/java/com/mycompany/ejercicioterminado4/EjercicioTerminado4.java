package com.mycompany.ejercicioterminado4;

/**
 *
 * @author Luis Daniel Yepez G
 */
public class EjercicioTerminado4 {

    public static void main(String[] args) {
        double edjuan = 9, edalber, edana, edmama;
        edalber = Calculos.calcular_edalber(edjuan);
        edana = Calculos.calcular_edana(edjuan);
        edmama = Calculos.calcular_edamama(edjuan, edalber, edana);
        
        System.out.println("LAS EDADES SON: ");
        System.out.println("ALBERTO: " + edalber);
        System.out.println("JUAN: " + edjuan);
        System.out.println("ANA: " + edana);
        System.out.println("MAMA: " + edmama);
        
        
    }
}
