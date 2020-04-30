package lutador;


public class Lutador {
    
    
    public static void main(String[] args) {
        ClasseLutador l[] = new ClasseLutador[6];
        l[0] = new ClasseLutador("Seth", "Dinamarca", 25, 1.80f, 80.2f, 15, 0, 2);
        l[1] = new ClasseLutador("Hórus", "EUA", 20, 1.72f, 78.8f, 9, 3, 5);
        l[2] = new ClasseLutador("Anúbis", "Brasil", 18, 1.83f, 69.9f, 12, 0, 5);
        l[3] = new ClasseLutador("Sekhmeth", "Índia", 23, 1.80f, 61.2f, 4, 8, 5);
        l[4] = new ClasseLutador("Bastet", "Alemanha", 28, 1.68f, 84.0f, 7, 6, 4);
        l[5] = new ClasseLutador("Thoth", "Egito", 24, 1.85f, 86.2f, 16, 1, 0);
        
        ClasseLuta f = new ClasseLuta();
        f.marcarLuta(l[0], l[1]);
        f.lutar();
        l[0].status();
        l[1].status();
    }
    
}
