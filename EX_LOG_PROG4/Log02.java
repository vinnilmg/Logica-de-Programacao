import javax.swing.JOptionPane;

public class Log02 {

   public static void main (String [] args) {
   
      int vet[] = new int[20];
   
      for(int i=19; i>=0; i--) {
         vet[i]= Integer.parseInt( JOptionPane.showInputDialog("Digite o numero"));
      }
      for(int i=0;i<20;i++){
         System.out.println("N[" + i + "] = " + vet[i]);
      }
   }
}

