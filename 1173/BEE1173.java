import java.util.Scanner;

public class BEE1173 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int n = sc.nextInt();

        arr[0] = n;
        int i =0;
        do{

            System.out.println("N = [" + i + "] = " + n );
            i++;
            n = n*2;

        }while(i<arr.length);
        

    }
}
