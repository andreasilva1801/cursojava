import java.util.Scanner;
public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float  A, B, C, PERIMETRO, AREA;

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();

        if (A + B>C && B+C>A && A+C>B){
                 PERIMETRO = (A + B + C);
            System.out.printf("Perimetro = %.1f\n", PERIMETRO);
        }
                else{ 
              AREA = ((A + B)*C)/2;
              System.out.printf("Area = %.1f\n", AREA);
        }      
    }                
}
