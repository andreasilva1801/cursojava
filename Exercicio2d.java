import java.util.Scanner;

public class Exercicio2d{
    public static void main(String args[]){
        Scanner teclado;                   // declarei um componente do tipo Scanner (Chamei de TECLADO)
        teclado = new Scanner(System.in);  // este componente vai ler dados do Dispositivo de Entrada padrão

        int diag1, diag2, area;

        System.out.println("Por favor, digite o valores das diag1 e diag2");
        diag1 = teclado.nextInt();
        diag2 = teclado.nextInt();
        
        area = diag1 * diag2;

        System.out.println("A area do losango vale "+area);

    }
}