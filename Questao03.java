import javax.swing.JOptionPane;

public class Questao03 {

    public static void main(String[] args) {
        
        String[] nomeProduto = new String[7];
        double[] valorProduto = new double[7];

        nomeProduto[0]="Abacate";
        valorProduto[0]=5.6;
        nomeProduto[1]="Maça";
        valorProduto[1]=7.66;
        nomeProduto[2]="Tomate";
        valorProduto[2]=10.05;
        nomeProduto[3]="Vassoura";
        valorProduto[3]=20.99;
        nomeProduto[4]="Detergente";
        valorProduto[4]=5.69;
        nomeProduto[5]="Papel Higiênico";
        valorProduto[5]=7.99;
        nomeProduto[6]="Caderno";
        valorProduto[6]=1.99;

        JOptionPane.showMessageDialog(null, "Produtos:"
            +"\n"+nomeProduto[0]+" |valor: "+valorProduto[0]
            +"\n"+nomeProduto[1]+" |valor: "+valorProduto[1]
            +"\n"+nomeProduto[2]+" |valor: "+valorProduto[2]
            +"\n"+nomeProduto[3]+" |valor: "+valorProduto[3]
            +"\n"+nomeProduto[4]+" |valor: "+valorProduto[4]
            +"\n"+nomeProduto[5]+" |valor: "+valorProduto[5]
            +"\n"+nomeProduto[6]+" |valor: "+valorProduto[6]
            ,"Produtos", JOptionPane.INFORMATION_MESSAGE
        );

    }
    
}