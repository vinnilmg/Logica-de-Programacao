import javax.swing.JOptionPane;
public class Log05 {
   public static void main(String args[]) {
   
   double salario = Double.parseDouble (JOptionPane.showInputDialog ( " Digite o salario: "));
   double aumento = salario * 1.07;
   
   JOptionPane.showMessageDialog(null, " O novo salario é: " + aumento);
   
   }
   }
