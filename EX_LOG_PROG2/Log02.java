         
         import javax.swing.JOptionPane;
         public class Log02{
         public static void main (String [] args) {
         
         double n1 = Double.parseDouble( JOptionPane.showInputDialog ( "Digite o 1° numero:"));
         double n2 = Double.parseDouble( JOptionPane.showInputDialog ( "Digite o 2° numero:"));
         double n3 = Double.parseDouble( JOptionPane.showInputDialog ( "Digite o 3° numero:"));



         if( n1 > n2 && n2 > n3) {
          System.out.println (n3 + " " + " " + n2 + " " + n1);
             
       if ( n1 > n2 && n3 > n2) 
          System.out.println( n2 + " " + " " + n3 + " " + n1);
           }

        if ( n2 > n1 && n1 > n3) {
                 System.out.println( n3 + " " + " " + n1 + " " + n2);
               
                 
        if ( n2 > n1 && n3 > n1) 
               System.out.println( n1 + " " + " " + n3 + " " + n2);
                   }
                   
         if ( n3 > n1 && n1 > n2) {
                      System.out.println (n2 + " " + " " + n1 + " " + n3);
                      }
                      
        if ( n3 > n1 && n2 > n1) {
                     System.out.println( n1 + " " + " " + n2 + " " + n3);
                         }
                         
          
                          
         }
}

               


                   


    
   

                  
