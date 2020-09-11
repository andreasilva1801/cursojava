import java.util.Scanner;
public class Uri1035{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, C, D;
        A = teclado.nesxtInt();
        B = teclado.nesxtInt();
        C = teclado.nesxtInt();
        D = teclado.nesxtInt();
        If ( (B > C) && (D > A) && (C + D > A + B) && (C > 0 && D > 0) && (A % 2 == 0)){
            SYstem.out.println("VALORES ACEITOS");
        }
        ELSE{
            System.out.println("VALORES NÃO ACEITOS");
        }
    }
}