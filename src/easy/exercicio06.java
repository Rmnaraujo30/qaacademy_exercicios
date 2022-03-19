package easy;

import javax.swing.JOptionPane;

public class exercicio06 {
    public static void main(String[] args) {
        
        double nota1, nota2, media;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("nota1"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("nota2"));
        media = (nota1+nota2)/2;
        
        if(media>5){
        System.out.println("Aprovado");
        }
        if (media<5) {
            System.out.println("reprovado");
            
        } 
        if
            (media == 5)
            System.out.println("exame");


        



        }
    }
    
    

