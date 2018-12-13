         
         import javax.swing.JOptionPane;
         public class Log06{
         public static void main (String [] args) {
         
         double a = Double.parseDouble (JOptionPane.showInputDialog( " Digite o primeiro numero"));
         double b = Double.parseDouble (JOptionPane.showInputDialog(" Digite o segundo numero"));
         double c = Double.parseDouble (JOptionPane.showInputDialog (" Digite o terceiro numero"));
         double delta, x1, x2;
         
       
         delta = (b*b) -4*(a*c);
         
         if ( delta >= 0){
          x1 = (-b - Math.sqrt(delta)) / (2*a);
          x2 = (-b + Math.sqrt(delta)) / (2*a);
          
           JOptionPane.showMessageDialog (null, " Delta: " + delta + "\n X1: " + x1 + "\n X2:" + x2);
           
           }
         else {
          JOptionPane.showMessageDialog(null, " Não existem raízes reais!! ");
           }
           

           }
           }
         
         