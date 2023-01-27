import java.util.Scanner;

public class Solution{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idadeDias;
        int anos; 
        int mes;
        int dias;
        int resto;

        idadeDias = teclado.nextInt();


        anos = idadeDias / 365;
        resto = idadeDias % 365;

        mes = resto / 30;
        dias = resto % 30;


        System.out.println(anos +  "Ano(s)");
        System.out.println(mes +  "Mes(es)");
        System.out.println(dias +  " Dia(s)");

        teclado.close();

    }
}