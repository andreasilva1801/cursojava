import java.util.Scanner;
public class Uri1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int valorN, valorX,contador;
        valorN = teclado.nextInt();
                     
      for (contador = 1; contador <= valorN; contador = contador + 1){
          valorX = teclado.nextInt();
         if (valorX == 0){
            System.out.println("NULL");
         }
            else if (valorX < 0 && valorX % 2 == 0){
                System.out.println("EVEN NEGATIVE");
            }
            else if (valorX < 0 && valorX % 2 != 0){
                System.out.println("ODD NEGATIVE");
            }
            else if(valorX > 0 && valorX %2 == 0){
                System.out.println("EVEN POSITIVE");
            }
            else if(valorX > 0 && valorX %2 != 0){
                System.out.println("ODD POSITIVE");
           }
        }
    }    
}