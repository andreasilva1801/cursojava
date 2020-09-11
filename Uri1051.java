import java.util.Scanner;
public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double salario, imposto;
        
        salario = teclado.nextDouble();
        
        if (salario <= 2000.00){
            System.out.println("Isento");
        }
        else if (salario <= 3000.00){
                imposto = (salario - 2000.00)*0.08;
                System.out.printf("R$ %.2f\n", imposto);    
        }
        else if (salario <= 4500.00){
                imposto = (salario - 3000.00)*0.18 + 80.0;
                System.out.printf("R$ %.2f\n", imposto);    
        }
        else if imposto = (salario - 4500.00)*0.28 + 80.0 + 270.00;
                System.out.printf("R$ %.2f\n", imposto);    
        }
    }    
}