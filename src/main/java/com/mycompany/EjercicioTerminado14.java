package ejercicioterminado14;
import java.util.Scanner;
/**
 *
 * @author Luis Daniel Yepez G
 */
public class EjercicioTerminado14 {

    public static void main(String[] args) {
        double numero, resultadoc, resultadocb;
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Ingrese el numero: ");
        numero = entrada.nextDouble();
        
        resultadoc = CalculosNumericos.calcular_cuadrado(numero);
        resultadocb = CalculosNumericos.calcular_cubo(numero);
        
        System.out.println("El cuadrado de " + numero  + "es: " + resultadoc);
        System.out.println("El cubo de " + numero  + "es: " + resultadocb);
    }
    
}
