package Modularizacao._7_Número_Primo;

public class atv7 {
    int numero;

    public static boolean ePrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
