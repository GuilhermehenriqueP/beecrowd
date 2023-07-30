import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1160 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++){

            int PA = sc.nextInt();
            int PB = sc.nextInt();
            sc.nextLine();
            double GA = sc.nextDouble();
            double GB = sc.nextDouble();

            int anos = 0 ;
            int PAA = PA;
            int PBA = PB;
            for(int j = 0; PAA <= PBA; j++){
                PAA = PAA + ((int) (PAA * (GA/100)));
                PBA = PBA + ((int) (PBA * (GB/100)));
                anos++;
                if(anos == 101){ break;}
            }

            if(anos <= 100) System.out.println(anos + " anos.");
            else System.out.println("Mais de 1 seculo.");
            

        }

        sc.close();
    }
}
