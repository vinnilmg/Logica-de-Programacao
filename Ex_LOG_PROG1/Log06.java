import javax.swing.JOptionPane;
public class Log06 {
   public static void main(String args[]) {
   
   double primeiro = Double.parseDouble ( JOptionPane.showInputDialog ( "Digite o valor do primeiro termo da P.A"));
   double razao = Double.parseDouble (JOptionPane.showInputDialog ( " Digite o valor da razao da P.A"));
   double n = Double.parseDouble (JOptionPane.showInputDialog ( " Digite o numero de ordem da P.A"));
   
   double resp = primeiro + (n - 1) * razao;
   
   JOptionPane.showMessageDialog(null, " O valor do n-ésimo termo dessa P.A é: " + resp);
   }
   }
   
   
