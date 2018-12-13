      import javax.swing.JOptionPane;
      public class Log05 {
      public static void main (String [] args) {
      
      int elei=0,qtd=0;
      int cand1=0, cand2=0, cand3=0, cand4=0;
      
      do {
      elei = Integer.parseInt(JOptionPane.showInputDialog("Candidatos: 1 - 2 - 3 - 4 \nDigite seu voto:"));
      if(elei>=1 && elei<=4)
      {
      qtd++;
        if ( elei == 1) {
       cand1 ++;
       
        }
        if ( elei == 2) {
        cand2 ++;
        
        }
        if ( elei == 3) {
        cand3 ++;
       
        }
        if ( elei == 4) {
       cand4 ++;
       
        }
       } 
        
     } while( elei != -1);
     int votos1 = (cand1*100)/qtd;
     int votos2 = (cand2*100)/qtd;
     int votos3 = (cand3*100)/qtd;
     int votos4 = (cand4*100)/qtd;
     
  
     JOptionPane.showMessageDialog(null, "Eleitores: " + qtd + "\nCandidatos: \n1° - " + votos1 +"%" + " 2° - " + votos2 + "%" + " 3°- " + votos3 + "%" + " 4°- " + votos4 + "%");
     System.exit(0);
     }
     }
      
      
      