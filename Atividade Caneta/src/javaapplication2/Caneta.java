package javaapplication2;
public class Caneta {
    String Modelo;
    String Cor;
    int Carga;
    float Ponta;
    boolean Tampada;
    void status(){
        System.out.println("Modelo: " + this.Modelo);
        System.out.println("Uma caneta: " + this.Cor);
        System.out.println("Ponta: " + this.Ponta);
        System.out.println("Carga: " + this.Carga);
        System.out.println("Esta tampada? " + this.Tampada);
        
    }
    void rabiscar(){
        if(this.Tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    void tampar(){
        this.Tampada = true;
    }
    void destampar(){
       this.Tampada = false;
    }
}
