/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1pbo;


public class Konversi {
    double suhuCelcius;
    
    public Konversi(double suhuCelcius){
    this.suhuCelcius = suhuCelcius;
    }
    double toFahrenheit(){
        //F = (9 * C)/5 + 32
        return suhuCelcius*1.8+32;
    }
    double toReamur(){
        //(4 * C)/5
        return suhuCelcius*0.8;
    }
    double toKelvin(){
        //C + 273.15
        return suhuCelcius+273.15;
    }
    
}
