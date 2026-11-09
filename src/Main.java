import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double renda;
        double taxa;
        
        System.out.println("Qual sua renda?");
        renda = sc.nextDouble();

        if(renda < 2000.00){
            System.out.println("Isento");
        }
        else if(renda >= 2000.01 && renda < 3000.00){
            taxa = (renda - 2000.00) * 0.08;
            System.out.println(taxa);
        }
        else if(renda >= 3000.01 && renda < 4500.00){
            taxa = (1000.00 * 0.08) + ((renda - 3000.00) * 0.18);
            System.out.println(taxa);
        }
        else if(renda >= 4500.01){
            taxa = (1000.00 * 0.08) + (1500.00 * 0.18) + ((renda - 4500.00) * 0.28);
            System.out.println(taxa);
        }
        else{
            System.out.println("Valor invalido");
        }
        sc.close();
    }

}
