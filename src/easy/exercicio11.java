package easy;

import javax.swing.JOptionPane;

public class exercicio11 {
    public static void main(String[] args) {

        int numeroDigitado, i = 1, soma;
        numeroDigitado = Integer.parseInt( JOptionPane.showInputDialog("Digite um numero"));

        soma = numeroDigitado;
            while (i <= 100){

            soma = soma + 2;
        System.out.println(soma);
        i++;
    }
}

}
