package medium;

import javax.swing.JOptionPane;

public class Exercicio08 {

    public static void main(String[] args) {

        String vetorNomeAlunos[];
        vetorNomeAlunos = new String[5];

        int vetorNumeroAlunos[];
        vetorNumeroAlunos = new int[5];

        int i = 0;

        while (i <= 4) {

             vetorNomeAlunos[i] = JOptionPane.showInputDialog("Digite o nome do aluno");
             vetorNumeroAlunos[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do aluno"));
            i++;
        }

        i = 0; // Reset do valor da variável

        while (i <= 4) {

            System.out.println(vetorNomeAlunos[i]);
            System.out.println(vetorNumeroAlunos[i]);
            i++;
        }

    }

}
