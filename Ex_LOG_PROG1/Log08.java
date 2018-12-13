import javax.swing.JOptionPane;
public class Log08 {
   public static void main(String args[]) {
   
   double valorEmprestado = Double.parseDouble (JOptionPane.showInputDialog ( " Digite o valor do empréstimo: "));
   double taxaJuros = Double.parseDouble (JOptionPane.showInputDialog (" Digite o valor da taxa de juros: " ));
   double meses = Double.parseDouble (JOptionPane.showInputDialog ( " Digite o numero de meses de duração: " ));
   
   double valorFinal = valorEmprestado * ( 1 + taxaJuros/100) /meses;
   
      JOptionPane.showMessageDialog(null, " Valor a ser pago no final: " + valorFinal);
      }
      }
    