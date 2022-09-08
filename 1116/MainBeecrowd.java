import java.util.Locale;
import java.util.Scanner;

public class MainBeecrowd {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double a;
        double b;

        for (int i = 0; i < n; i++) {
            a = sc.nextDouble();
            b = sc.nextDouble();
            sc.nextLine();

            if (b == 0) {
                System.out.println("divisao impossivel");
            } else {
                double divisao = a / b;
                System.out.printf("%.1f", divisao);
                System.out.println();
            }
        }
        sc.close();
    }
}