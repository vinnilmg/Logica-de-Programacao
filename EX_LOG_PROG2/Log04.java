         
         import javax.swing.JOptionPane;
         public class Log04{
         public static void main (String [] args) {
         
         int placa = Integer.parseInt ( JOptionPane.showInputDialog ( " Digite a placa do seu carro:"));
         int rodizio = placa%10;
         
        
         if (rodizio == 1 || rodizio == 2) {
               JOptionPane.showMessageDialog (null, " Rodizio as segundas! ");
             }
             
         if (rodizio == 3 || rodizio == 4) {
            JOptionPane.showMessageDialog (null, " Rodizio as terças!");
         }
         
         if (rodizio == 5 || rodizio == 6) {
            JOptionPane.showMessageDialog (null, " Rodizio as quartas!");
            }
            
         if (rodizio == 7 || rodizio == 8) {
            JOptionPane.showMessageDialog (null, " Rodizio as quintas!");
          }
         if (rodizio == 9 || rodizio == 0) {
            JOptionPane.showMessageDialog (null, " rodizio as sextas!");
           }
           
         }
         }
         