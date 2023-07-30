import java.util.Scanner;

public class Beecrowd1134 {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while(true){
            int tipo = sc.nextInt();

            if(tipo == 1) alcool++;
            if(tipo == 2) gasolina++;
            if(tipo == 3) diesel++;
            if(tipo == 4) break;
        }

        System.out.println("MUITO OBRIGADO\n" +  "Alcool: " + alcool
        + "\nGasolina: " + gasolina + "\n" +
        "Diesel: " + diesel);


        sc.close();

    }
}
