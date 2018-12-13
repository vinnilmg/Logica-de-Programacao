import javax.swing.JOptionPane;
public class Log01{
   public static void main (String [] args) {
   
   double A = Double.parseDouble ( JOptionPane.showInputDialog (" Informe o 1° Numero: "));
   double B = Double.parseDouble ( JOptionPane.showInputDialog (" Informe o 2° Numero: "));
   double C = Double.parseDouble ( JOptionPane.showInputDialog (" Informe o 3° Numero: "));
   
   
   
  double x = 2* (( A - C)/8) - B *5;
   
    JOptionPane.showMessageDialog(null, " O resultado é: " + x); 
   }
   }
   
   
   
   
