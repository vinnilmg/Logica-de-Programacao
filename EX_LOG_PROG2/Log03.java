         
         import javax.swing.JOptionPane;
         public class Log03{
         public static void main (String [] args) {
         
         double rendimento = Double.parseDouble (JOptionPane.showInputDialog ( " Digite o seu rendimento anual"));
         double aliquota;
         double imposto;
         
         if (rendimento <= 1200.00 ) { 
         
            JOptionPane.showMessageDialog (null, " Não há imposto! "); 
         
         }
         
         if (rendimento >= 1200.01 && rendimento < 2300.00) {
         aliquota = 7.5;
         imposto = rendimento*aliquota/100;
         JOptionPane.showMessageDialog ( null, " Seu imposto é: " + imposto);
         }
         
         if (rendimento >= 2300.01 && rendimento < 3700.00) {
         aliquota = 12.5;
         imposto = rendimento*aliquota/100;
         JOptionPane.showMessageDialog (null, " Seu imposto é: " + imposto);
         }
         
         if (rendimento >= 3700.01 && rendimento < 5100.00) {
         aliquota = 17.5;
         imposto = rendimento*aliquota/100;
         JOptionPane.showMessageDialog (null, " Seu imposto é: " + imposto);
         }
         
         if (rendimento > 5100.01) {
         aliquota = 27.5;
         imposto = rendimento*aliquota/100;
         JOptionPane.showMessageDialog (null, " Seu imposto é: " + imposto);
         
         }
         }
         }