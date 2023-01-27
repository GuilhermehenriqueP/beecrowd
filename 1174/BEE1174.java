import java.util.Locale;
import java.util.Scanner;

public class BEE1174{

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[100];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextDouble();    
        }
        for(int j =0 ; j<arr.length; j++){
            if(arr[j] <= 10.0){
                System.out.println("A[" + j + "] =" + arr[j]);
            }
        }

        sc.close();
    }
}