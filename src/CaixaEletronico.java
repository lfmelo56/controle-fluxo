public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 67.0;
 
        if (valorSolicitado < saldo) {
        saldo = saldo - valorSolicitado;
        System.out.println("Novo saldo = " + "R$" + saldo);  
    }

        else
         System.out.println("Saldo insuficiente. Você pode sacar qualquer valor abaixo de " + "R$"+ saldo);

    }
}
