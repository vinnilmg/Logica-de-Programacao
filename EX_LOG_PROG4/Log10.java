import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Log10 {

	public static void main(String[] args) {
		
		int linha;
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
		
		//loop para linha
		do {
		 linha = Integer.parseInt(JOptionPane.showInputDialog("Qual linha deseja fazer a operação?"));
			if( linha <0 || linha >11){
		System.out.println("Linha não existente!");
			}
		} while(linha < 0 || linha >11);
		
		for (int i = 0; i < m.length; i++) {
	    for(int j = 0; j <m[0].length; j++){
		if(i == linha){
			soma += m[i][j];
		}
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
		case "s": System.out.println("Soma da linha " + linha + " é: " + formato.format(soma)); break;
		case "m": System.out.println("A Média da linha " + linha + " é: " + formato.format((soma/12)));	
			}
	}
}
		
	

