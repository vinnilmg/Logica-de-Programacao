import javax.swing.JOptionPane;
public class Log02{
   public static void main (String [] args) {
   
   double raio = Double.parseDouble ( JOptionPane.showInputDialog (" Informe o raio do círculo: "));
   double area, perimetro;
   double pi = 3.14159;
   
   area = pi * raio * raio;
   perimetro = 2 * pi * raio;
   
   JOptionPane.showMessageDialog(null," A area do circulo é: " + area + " e o perimetro: " + perimetro );
}
}
  
   
   
   
   