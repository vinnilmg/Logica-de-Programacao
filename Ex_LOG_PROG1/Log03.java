import javax.swing.JOptionPane;
public class Log03 {
   public static void main(String args[]) {
   

      int n1 = Integer.parseInt ( JOptionPane.showInputDialog ( " Digite o primeiro numero: "));
      int n2 = Integer.parseInt ( JOptionPane.showInputDialog ( " Digite o segundo numero: "));
      
      double soma = n1 + n2;
      double subtracao = n1 - n2;
      double multiplicacao = n1 * n2;
      double divisao = n1 / n2;
      double resto = n1 % n2;
      
      
      JOptionPane.showMessageDialog(null," Soma: " + soma + " Subtrcação: " + subtracao + " Multiplicação: " + multiplicacao + " Divisão: " + divisao + " Resto: " + resto);
}
}

      
      
      