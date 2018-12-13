	import java.text.DecimalFormat;
	import javax.swing.JOptionPane;

		public class Log14 {

			public static void main(String[] args) {

				double soma=0;
				String msg;
				DecimalFormat formato = new DecimalFormat("0.000"); 

				// criação da matriz
				double m[][] = new double [12][12];
				
			    //loop para inserir valores randomicos a matriz
				for (int i = 0; i < m.length; i++) {
				for(int j = 0; j < m[0].length; j++){
			         m[i][j] = (int)(Math.random() * 60) + 1;
				}
				}
				
				for(int i = m.length - 1; i >= 0; i--) {
					for(int j = m.length - 1; j >= 0; j--) {
						if(i <= j) {
							continue;						
						}					
						soma += m[i][j];							
					}			
			    }
				//loop para soma ou media
				do{
				 msg = JOptionPane.showInputDialog(" O que deseja fazer? \n S(Soma) \n M(Média)");
				 if(!msg.equals("m") && !msg.equals("s")){
					 System.out.println("Digite uma função válida!!");
				 }
				}while(!msg.equals("m") && !msg.equals("s"));
				
				//mensagem ao usuario
				switch(msg.toLowerCase()){
				case "s": System.out.println("Soma acima da diagonal secundária " + " é: " + formato.format(soma)); break;
				case "m": System.out.println("A Média acima da diagonal secundária "+ " é: " + formato.format((soma/12)));	
				}
		}					
	}
