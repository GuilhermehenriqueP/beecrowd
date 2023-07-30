import java.util.Scanner;

public class Beecrowd1146 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        while(n != 0){
            for(int i = 1; i<=n; i++){
                if(i == n) System.out.println(i);
                else System.out.print(i + " ");
            }
            
            n = sc.nextInt();
        }

        sc.close();
    }
}
