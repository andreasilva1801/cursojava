import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int horaInicio, horaFim, minutoFim, minutoInicio, duracaoTotal, durI, durF, durH, durM;

        horaInicio = teclado.nextInt();
        minutoFim = teclado.nextInt();
        horaFim = teclado.nextInt();
        minutoInicio = teclado.nextInt();


        durI = horaInicio*60 + minutoInicio;
        durF = horaFim*60 + minutoFim;
        duracaoTotal = durF - durI;

        If (duracaoTotal <= 0){
            duracaoTotal = duracaoTotal + 24;
        }

            durH = duracaoTotal / 60;
            durM  = duracaoTotal % 60;

            System.out.println("O JOGO DUROU "+duracao+ " HORA(S) E "");
    }
}        