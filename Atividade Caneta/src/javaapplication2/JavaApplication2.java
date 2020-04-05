package javaapplication2;
public class JavaApplication2 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.Cor = "Azul";
        c1.Ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.Modelo = "Bic";
        c2.Cor = "Preta";
        c2.Ponta = 1.0f;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}
