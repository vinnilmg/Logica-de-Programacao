import javax.swing.JOptionPane;

public class Log08 {
public static void main (String [] args) {
   
      int par[] = new int [5];
      int impar[] = new int [5];
      int p =0, ip=0;
   
    for (int i=0; i < 15; i++){
      int msg = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º numero"));

         if( msg %2 == 0) {
            if (p < 5){
               par[p] = msg;
               p++;
            } 
            else {
               for( int e=0; e < par.length; e++) {
                  System.out.println("Par[" + e + "] = " + par[e]);
               }
               p=0;
            }
         }
         else {
         
            if (ip < 5){
               impar[ip] = msg;
               ip++;
            } 
            else {
               for( int e=0; e < par.length; e++) {
                  System.out.println("Impar[" + e + "] = " + impar[e]);
               }
            
               ip=0;
            }
            }
            if( i == 14) {
            for( int e=0; e < ip; e++) {
            System.out.println("Impar[" + e + "] = " + impar[ip]);    
             }

            for( int e=0; e < p; e++) {
            System.out.println("Par[" + e + "] = " + par[p]);    
             }
             }
      }
   }
}

    

