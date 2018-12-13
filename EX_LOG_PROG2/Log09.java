         
         
         import javax.swing.JOptionPane;
         public class Log09{
         public static void main (String [] args) {
         
         
         int a = Integer.parseInt (JOptionPane.showInputDialog(" Digite o 1° Numero "));
         int b = Integer.parseInt (JOptionPane.showInputDialog(" Digite o 2° Numero "));
         int c = Integer.parseInt (JOptionPane.showInputDialog(" Digite o 3° Numero "));    
         int d = Integer.parseInt (JOptionPane.showInputDialog(" Digite o 4° Numero "));
         
         if ( a > b && b > c && c > d) {
          JOptionPane.showMessageDialog(null, " O menor é: " + d);
          }
         if (a > b && b > c && d > c) {
          JOptionPane.showMessageDialog(null, " O menor é: " + c);
          }
         if ( a > b && c > b && d > b) {
          JOptionPane.showMessageDialog(null, " O menor é: " + b);
          }
          if ( b > a && c > a && d > a) {
           JOptionPane.showMessageDialog(null, " O menor é: " + a);
           }
         if ( a == b && b == c && c == d) {
          JOptionPane.showMessageDialog(null, " Os numeros são iguais");
          
          }
          }
          }
         

         
         
         
         
