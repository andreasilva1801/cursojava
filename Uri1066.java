import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int valor,contador;
        int par=0, impar=0, positivo=0, negativo=0;
       
        for (contador = 1; contador <= 5; contador = contador + 1){
            valor = teclado.nextInt();
            if (valor % 2 == 0){
                par = par + 1;
            }
            else{
                impar = impar +1;
            }
            if (valor < 0){
                negativo = negativo + 1;
            }
            else{
                positivo = positivo + 1;
            }
        }
        System.out.println(par+" valor (es) par (es)");
        System.out.println(impar+" valor (es) impar (es)");
        System.out.println(positivo+" valor (es) positivo (s)");
        System.out.println(negativo+" valor (es) negativo (s)");
    }
}