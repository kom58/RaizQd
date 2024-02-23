package raizquad;

import javax.swing.*;

public class Aplicacion {
    private JPanel panBase;
    private JButton btnCalcular;
    private JLabel txtResultado;
    private JTextField txtNumero;

    public Aplicacion() {

        btnCalcular.addActionListener(e -> hacerRaiz());
    }

    public void hacerRaiz (){

        RaizCuadrada rc = new RaizCuadrada();           // Crea objeto rc
        String numStr = txtNumero.getText();            // Lee el numStr
        double n = Double.parseDouble(numStr);          // Convierte numStr en double
        if ( n <= 0 ) {                                 // Comprueba números imposibles
            txtResultado.setText("La raíz de " + numStr + " no es posible ");
        }
        else {
            double raiz = rc.calcularRaizCuadrada(n);                       // LLamada a clase RaizCuadrada y retorna raiz
            txtResultado.setText("La raíz de " + numStr + " es " + raiz);   // Escribe el resultado
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
