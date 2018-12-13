      
         
         import javax.swing.JOptionPane;
         public class Log01{
         public static void main (String [] args) {
         
         double x = 1, media = 0;
         int cont=0;
         
         while ( x != 0) {
         
         x = Double.parseDouble (JOptionPane.showInputDialog (" Digite um numero "));
         cont++;
         
         media = x + media;
         }
         
         JOptionPane.showMessageDialog (null, " A media é " + (media)/(cont));
         }
         }