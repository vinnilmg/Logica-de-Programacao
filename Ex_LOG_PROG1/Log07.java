import javax.swing.JOptionPane;
public class Log07 {
   public static void main(String args[]) {
   
   double primeiro = Double.parseDouble ( JOptionPane.showInputDialog ( "Digite o valor do primeiro termo da P.G"));
   double razao = Double.parseDouble (JOptionPane.showInputDialog ( " Digite o valor da razao da P.G"));
   double n = Double.parseDouble (JOptionPane.showInputDialog ( " Digite o numero de ordem da P.G"));
   
   double resp = primeiro * razao / (n-1);
   
   JOptionPane.showMessageDialog(null, " O valor do n-ésimo termo dessa P.G é: " + resp);
}
}