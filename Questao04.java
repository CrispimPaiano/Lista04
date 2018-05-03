import javax.swing.JOptionPane;

public class Questao04 {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        double[] notas = new double[4];
            notas[0]=Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
            notas[1]=Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
            notas[2]=Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
            notas[3]=Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:"));

        double soma = (notas[0]+notas[1]+notas[2]+notas[3])/4;

        JOptionPane.showMessageDialog(null, "Sua média é: "+soma);

    }
    
}