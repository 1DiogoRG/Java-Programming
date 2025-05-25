import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secreto = rand.nextInt(100) + 1;
        int tentativas = 5;
        boolean acertou = false;

        System.out.println("Adivinhe o número (1 a 100) e você tem 5 tentativas!");

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": ");
            int chute = sc.nextInt();

            if (chute == secreto) {
                System.out.println("Você acertou");
                acertou = true;
                break;
            } else if (chute < secreto) {
                System.out.println("O número é MAIOR");
            } else {
                System.out.println("O número é MENOR");
            }
        }

        if (!acertou) {
            System.out.println("Você perdeu e o número era: " + secreto);
        }

        sc.close();
    }
}
