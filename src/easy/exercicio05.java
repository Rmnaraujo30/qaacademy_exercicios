package easy;

import javax.swing.JOptionPane;

public class exercicio05 {

    public static void main(String[] args) {

        double numero1, numero2, numero3;
        double soma, subtracao, multiplicacao, media;

        numero1 = Double.parseDouble(JOptionPane.showInputDialog("digite um numero para calcular a soma"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("digite um numero para calcular a sutração"));
        numero3 = Double.parseDouble(JOptionPane.showInputDialog("digite um numero para calcular a multiplicação"));
        
        soma = numero1 + numero2 + numero3;
        subtracao = numero1 - numero2 - numero3;
        multiplicacao = numero1 * numero2 * numero3;
        media = numero1 + numero2 + numero3 / 3;

        System.out.println(" A soma dos números digitado é " + soma);
        System.out.println(" A subtração dos números digitado é " + subtracao);
        System.out.println(" A multipicação dos números digitado é " + multiplicacao);
        System.out.println(" A média dos números digitado é " + media);

    }

}
