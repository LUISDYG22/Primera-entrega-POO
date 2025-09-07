package ejercicioterminado15;
import java.util.Scanner;
/**
 *
 * @author Luis Daniel Yepez G
 */
public class EjercicioTerminado15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double radio, area, longitud;
        
        System.out.println("Ingrese el radio del circulo: ");
        radio = entrada.nextDouble();
        
        area = CalculosCirculo.calcular_area(radio);
        longitud = CalculosCirculo.calcular_longitud(radio);
        
        System.out.println("El area del circulo es: " + area);
        System.out.println("La longitud del circulo es: " + longitud);
        
    }   
}
