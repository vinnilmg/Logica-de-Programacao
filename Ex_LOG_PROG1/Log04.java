import javax.swing.JOptionPane;
public class Log04 {
   public static void main(String args[]) {
   
   double n1 = Double.parseDouble (JOptionPane.showInputDialog ( " Digite o numero: "));
   double resp = n1 * 0.04;
   
   
    JOptionPane.showMessageDialog(null, " 4% do valor corresponde a: " + resp);
    
    }
    }