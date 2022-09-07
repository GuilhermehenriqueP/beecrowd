import java.util.Scanner;

public class Beecrowd1184 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input;
        Pilha p1;

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            p1 = new Pilha();
            int aux = 0;
            input = sc.nextLine();
            for (int pos = 0; pos < input.length(); pos++) {
                if (input.charAt(pos) == '<') {
                    p1.push(input.charAt(pos));
                }else if (input.charAt(pos) == '>'){
                    if (p1.isEmpty()) {
                        continue;
                    }
                    char x = p1.pop();
                    aux++;
                }
            }
            System.out.println(aux);

        }

        sc.close();

    }
}
