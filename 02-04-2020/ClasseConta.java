package conta;

public class ClasseConta {
    int numero;
    String nome;
    String agencia;
    String data;
    double saldo;
    double saldomensal;
    
    void status(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("Numero: " + this.numero);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Data de abertura: " + this.data);
        System.out.println("Saldo Atual: R$ " + this.saldo);
        
    }
    boolean saca(double valor){
        if(this.saldo > valor){
            this.saldo = this.saldo - valor;
            return true;
        }else{
            return false;
        }
        
    }
    void deposita(double valor){
        this.saldo = this.saldo + valor;
    }
    void calculaRendimento(){
        this.saldomensal = this.saldo * 0.1;
    }
    String recuperaDadosParaImpressao(){
        String dados = "Nome: " + this.nome;
             dados += "\nNúmero: " + this.numero;
             dados += "\nAgência: " + this.agencia;
             dados += "\nData de abertura: " + this.data;
             dados += "\nSaldo Atual: " + this.saldo;
             dados += "\nRendimento Mensal: " + this.saldomensal;
             return dados;
    }
}