package hastaneprojesi;

import java.util.*;

public class HastaneRunner {
    private static final Hastane hastane1 = new Hastane();

    static Scanner sc = new Scanner(System.in);
    static String hastaDurumum = "";


    public static void main(String[] args) {

        secim();
    }

    public static void secim() {

        while(true) {
            System.out.println("\n============= MENU =============");
            System.out.println("\t\t\t1.Doktor\n\t\t\t2.Hasta\n\t\t\t0.Cikis");
            System.out.println("================================");
            System.out.println("Lutfen seciminizi giriniz.");

            String secim = sc.next();

            if(secim.equals("0")) {
                System.out.println("Saglikli gunler dileriz.");
                break;
            }else {
                switch (secim) {
                    case "1":
                        Doktor.sec();
                        break;

                    case "2":
                        Hasta.sec();
                        break;

                    default:
                        System.out.println("**** Hatali giris yaptiniz ****");
                }
            }
        }
    }

    public static String doktorUnvan(String aktuelDurum) {


        if (aktuelDurum.equalsIgnoreCase("Alerji")) {
            return hastane1.unvanlar[0];


        } else if (aktuelDurum.equalsIgnoreCase("Bas agrisi")) {
            return hastane1.unvanlar[1];

        } else if (aktuelDurum.equalsIgnoreCase("Diabet")) {
            return hastane1.unvanlar[2];

        } else if (aktuelDurum.equalsIgnoreCase("Soguk alginligi")) {
            return hastane1.unvanlar[3];

        } else if (aktuelDurum.equalsIgnoreCase("Migren")) {
            return hastane1.unvanlar[4];

        } else if (aktuelDurum.equalsIgnoreCase("Kalp hastaliklari")) {
            return hastane1.unvanlar[5];

        }
        return "yanlış secim";
    }

    public static Doktor doktorBul(String unvan) {
        Doktor doktor = new Doktor();
//            for (int i = 0; i < hastane1.unvanlar.length; i++) {
//
//                if (unvan.equals(hastane1.unvanlar[i])) {
//                    doktor.setIsim(hastane1.doktorIsimleri[i]);
//                    doktor.setSoyIsim(hastane1.doctorSoyIsimleri[i]);
//                    doktor.setUnvan(unvan);
//
//                }
//         }

        int idx = 0;



        for (String w : hastane1.unvanlar) {
            if (unvan.equals(w)) {
                doktor.setIsim(hastane1.doktorIsimleri[idx]);
                doktor.setSoyIsim(hastane1.doctorSoyIsimleri[idx]);
                doktor.setUnvan(unvan);
            }
            idx++;
        }

        System.out.println("Unvan " + doktor.getUnvan() + " ");
        System.out.println("Doktor isimi " + doktor.getIsim() + " ");
        System.out.println("Doktor soyisim " + doktor.getSoyIsim() + " ");

        return doktor;
    }

    public static Durum hastaDurumuBul(String aktuelDurum) {
        Durum hastaDurumu = new Durum();
        hastaDurumum = aktuelDurum;
        switch (aktuelDurum) {
            case "Alerji":
            case "Bas agrisi":
            case "Diabet":
            case "Soguk alginligi":
                hastaDurumu.setAciliyet(false);
                System.out.println(aktuelDurum + " Yesil Alan " + hastaDurumu.isAciliyet());
                break;
            case "Migren":
            case "Kalp hastaliklari":
                hastaDurumu.setAciliyet(true);
                System.out.println(aktuelDurum + " Kırmızı Alan " + hastaDurumu.isAciliyet());
                break;
            default:
                System.out.println("Gecerli bir durum degil");

        }
        return hastaDurumu;
    }


    public static Hasta hastaBul(String actualCase){
        Hasta hasta= new Hasta();
        int idx = 0;



        for (String w : hastane1.durumlar) {

            if(actualCase.equals(w)){

               hasta.setIsim(hastane1.hastaIsimleri[idx]);
                hasta.setSoyIsim(hastane1.hastaSoyIsimleri[idx]);
                hasta.setHastaID(hastane1.hastaIDleri[idx]);
            }
            idx++;
        }

        System.out.println("hasta ismi " +hasta.getIsim());
        System.out.println("Hasta soyismi " + hasta.getSoyIsim());
        System.out.println("Hasta ID " + hasta.getHastaID());
        return hasta;
    }

}

