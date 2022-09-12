import java.util.Scanner;

public class Beecrowd1131{
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int grenais = 0;
        int interVitorias = 0;
        int gremioVitorias = 0;
        int empates = 0;


        while(true){
            int golsInter = sc.nextInt();
            int golsGremio = sc.nextInt();

            if(golsInter > golsGremio) interVitorias++;
            else if(golsInter < golsGremio) gremioVitorias++;
            else empates++;

            grenais++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            int opcao = sc.nextInt();
            if(opcao == 2){
                break;
            }
        }

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + interVitorias);
        System.out.println("Gremio:" + gremioVitorias);
        System.out.println("Empates:" + empates);

        if(interVitorias > gremioVitorias) System.out.println("Inter venceu mais");
        else if(interVitorias < gremioVitorias) System.out.println("Gremio venceu mais");
        else System.out.println("Nao houve vencedor");



        sc.close();
    }
}