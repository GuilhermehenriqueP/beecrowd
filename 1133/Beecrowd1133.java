import java.util.Scanner;

public class Beecrowd1133 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int x, y;

        if (n1 > n2) {
            x = n2;
            y = n1;
        } else {
            x = n1;
            y = n2;
        }

        for (int i = x + 1; i < y; i++) {

            if ((i % 5 == 2) || (i % 5 == 3)) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
