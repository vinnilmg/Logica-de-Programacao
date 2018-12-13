import javax.swing.JOptionPane;
public class Log09 {
		public static void main(String [] args){
			
	
	int n, x, p=0;
	
	do {
	n = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor"));
	}while(n < 1 && n >1000);
	
	int vet [] = new int [n];
   
 	vet[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
   int min = vet[0];

	
	for(int i=1; i < vet.length; i++){
	x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
	vet[i] = x;
	if(vet[i] < min ){
		min = vet[i];
      p = i;           
	 }
	}
        System.out.println("Menor:" + min + " Posicao: " + p);

 }	
}

