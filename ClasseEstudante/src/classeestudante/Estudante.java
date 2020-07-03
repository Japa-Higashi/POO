/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeestudante;

/**
 *
 * @author luizh
 */
public class Estudante {
    private int codigo;
    private String nome;
    private double notaMat ;
    private double notaPt;
    private double notaCiencias;
    public Estudante(){
    
    }
    public Estudante(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNotaMat(double notaMat) {
        this.notaMat = notaMat;
    }

    public void setNotaPort(double notaPort) {
        this.notaPt = notaPt;   
    }

    public void setNotaCien(double notaCien) {
        this.notaCiencias = notaCiencias;    
    }
    public double calculaMedia(){
        double media;
        media = (this.notaMat + this.notaCiencias + this.notaPt)/3.0;
        return media;
    }   
    public double calculaMedia(double pontuacaoExtra){
        double media;
        media = (this.notaMat + this.notaCiencias + this.notaPt + pontuacaoExtra)/3.0;
        return media;
    }
}
