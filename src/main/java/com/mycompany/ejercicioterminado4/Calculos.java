package com.mycompany.ejercicioterminado4;

/**
 *
 * @author Luis Daniel Yepez G
 */
public class Calculos {
    
    static double calcular_edalber(double edjuan){
        double edalber = 2 * (edjuan/3);
        return edalber;
    
}
    
    static double calcular_edana(double edjuan){
        double edana = 4 * (edjuan/3);
        return edana;
    
}
    static double calcular_edamama(double edjuan, double edalber, double edana){
        double edamama = edjuan + edalber + edana;
        return edamama;
    
}
}
