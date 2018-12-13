   
   import javax.swing.JOptionPane;
   
   public class Log04 {
   public static void main (String [] args) {
   
   double mercadoria, total =0;
   int quantidade;
   
   do {
   mercadoria = Double.parseDouble(JOptionPane.showInputDialog(" Digite o preço da mercadoria em R$: "));
   quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));

   if (mercadoria > 0 && quantidade > 0) {
     total = (mercadoria*quantidade)+total;
     }
   if(mercadoria <0 && quantidade <0){
   JOptionPane.showMessageDialog(null," Digite novamente!!");
   }
   
   }while (quantidade != 0);
   
   JOptionPane.showMessageDialog(null," O Total é:R$ " + total);
   }
   }