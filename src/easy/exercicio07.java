package easy;

import javax.swing.JOptionPane;

public class exercicio07 {
    
    public static void main(String[] args) {
        
        double salario, inss;

        salario =  Double.parseDouble(JOptionPane.showInputDialog ("digite salario"));

        if (salario<=1045.00){
        inss = salario * 0.075;
        System.out.println("Ovalor de inss será" +inss);
        }
        if (salario>=1045.01 && salario<=2059.60){
        inss = salario * 0.09; 
        System.out.println("Ovalor de inss será" +inss);
        }
        if (salario>=2089.61 && salario<=3134.40){
            inss = salario * 0.12;
            System.out.println("Ovalor de inss será" +inss);
            }
            if (salario>=3134.41 && salario<=6101.06){
                inss = salario * 0.14;
                System.out.println("Ovalor de inss será" +inss);
                }
                if (salario>=6101.07) {
                    inss = 854.15;
                    System.out.println("Ovalor de inss será" +inss);
                    }

    }
    
}
