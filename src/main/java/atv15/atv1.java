package atv15;

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int peca = 0;

        while (peca < 100) {
            peca++;
            System.out.println("As peças produzidas foram " + peca);
        }
        sc.close();
    }
}
