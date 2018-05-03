import javax.swing.JOptionPane;

public class Questao02 {

    public static void main(String[] args) {
        
        String[] numeros = new String[10];
        numeros[0]="Francisco";
        numeros[1]="Thiago";
        numeros[2]="Henrique";
        numeros[3]="Sara";
        numeros[4]="Leonardo";
        numeros[5]="Rafael";
        numeros[6]="Michelle";
        numeros[7]="Cidmar";
        numeros[8]="Patrick";
        numeros[9]="C̷̮̓́͠ř̵͙i̸̡̱͋ș̷̩͂̓͌p̸̢̤̹̀̆ì̸͚͍̓̈́m̷̛̝͘";

        JOptionPane.showMessageDialog(null, "Nomes: "
            +"\n"+numeros[0]
            +"\n"+numeros[1]
            +"\n"+numeros[2]
            +"\n"+numeros[3]
            +"\n"+numeros[4]
            +"\n"+numeros[5]
            +"\n"+numeros[6]
            +"\n"+numeros[7]
            +"\n"+numeros[8]
            +"\n"+numeros[9]
        );

    }
    
}