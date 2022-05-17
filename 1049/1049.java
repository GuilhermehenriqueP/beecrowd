import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
    
	
            String tipo1 = sc.nextLine();
            
            String tipo2 = sc.nextLine();
            
            String tipo3 = sc.nextLine();
        
            
        if(tipo1.contains("invertebrado")) {
            if(tipo2.contains("inseto")) {
            	if(tipo3.contains("hematofago")) System.out.println("pulga");
            	else System.out.println("lagarta");
            	}
            else {
            	if(tipo3.contains("hematofago")) System.out.println("sanguessuga");
            	else System.out.println("minhoca");
            	}
        }
        else if(tipo1.contains("vertebrado")){
            if(tipo2.contains("ave") ) {
                if(tipo3.contains("carnivoro")) System.out.println("aguia");
            	else System.out.println("pomba");
            }else {
            	if(tipo3.contains("onivoro")) System.out.println("homem");
            	else System.out.println("vaca");
            }
        }
            
            
        sc.close();
}
}
 
