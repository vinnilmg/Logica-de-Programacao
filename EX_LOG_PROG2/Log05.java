        
         import javax.swing.JOptionPane;
         public class Log05{
         public static void main (String [] args) {
         
         int pessoa = Integer.parseInt(JOptionPane.showInputDialog ( " Digite o numero de pessoas " ));
         int dia = Integer.parseInt (JOptionPane.showInputDialog (" Digite o numero de dias"));
         double valor;
         
         if ( pessoa >= 1 && pessoa <= 4) {
         valor = 110/(pessoa*dia);
         
         JOptionPane.showMessageDialog (null, " Valor a ser pago: " + valor );
         }
         
         if (pessoa >= 5 && pessoa <=8) {
         valor = 105/(pessoa*dia);
         JOptionPane.showMessageDialog (null, " Valor a ser pago: " + valor);
         }
         
         if (pessoa > 8) {
         valor = 98/(pessoa*dia);
         JOptionPane.showMessageDialog (null, " Valor a ser pago: " + valor);
         }
         
         }
         }
         
         
         