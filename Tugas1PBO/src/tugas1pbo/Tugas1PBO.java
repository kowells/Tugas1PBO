/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1pbo;

import java.util.Scanner;

public class Tugas1PBO {
    static double suhuCelcius; 
    


    public static void main(String[] args) {
        int menu;
   
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        
  
        System.out.println("Input Data ");
        System.out.println("-----------");
        System.out.print("Suhu Dalam Celcius :  ");
        suhuCelcius=input.nextDouble();
        
        do{
            System.out.println("Opsi ");
            System.out.println("----");
            System.out.print("1. Lihat Data Konversi \n2. Edit Data Konversi \n3. Exit \nPilih :  " );
            menu = input.nextInt();


            switch (menu){
                case 1 :
                    Konversi knv = new Konversi(suhuCelcius);

                    System.out.println("Suhu dalam Celcius \t: " + suhuCelcius + "°C" );
                    System.out.println("Suhu dalam Fahrenheit \t: " + knv.toFahrenheit() + "°F" );
                    System.out.println("Suhu dalam Reamur \t: " + knv.toReamur() + "°R" );
                    System.out.println("Suhu dalam Kelvin \t: " + knv.toKelvin() ); 
                    if(suhuCelcius < 0){
                        System.out.println("Kondisi air Beku");
                    }else if(suhuCelcius > 100){
                        System.out.println("Kondisi air Mendidih");
                    }
                    else
                        System.out.println("Kondisi air normal");
                    break;

                case 2 :
                    System.out.println("Input Data ");
                    System.out.println("-----------");
                    System.out.print("Suhu Dalam Celcius : ");
                    suhuCelcius=input.nextDouble();
                    break;
                case 3 :
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opsi tidak ada. Silakan masukkan opsi dengan benar");
                    break;
            }
        }while(menu !=3);
    }
}
