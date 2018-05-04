import javax.swing.JOptionPane;

public class Questao05 {

    public static void main(String[] args){
        
        double[] pesos = new double[5];
            pesos[0] =  Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));     
            pesos[1] =  Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));    
            pesos[2] =  Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor"));     
            pesos[3] =  Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto valor"));     
            pesos[4] =  Double.parseDouble(JOptionPane.showInputDialog("Digite o quinto valor")); 
            
        double soma = (pesos[0]+pesos[1]+pesos[2]+pesos[3]+pesos[4]);
        double media =soma/5;

        JOptionPane.showMessageDialog(null, 
            "Soma total: "+soma
           +"\nMédia: " +media
        );

    }
    
}