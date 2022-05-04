package schoolProject;

import java.util.Scanner;

public class Depo {
    // temiz kod calismak icin methodlarimi depo classina olusturucam gerekli oldugunda burdan kullanicam
    static Scanner scan = new Scanner(System.in);//methodun disina cunku sadece o methodda kullanmiycam static yazdimmethodun icindende goruyor


    public static void anaMenu() throws InterruptedException {
        String tercih = "";
        do {//menuden bisey sectigi surece donsun

            System.out.println("=================YILDIZ KOLEJI====================\n" +
                    "==================ANA MENU==============\n" +
                    "\n" +
                    "\t  1-Okul bilgileri goruntule\n" +
                    "\t  2-Ogretmen menu \n" +
                    "\t  3-Ogrenci menu\t\t\n" +
                    "\t  Q-CIKIS\n");
            System.out.println("Lutfen menuden tercihinizi yapiniz");
            tercih = scan.nextLine();
            switch (tercih) {
                case "1":
                    //okul bilgilerini tutmamiz icin okul classimiz olmasi lazim
                    OkulBilgileriniYazdir();
                    break;
                case "2"://ogretmen menu
                    Ogretmen.ogretmenMenu();
                    break;
                case "3":
                    break;
                case "q":
                case "Q":
                    break;
                default:
                    System.out.println("lutfen gecerli bir tercih giriniz");

            }

        } while (!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
    }



    private static void OkulBilgileriniYazdir() throws InterruptedException {
        System.out.println("=================YILDIZ KOLEJI====================\n"+
                "\t\t  Adress"+Okul.adress+
                "\n\t\t Telefon :"+ Okul.tel);//okul classindann okul bilgilerini aldim
        Thread.sleep(5000);// 5 saniye bekleticek yavas calistircak exception atti declera ettik ustune tiklayip

    }

    public static void projeDurdur() {
        System.out.println("okul projesinden ciktiniz");
    }
}


