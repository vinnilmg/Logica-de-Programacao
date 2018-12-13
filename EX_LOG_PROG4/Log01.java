   import javax.swing.JOptionPane;
   
   public class Log01 {
   public static void main (String [] args) {
   
   double vet[] = new double[100];
   int i;
 
   
   for(i=0; i < vet.length; i++) {
   
   vet[i]= Integer.parseInt( JOptionPane.showInputDialog("Digite o numero"));
   if ( vet[i] <= 10) {
   System.out.println( "A[" + i + "] = " + vet[i]);
   } 
   }
   System.exit(0);
   }
   }
  