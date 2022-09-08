import java.util.Locale;
import java.util.Scanner;


public class Beecrowd1117{

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int i = 0;
        double soma = 0;
        double nota;

        while(true){
            nota = sc.nextDouble();

            if(nota > 10.0 || nota < 0.0){
                System.out.println("nota invalida");
            }else{
                soma = soma+nota;
                i++;
                if(i == 2){
                    break;
                }
            }
        }

        double media;
        media = soma/2.0;

        System.out.printf("media = %.2f%n", media);

        sc.close();
    }
}