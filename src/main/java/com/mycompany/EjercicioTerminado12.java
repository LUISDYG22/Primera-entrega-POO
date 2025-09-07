package ejercicioterminado12;
import java.util.Scanner;
/**
 *
 * @author Luis Daniel Yepez G
 */
public class EjercicioTerminado12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner calculos = new Scanner(System.in);
        double horas_trabajadas, v_hora, porcentaje_retencion;
        double salario_bruto, salario_neto, retencion_fuente, porcentaje;
        
        
        System.out.println("Ingrese horas trabajadas: ");
        horas_trabajadas = calculos.nextDouble();
        System.out.println("Ingrese el valor de la hora: ");
        v_hora = calculos.nextDouble();
        System.out.println("Ingrese porcentaje de retencion: ");
        porcentaje_retencion = calculos.nextDouble();
        
        salario_bruto=C_Salario.calcular_salario_bruto(horas_trabajadas,v_hora);
        porcentaje = C_Salario.calcular_porcentaje(porcentaje_retencion);
        retencion_fuente = C_Salario.calcular_retencion_fuente(porcentaje, salario_bruto);
        salario_neto = C_Salario.calcular_salario_neto(salario_bruto, retencion_fuente);
        
        System.out.println("Su salario Neto es: " + salario_neto);
        System.out.println("El valor de retencion es: " + retencion_fuente);        
        
    }
    
}
