package atv15;

import java.util.Locale;
import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int tempo = 0;
        int velocidade = 0;

        while (velocidade < 1000) {
            tempo += 2;
            velocidade += 200;
            System.out.println("Após " + tempo + " minutos, velociade = " + velocidade + "RPM");
        }
        System.out.println("Velocidade maxima atingida: " + velocidade + "RPM");
        sc.close();
    }
}
