import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cordX = sc.nextInt(),
                cordY = sc.nextInt();
        while (cordX != 0 && cordY != 0){
            if (cordX > 0 && cordY > 0){
                System.out.println("primeiro");
            } else if (cordX < 0 && cordY > 0) {
                System.out.println("segundo");
            } else if (cordX < 0 && cordY < 0) {
                System.out.println("terceiro");
            } else if (cordX > 0 && cordY < 0) {
                System.out.println("quarto");
            }

            cordX = sc.nextInt();
            cordY = sc.nextInt();

        }
        sc.close();
    }
}
