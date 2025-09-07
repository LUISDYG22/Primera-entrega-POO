package ejercicioterminado15;

/**
 *
 * @author Luis Daniel Yepez G
 */
public class CalculosCirculo {
    static double calcular_area( double radio){
    double resultado = Math.PI * (Math.pow(radio,2));
    return resultado;
    }
    
    static double calcular_longitud(double radio){
    double respuesta = 2 * Math.PI * radio;
    return respuesta;
    }
    
}
