import java.util.Scanner;

public class Exercicio2h{
    public static void main(String args[]){
        Scanner teclado;                   // declarei um componente do tipo Scanner (Chamei de TECLADO)
        teclado = new Scanner(System.in);  // este componente vai ler dados do Dispositivo de Entrada padrão

        float raio, altura, volume, pi;

        System.out.println("Por favor, digite o valor do raio do cilindro");
        raio = teclado.nextFloat();
        System.out.println("Por favor, digite o valor da altura do cilindro");
        altura = teclado.nextFloat();
        pi = 3.14f;
                
        volume = raio * raio * altura * pi;

        System.out.println("A area do cilindro vale "+volume);

    }
}