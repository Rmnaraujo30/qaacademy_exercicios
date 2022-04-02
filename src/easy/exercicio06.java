package easy;


public class exercicio06 {
    public String verificarAprovacao(double nota1, double nota2) {

        double media;
        media = (nota1 + nota2) / 2;

        if (media > 5) {
           return "Aprovado";
        }
        if (media < 5) {
            return "Reprovado";
        }
        if (media == 5) {
            return "Exame";
        }
        return null;

        }
    }
    
    

