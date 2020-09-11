import java.util.Scanner;
public class Uri1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        float valor;
        int positivo=0;
        int contador;
       
        for (contador = 1; contador <= 6; contador = contador + 1){
            valor = teclado.nextFloat();
            if (valor > 0){
                positivo = positivo + 1;
            }
        }
        System.out.println(positivo+" valores positivos");
    }
}
