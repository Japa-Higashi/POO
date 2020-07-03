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
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public void Data() {

    }

    public void setData(int dia, int mes, int ano) {
        if (ano >= 1950 && ano <= 2020) {
            this.ano = ano;
        }else{
            this.ano = 0 ;
        }
        if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ) && (dia >= 1 && dia <= 31)) {
            this.dia = dia;
        } else if ((mes == 4 ||mes == 6 || mes == 9 || mes == 11) && (dia <= 30 && dia >= 1)) {
            this.dia = dia;
        } else if(mes == 2 && ano %4==0 && ano >= 1950 && ano <= 2020 && dia <=29 && dia >=1 ){
            this.dia = dia;
        }else if(mes == 2 && ano %4!=0 && ano >= 1950 && ano <= 2020 && dia <=28 && dia >=1){
            this.dia = dia;
        }else {
            this.dia = 0;
        }
        if(mes>=1 && mes<=12){
            this.mes = mes;
        }else{
            this.mes = 0 ;
        }
        
    }

    public String getData() {
     if(this.ano!=0 && this.mes != 0 && this.dia != 0){
        return  this.dia + "/" + this.mes + "/" + this.ano;
     }else{   
        return  "Erro"; 
     }
    }
}
