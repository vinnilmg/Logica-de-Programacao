  import javax.swing.JOptionPane;
  import java.text.DecimalFormat;

   
   public class Log07 {
   public static void main (String [] args) {
   
   double vet[] = new double[100];
   int i=0; 
   double x;
   DecimalFormat formato = new DecimalFormat("0.000"); 
    
   x = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° Num:"));
   
   
   for(i=0; i < 100; i++){
   vet[i] = x;
   x/=2;
   }
   
   for (i=0; i<100; i++) {
  System.out.println("N[" + i + "] = " + formato.format(vet[i]));
   }
   }
   }
   
   