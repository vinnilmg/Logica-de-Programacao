   import javax.swing.JOptionPane;
   
   public class Log03 {
   public static void main (String [] args) {
   
   int vet[] = new int[10];
   int i;
 
   
   for(i=0; i < vet.length; i++) {
   
   vet[i]= Integer.parseInt( JOptionPane.showInputDialog("Digite o numero"));
   if(vet[i] <=0) {
    vet[i] =1;
   }
      }
   for (i=0; i<10; i++) {
   System.out.println("X[" + i + "]=" + vet[i]);
  }
 }
 }
  