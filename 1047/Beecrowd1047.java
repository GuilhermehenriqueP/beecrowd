import java.util.Scanner;

public class Beecrowd1047{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicio = sc.nextInt();
        int minInicio = sc.nextInt();
        int horaFim = sc.nextInt();
        int minFim = sc.nextInt();


        int tempTotalInicio = (horaInicio * 60) + minInicio;
        int tempTotalFim =  (horaFim * 60) + minFim;
        int tempTotal = tempTotalFim - tempTotalInicio;

        if(tempTotal == 0){
           System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)"); 
        }else if(tempTotalInicio > tempTotalFim){
            System.out.println("O JOGO DUROU " + (1440 + tempTotal)/60 +  "  HORA(S) E " + (1440 + tempTotal)%60  + " MINUTO (S)");
        }else{
            System.out.println("O JOGO DUROU " + (tempTotal/ 60) +  "  HORA(S) E " + (tempTotal % 60) + " MINUTO (S)");
        }


        sc.close();
}
}