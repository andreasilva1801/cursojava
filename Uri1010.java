import java.util.Scanner;
public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int  codpeca1, codpeca2, numeropeca1, numeropeca2;
        double  valorpeca1, valorpeca2, valortotal;
        
        codpeca1 = teclado.nextInt();
        numeropeca1 = teclado.nextInt();
        valorpeca1 = teclado.nextDouble();
        codpeca2 = teclado.nextInt();
        numeropeca2 = teclado.nextInt();
        valorpeca2 = teclado.nextDouble();
                        
        valortotal = (numeropeca1 * valorpeca1) + (numeropeca2 * valorpeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",valortotal);
    }
}