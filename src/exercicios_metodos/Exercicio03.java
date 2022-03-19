package exercicios_metodos;

public class Exercicio03 {
    public static void main(String[] args) {
        tenisNike("modelo join", "modelo sei");
        tenisAdidas("Modelo rage", "modelo fab");
        carro("kadett", 2.0);
        peça("mangueira de ar", "vintuinha");
        alunos(10, 6);
        System.out.println(veiculo("amarelo", "solar"));
    }

    public static void tenisNike(String modelo1, String modelo2) {
        System.out.println(modelo1 + " - " + modelo2);
    }

    public static void tenisAdidas(String modelo3, String modelo4) {
        System.out.println(modelo3 + " - " + modelo4);
    }

    public static void carro(String carro, Double potencia) {
        System.out.println(carro + " - " + potencia);
    }

    public static void peça(String modelo6, String modelo7) {
        System.out.println(modelo6 + " - " + modelo7);
    }

    public static void alunos(int numeracao1, int numeracao2) {
        System.out.println(numeracao1 + " - " + numeracao2);
    }

    public static String veiculo(String cor, String teto) {
        return cor + " - " + teto;
    }
   

}
