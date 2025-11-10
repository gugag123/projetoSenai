package Modularizacao._8_Cálculo_de_Juros_Compostos;

public class atv8 {
    public double capital;
    public double taxa;
    public int periodos;

    public double calcular() {
        double montante = capital;
        for (int i = 0; i < periodos; i++) {
            montante += montante * (taxa / 100);
        }
        return montante;
    }
}
