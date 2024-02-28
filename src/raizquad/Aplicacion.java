package raizquad;

import javax.swing.*;

public class Aplicacion {
    private JPanel panBase;
    private JButton btnCalcular;
    private JLabel txtResultado;
    private JTextField txtNumero;

    public Aplicacion() {

        btnCalcular.addActionListener(e -> hacerRaiz());
        txtNumero.addActionListener(e -> hacerRaiz());
    }

    public void hacerRaiz (){

        RaizCuadrada rc = new RaizCuadrada();           // Crea objeto rc
        String numStr = txtNumero.getText();            // Lee el numStr
        double n = Double.parseDouble(numStr);          // Convierte numStr en double
        String nStr;

        if ( n <= 0 ) {                                 // Comprueba números imposibles
            txtResultado.setText("La raíz de " + numStr + " IS NOT POSSIBLE ");
        }
        else {
            double raiz = rc.calcularRaizCuadrada(n);                       // LLamada a clase RaizCuadrada y retorna raiz
            if (raiz == Math.round(raiz)){                                  // Comprueba si raís es exacta
                nStr = "" + (Math.round(raiz)); }                           // Si es exacta quita .0000
            else {
                nStr = String.format(" %.4f",raiz);                         // Si no es exacta redondea a 4 decimales
            }
            txtResultado.setText("La raíz de " + numStr + " es " + nStr);   // Escribe el resultado
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicación raíz cuadrada");
        frame.setContentPane(new Aplicacion().panBase);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
