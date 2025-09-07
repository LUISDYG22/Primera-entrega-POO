package ejercicioterminado12;

/**
 *
 * @author Luis Daniel Yepez G
 */
public class C_Salario {
    static double calcular_salario_bruto(double horas_laboradas, double v_hora) {
        double salario_bruto = horas_laboradas * v_hora;
        return salario_bruto;
    }
    
    static double calcular_porcentaje (double porcentaje){
        double porcentaje_retencion = porcentaje / 100;
        return porcentaje_retencion;
    }
    
    static double calcular_retencion_fuente (double porcentaje_retencion, double salario_bruto){
        double retencion_fuente = salario_bruto * porcentaje_retencion;
        return retencion_fuente;
    }
    
    static double calcular_salario_neto (double salario_bruto, double retencion_fuente){
        double salario_neto = salario_bruto - retencion_fuente;
        return salario_neto;
    }
}

