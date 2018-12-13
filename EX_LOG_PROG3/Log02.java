      
      import javax.swing.JOptionPane;
      
      public class Log02 {
      public static void main (String [] args) {
      
      double numb, result =0;
      
      do {
      numb = Integer.parseInt (JOptionPane.showInputDialog("Digite um Numero"));
      
      if (numb %7 ==0) {
      result = Math.pow(numb,2) + result;
      }
      }while (numb != 0);
      
      JOptionPane.showMessageDialog(null," A Soma dos quadrados dos multiplos de sete é: " + result);
      }
      }
      