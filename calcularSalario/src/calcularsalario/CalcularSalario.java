/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularsalario;

import javax.swing.JOptionPane;


public class CalcularSalario {

    public static void main(String[] args) {
        double salary, discount, finalSalary;
        String firstSalary,showSalary, valueDiscount;
        int option;
        do{
            option = Integer.parseInt(JOptionPane.showInputDialog("Digite uma das opcoes:\n1 - Calcular Salário\n0-SAIR"));
            
            if(option == 1){
                salary = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));
                discount = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de disconto"));
                discount = discount/100;
                finalSalary = salary -(salary * discount);
                firstSalary = "Salário bruto: " + String.format("%.2f", salary) + "\n";
                valueDiscount = "Desconto: " + (discount*100) + "%\n";
                showSalary = "Salário Líquido: R$" + String.format("%.2f", finalSalary) + "\n";
                JOptionPane.showInputDialog(firstSalary + valueDiscount + showSalary,"\n tecle uma tecla para retornar");
            }
            
        }while(option !=0);
    }
    
}
