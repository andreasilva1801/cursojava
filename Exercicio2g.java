import java.util.Scanner;

public class Exercicio2g{
    public static void main(String args[]){
        Scanner teclado;                   // declarei um componente do tipo Scanner (Chamei de TECLADO)
        teclado = new Scanner(System.in);  // este componente vai ler dados do Dispositivo de Entrada padrão

        int lado, volume;

        System.out.println("Por favor, digite o valor do lado");
        lado = teclado.nextInt();
        /*System.out.println("Por favor, digite o valor da base Maior");
        baseMaior = teclado.nextInt();
        System.out.println("Por favor, digite o valor da altura");
        altura = teclado.nextInt();
        */
        
        volume = lado * lado * lado;

        System.out.println("A area do cubo vale "+volume);

    }
}