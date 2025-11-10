package Modularizacao._2_Conversor_de_Palavras;

public class atv2 {
    public double temperatura;
    public String converter;

    public double max() {
        double tc;
        if (converter.equalsIgnoreCase("Fahrenheit")) {
            tc = (9 / 5 * temperatura + 32);
        } else {
            tc = (5 / 9 * temperatura - 32);
        }
        return tc;
    }
}


