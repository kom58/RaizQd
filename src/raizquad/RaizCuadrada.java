package raizquad;

public class RaizCuadrada {

    public double calcularRaizCuadrada (double n ) {
        if ( n >= 0 ) {
            return Math.sqrt(n);
        }
        else {
            return -1;      // En esta aplicación no es necesaria
        }
    }
}
