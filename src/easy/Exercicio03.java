package easy;

import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        
        int numero1;
        int numero2;

    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número")); //= Integer.parseInt função de conversão para int
    numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero"));

    //= Double.parseDouble(JOptionPane.showInputDialog função de conversão para double.
        
    System.out.println("O valor do primeiro numero é:"+numero2);
        System.out.println("O valor do segundo é:"+numero1);

    }
    
}
