        
         import javax.swing.JOptionPane;
         public class Log01{
            public static void main (String [] args) {
                  
               double n;
               
               
               
               n = Double.parseDouble (JOptionPane.showInputDialog ( " Digite um numero:"));
                  
               if (n>0) {
               JOptionPane.showMessageDialog (null,  " O Número " + n + " é Positivo");
                       
               }
                  
               else {
                  
                JOptionPane.showMessageDialog (null,  " O Número " + n + " é Negativo");
                
                
               }
            }
         }
         