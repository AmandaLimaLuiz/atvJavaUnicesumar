/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadevendadeingressos;

import javax.swing.JOptionPane;

/**
 *
 * @author Thiago De Lima Luiz
 */
public class SistemaDeVendaDeIngressos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("olá mundo");
        JOptionPane.showMessageDialog(null,"Olá Mundo!");
        
        Double idade;
           
            idade = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua idade:"));
        
        if(idade >= 18){
            JOptionPane.showMessageDialog(null, "Aceito, maior de idade!");
        }else{
            JOptionPane.showMessageDialog(null, "Negado, menor de idade não é permitido!");
        }
        
        for (int i = 0; i < 5; i++){
            JOptionPane.showMessageDialog(null,"Contador" + i);
        }
    }
}
 