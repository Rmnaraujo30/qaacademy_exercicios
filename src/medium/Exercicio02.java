package medium;

import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {

double valorInvestimento =0, taxaJuros = 0.05, valorJuros, valorTotal;
int i =1;
String valorInvestimentoStg = JOptionPane.showInputDialog("Digite um valor"); 
valorInvestimento = Integer.parseInt(valorInvestimentoStg);
valorTotal = valorInvestimento; 

while (i<=10){
    valorTotal = (valorTotal*taxaJuros) +valorTotal; 
    i++; 
}

valorJuros = valorTotal - valorInvestimento;

System.out.println ("Voce investiu:" + valorInvestimento); 
System.out.println("rendeu" + valorJuros + "De juros"); 
System.out.println("O valor total são:"+ valorTotal);

    }
}
