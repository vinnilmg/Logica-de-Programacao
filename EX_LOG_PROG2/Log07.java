      
      
         import javax.swing.JOptionPane;
         public class Log07{
         public static void main (String [] args) {
         
         double x = Double.parseDouble ( JOptionPane.showInputDialog (" Digite o valor "));
         double y;
         
         if ( x >= 0) {
         
         y = ((5*x + 3) / ((x*x)-16));
         
         JOptionPane.showMessageDialog (null, " A resposta �: " + y);
         
         }
         
         else {
         
         JOptionPane.showMessageDialog (null, " N�o se pode fazer a conta.");
         }
         }
         }  

      