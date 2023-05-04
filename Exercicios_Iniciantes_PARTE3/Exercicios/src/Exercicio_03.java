import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, nA = 0, nG = 0, nD = 0;

        x = sc.nextInt();

        while (x != 4){
            if (x == 1){
                nA += 1;
            } else if (x == 2) {
                nG += 1;
            } else if (x == 3) {
                nD += 1;
            }
            x = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+ nA);
        System.out.println("Gasolina: "+ nG);
        System.out.println("Diesel: "+ nD);

        sc.close();
    }
}
