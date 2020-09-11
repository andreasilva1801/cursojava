import java.util.Scanner;

public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado;                   // declarei um componente do tipo Scanner (Chamei de TECLADO)
        teclado = new Scanner(System.in);  // este componente vai ler dados do Dispositivo de Entrada padrão

        int baseMenor, baseMaior, altura, area;

        System.out.println("Por favor, digite o valor da base Menor");
        baseMenor = teclado.nextInt();
        System.out.println("Por favor, digite o valor da base Maior");
        baseMaior = teclado.nextInt();
        System.out.println("Por favor, digite o valor da altura");
        altura = teclado.nextInt();
        
        area = (baseMaior + baseMenor) * altura/2;

        System.out.println("A area do trapézio vale "+area);

    }
}