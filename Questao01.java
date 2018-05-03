import javax.swing.JOptionPane;

public class Questao01 {

    public static void main(String[] args) {
        
        int[] numeros = new int[16];
        numeros[0]=32;
        numeros[1]=45;
        numeros[2]=76;
        numeros[3]=83;
        numeros[4]=55;
        numeros[5]=12;
        numeros[6]=36;
        numeros[7]=44;
        numeros[8]=92;
        numeros[9]=54;
        numeros[10]=59;
        numeros[11]=61;
        numeros[12]=16;
        numeros[13]=22;
        numeros[14]=60;
        numeros[15]=37;

        double soma = numeros[0]+numeros[1]+numeros[2]+numeros[3]+numeros[4]+numeros[5]+numeros[6]+numeros[7]+numeros[8]+numeros[9]+numeros[10]+numeros[11]+numeros[12]+numeros[13]+numeros[14]+numeros[15];

        JOptionPane.showMessageDialog(null, "Soma dos vetores: "+soma);

    }
    
}