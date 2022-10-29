
package com.mycompany.atividade1;

import javax.swing.JOptionPane;
public class Atividade1 {

    public static void main(String[] args) {
        double n1, n2, resultado;
        int opcao;
        
        
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma das opcoes:\n 1 - SOMA\n 2 - SUBTRACAO \n 3 - MULTIPLICACAO \n 4 - DIVISAO \n 5- QUADRADO \n 0-SAIR"));
            
            if(opcao == 1){
                n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
                n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
                resultado = n1 + n2;
                JOptionPane.showInputDialog(resultado, "\n tecle uma tecla para retornar");
            }
            if(opcao == 2){
                n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
                n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
                resultado = n1 - n2;
                JOptionPane.showInputDialog(resultado, "\n tecle uma tecla para retornar");
            }
            if(opcao == 3){
                n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
                n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
                resultado = n1 * n2;
                JOptionPane.showInputDialog(resultado, "\n tecle uma tecla para retornar");
            }
            if(opcao == 4){
                n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
                if(n1 == 0){
                  n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero diferente de 0 para o primeiro numero"));  
                }
                n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
                resultado = n1 / n2;
                JOptionPane.showInputDialog(resultado, "\n tecle uma tecla para retornar");
            }
            if(opcao == 5){
                n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero"));
                resultado = Math.pow(n1,2);
                JOptionPane.showInputDialog(resultado, "\n tecle uma tecla para retornar");
            }
        }while(opcao !=0);
                      
    }
}
