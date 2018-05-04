import javax.swing.JOptionPane;

public class Questao07 {

    public static void main(String[] args) {
        
        double[] alturas = new double[4];
            alturas[0]=Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira altura do animal"));
            alturas[1]=Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda altura do animal"));
            alturas[2]=Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira altura do animal"));
            alturas[3]=Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta altura do animal"));

        double menorAltura = Double.MAX_VALUE; 

        if(alturas[0]<menorAltura){
            menorAltura=alturas[0];
        }

        if(alturas[1]<menorAltura){
            menorAltura=alturas[1];
        }

        if(alturas[2]<menorAltura){
            menorAltura=alturas[2];
        }

        if(alturas[3]<menorAltura){
            menorAltura=alturas[2];
        }

        JOptionPane.showMessageDialog(null,"Menor altura animal: "+menorAltura);

    }

}