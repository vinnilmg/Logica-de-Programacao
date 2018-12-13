     import javax.swing.JOptionPane;
      public class Log03 {
      public static void main (String [] args) {
      
      int n = 0, chances = 2, tentativas = 0;
      String bv = " Bom dia! Seja bem-vindo ";

    do {
    n = Integer.parseInt(JOptionPane.showInputDialog(" Digite sua senha"));
  
  
    if ( n != 1786 ) {
    JOptionPane.showMessageDialog(null, "Acesso negado! Senha invalida");
    tentativas++;
    }
    
    if (tentativas >chances) {
    JOptionPane.showMessageDialog (null, "Falha!!");
    System.exit(0);
    }
   } while ( n != 1786);
   
   JOptionPane.showMessageDialog (null, " " + bv);
   }
   }
   
      
      
      
      