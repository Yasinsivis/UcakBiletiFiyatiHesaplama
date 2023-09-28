package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	     int Mesafe, age, YolculukTipi;
         double fiyat, ücret=0.10,YaşIndirimi=0,IndirimliUcret,TipIndirimi=0;

        Scanner inp=new Scanner(System.in);
        System.out.print("Mesafeyi Km Türünden Giriniz: ");
        Mesafe=inp.nextInt();
        System.out.print("Yaşınızı Giriniz:");
        age=inp.nextInt();
        System.out.print("Yolculuk Tipini Seçini (1=>Tek yön , 2=>Gidiş Dönüş) :");
        YolculukTipi=inp.nextInt();

        double normalTutar=Mesafe*0.10;
        if(age<12){
            YaşIndirimi=normalTutar*0.50;
        }
        else if(age>=12 && age<=24) {
            YaşIndirimi = normalTutar * 0.10;
        }
        else if (age>64) {
            YaşIndirimi=normalTutar*0.30;
        }
        IndirimliUcret=normalTutar-YaşIndirimi;

        if (age<=0 || Mesafe<=0 || YolculukTipi<=0){

            System.out.println("Hatalı Giriş  Yapıldı Lütfen Tekrardan Giriniz...");
        }
        else{
            if (YolculukTipi==2){
               TipIndirimi=IndirimliUcret*0.20;
               fiyat=(IndirimliUcret-TipIndirimi)*2;
               System.out.print("Toplam Tutar:"+fiyat);
            }
        else{
                fiyat=IndirimliUcret;
                System.out.print("Toplam Tutar : "+fiyat);
            }
        }

    }
}
