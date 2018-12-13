
   
   import javax.swing.JOptionPane;
   
   public class Log06 {
   public static void main (String [] args) {
   
   double n1 = Double.parseDouble (JOptionPane.showInputDialog("Digite o 1° Numero:")),
          n2 = Double.parseDouble (JOptionPane.showInputDialog("Digite o 2° Numero:")),
          result=0;
          
    int escolha = 0;
   
   
   do {
   escolha = Integer.parseInt(JOptionPane.showInputDialog("Operações disponiveis: "+
                                       "\n 1.Adição"+
                                       "\n 2.Subtração"+
                                       " \n3.Multiplicação"+
                                       "\n 4.Divisão"+
                                       "\n 9.Sair do Programa"+
                                       "\n Digite o numero desejado:"));
                                       
      if (escolha ==1){
      result = n1+n2;
      JOptionPane.showMessageDialog(null, " " + result);
      }
      if(escolha ==2){
      result = n1-n2;
      JOptionPane.showMessageDialog(null, " " + result);
      }
      if(escolha==3){
      result = n1*n2;
      JOptionPane.showMessageDialog(null, " " + result);
      }
      if(escolha==4){
      if(n2 > 0) {
      result=n1/n2;
      JOptionPane.showMessageDialog(null, " " + result);
      }
      else {
      JOptionPane.showMessageDialog(null, "Não foi possivel!");
      }
      }
     
      }while(escolha!=9);
      System.exit(0);

   }
   }
   
   
   