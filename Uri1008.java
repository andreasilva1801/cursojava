import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int  numero;
        double  valorHora, horastrabalhadas, salario;
        
        numero = teclado.nextInt();
        horastrabalhadas = teclado.nextDouble();
        valorHora = teclado.nextDouble();
                
        salario = (valorHora * horastrabalhadas);

        System.out.println("NUMBER = "+numero);
        System.out.printf("SALARY = U$ %.2f\n",salario);
    }
}