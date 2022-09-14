import java.util.Scanner;

public class Beecrowd1142{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int aux = 1;
        for(int i = 1; i <= n ; i++){
            
            System.out.println(aux + " " + (aux + 1) + " " + (aux + 2) + " PUM");

            aux = aux + 4;
        }

        sc.close();
    }
}