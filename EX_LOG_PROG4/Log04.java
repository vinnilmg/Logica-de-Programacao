  import javax.swing.JOptionPane;
   
   public class Log04 {
   public static void main (String [] args) {
   
   int vet[] = new int[10];
   int i=0, cont=0; 
   int x;
    
   do {
   x = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° Num:"));
   cont++;
   }while(x > 50 );
   
   for(i=0; i < 10; i++){
   vet[i] = x;
   x*=2;
   }
   
   for (i=0; i<10; i++) {
  System.out.println("N[" + i + "] = " + vet[i]);
   }
   }
   }
   
   
   
