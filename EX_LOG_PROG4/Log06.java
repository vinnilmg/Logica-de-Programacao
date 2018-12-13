import javax.swing.JOptionPane;
public class Log06 {
public static void main (String [] args) {

int vet[] = new int [1000];
int c=0, n=0;

do { //loop pedir numero
   n = Integer.parseInt(JOptionPane.showInputDialog ("Digite um valor"));
   
   if (n<=2 || n>=50) {
   System.out.println( "Errado, Tente novamente");
   }
   } while(n<=2 || n>=50);
   
       for(int i=0; i<1000; i++){ // loop principal
       if   (c >= n) {
       c=0;
       }
       vet[i]=c;
       System.out.println("N[" + i + "] = " + vet[i]);
       c++;
        }
      }
         }
   
   
   
   
