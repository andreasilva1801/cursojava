import java.util.Scanner;

public class Exercicio2b{
    public static void main(String args[]){
        Scanner teclado;                   // declarei um componente do tipo Scanner (Chamei de TECLADO)
        teclado = new Scanner(System.in);  // este componente vai ler dados do Dispositivo de Entrada padrão

        int base, altura, area;

        System.out.println("Por favor, digite o valor da base e da altura");
        base = teclado.nextInt();
        altura = teclado.nextInt();
        
        area = base * altura;

        System.out.println("A area do retângulo vale "+area);

    }
}