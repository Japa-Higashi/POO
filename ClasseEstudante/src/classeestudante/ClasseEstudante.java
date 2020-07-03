/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeestudante;

import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author luizh
 */
public class ClasseEstudante {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudante n1= new Estudante(1,"João");
        n1.setNotaCien(8);
        n1.setNotaMat(7);
        n1.setNotaPort(5);
        System.out.println("Código: "+n1.getCodigo());
        System.out.println("Nome: "+n1.getNome());
        System.out.println("Média nota: " + n1.calculaMedia());
        System.out.println("Média nota com ponto extra: " + n1.calculaMedia(5));
        
        Data n2 = new Data();
        n2.setData(31, 4, 2003);
        System.out.println("data: "+ n2.getData());
        
        Data n3= new Data();
        n3.setData(29, 2, 2000);
        System.out.println("data: "+ n3.getData());
        
        Data n4= new Data();
        n4.setData(18, 5, 2001);
        System.out.println("data: "+ n4.getData());
        
        Data n5= new Data();
        n4.setData(29, 2, 2012);
        System.out.println("data: "+ n4.getData());
    
    }
    
}
