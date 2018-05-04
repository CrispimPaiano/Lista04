import javax.swing.JOptionPane;

public class Questao06 {

    public static void main(String[] args) {
        
        int[] idade = new int[9];
        int i =0;

        while (i<9) {
            idade[i] =  Integer.parseInt(JOptionPane.showInputDialog("Digite a "+(i+1)+"° idade"));
            i++;
        }
            
        int maiorValor = Integer.MIN_VALUE;

        if (idade[0]>maiorValor) {
            maiorValor=idade[0];
        } 
        if (idade[1]>maiorValor) {
            maiorValor=idade[1];
        } 
        if (idade[2]>maiorValor) {
            maiorValor=idade[2];
        }
        if (idade[3]>maiorValor) {
            maiorValor=idade[3];
        }
        if (idade[4]>maiorValor) {
            maiorValor=idade[4];
        }
        if (idade[5]>maiorValor) {
            maiorValor=idade[5];
        }
        if (idade[6]>maiorValor) {
            maiorValor=idade[6];
        }
        if (idade[7]>maiorValor) {
            maiorValor=idade[7];
        }
        if (idade[8]>maiorValor) {
            maiorValor=idade[8];
        }

        JOptionPane.showMessageDialog(null, "Idades"
            +"\n1°idade: "+idade[0]
            +"\n2°idade: "+idade[1]
            +"\n3°idade: "+idade[2]
            +"\n4°idade: "+idade[3]
            +"\n5°idade: "+idade[4]
            +"\n6°idade: "+idade[5]
            +"\n7°idade: "+idade[6]
            +"\n8°idade: "+idade[7]
            +"\n9°idade: "+idade[8]
            +"\n\nMaior idade: "+maiorValor
        );

    }
    
}