package conta;

public class Conta {

    public static void main(String[] args) {
        ClasseConta minhaConta = new ClasseConta();
        minhaConta.numero = 1;
        minhaConta.nome = "Angelo";
        minhaConta.agencia = "66385-8";
        minhaConta.data = "21/01/2020";
        minhaConta.saldo = 200.0;
        minhaConta.status();
        if(minhaConta.saca(100)){
            System.out.println("Saque realizado! Saldo: R$ " + minhaConta.saldo);
        }else{
            System.out.println("Saldo insuficiente!");
        }
        minhaConta.deposita(300);
        System.out.println("Novo Saldo após depósito: R$ " + minhaConta.saldo);
        System.out.println("Novo Saldo: R$ " + minhaConta.saldo);
        minhaConta.calculaRendimento();
        System.out.println("Rendimento mensal: R$ " + minhaConta.saldomensal);
        
        ClasseConta conta2 = new ClasseConta();
        conta2.numero = 28;
        conta2.nome = "Pietro";
        conta2.agencia = "66385-8";
        conta2.data = "07/05/2020";
        conta2.saldo = 1200.0;
        conta2.status();
        conta2.calculaRendimento();
        System.out.println("Rendimento mensal: R$ " + conta2.saldomensal);
        System.out.println(conta2.recuperaDadosParaImpressao());
        
        /*ClasseConta conta3 = conta2;
        
        if (conta3 == conta2) {
            System.out.println("Contas iguais");
        }else{
            System.out.println("Contas diferentes");        
        }*/
    }
}