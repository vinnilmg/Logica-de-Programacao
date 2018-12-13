      
      
         
         import javax.swing.JOptionPane;
         public class Log08{
         public static void main (String [] args) {
         
         int m, c, d, u;
         int n = Integer.parseInt ( JOptionPane.showInputDialog (" Digite um numero com 4 Digitos "));
         
         m = n/1000;
         c = ((n-(m*1000))/100);
         d = n/10-((m*100)+(c*10));
         u = n%10;
         
         if( m == u && c == d) {
         
         JOptionPane.showMessageDialog (null, " É Palíndromo!");
         
        }
        else {
         JOptionPane.showMessageDialog (null, " Não é Palíndromo!");
         }
         
         }
         }
         
         