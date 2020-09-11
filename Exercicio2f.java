import java.util.Scanner;

public class Exercicio2f{
    public static void main(String args[]){
        Scanner teclado;                   // declarei um componente do tipo Scanner (Chamei de TECLADO)
        teclado = new Scanner(System.in);  // este componente vai ler dados do Dispositivo de Entrada padrão

        int largura, profundidade, altura, volume;

        System.out.println("Por favor, digite o valor da altura");
        altura = teclado.nextInt();
        System.out.println("Por favor, digite o valor da largura");
        largura = teclado.nextInt();
        System.out.println("Por favor, digite o valor da profundidade");
        profundidade = teclado.nextInt();
        
        volume = altura * largura * profundidade;

        System.out.println("A area do paralelepípedo vale "+volume);

    }
}