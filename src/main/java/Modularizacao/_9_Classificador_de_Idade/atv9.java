package Modularizacao._9_Classificador_de_Idade;

public class atv9 {
    int idade;

    public static String classificar(int idade) {
        if (idade < 0) {
            return "Idade invalida";
        } else if (idade <= 12) {
            return "Infantil";
        } else if (idade <= 17) {
            return "Adolescente";
        } else if (idade <= 59) {
            return "Adulto";
        } else {
            return "Idoso";
        }
    }
}
