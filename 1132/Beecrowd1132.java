import java.util.Scanner;

public class Beecrowd1132{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int max = sc.nextInt();
        
        if(min > max){
            int aux = min;
            min = max;
            max = aux;
        }

        int soma = 0;
        for(int i = min; i <= max ; i++){
            
            if(i%13 != 0 ){
                soma = soma + i;
            }
        }


        System.out.println(soma);
        sc.close();
    }
}