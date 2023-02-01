package hastaneprojesi;

import java.util.*;

public class Doktor {
    static Doktor dr = new Doktor();
    private String isim;
    private String soyIsim;
    private String unvan;
    static Scanner sc = new Scanner(System.in);

    static HashMap<String, String> doktorHash = new HashMap<>();
    public String getIsim() {
        return isim;
    }

    public static void sec() {

        while (true) {
            System.out.println("1 Doktor ekle\n2 Doktor Listele\n3 Doktor isminden bulma\n4 Doktor silme\n5 Ana Menü");
            String sec = sc.next();

            if (sec.equals("5")){
                break;

            }else {
                switch (sec) {
                    case "1":
                        dr.ekle();
                        break;
                    case "2":
                        dr.listele();
                        break;
                    case "3":
                        dr.bulma();
                        break;
                    case "4":
                        dr.silme();
                        break;
                    default:
                        System.out.println("**** Hatali giris yaptiniz ****");
                }
            }
        }
    }

    public void list() {

        doktorHash.put("Nilson Avery", "Allergist");
        doktorHash.put("John Abel", "Norolog");
        doktorHash.put("Robert Erik", "Genel cerrah");
        doktorHash.put("Marry Jacob", "Cocuk doktoru");
        doktorHash.put("Alan Pedro", "Dahiliye");
        doktorHash.put("Mahesh Tristen", "Kardiolog");


        doktorHash.put(getIsim(), getUnvan());

        System.out.println(doktorHash);

    }


    public void ekle() {
        sc.nextLine();
        System.out.println("Adınızı giriniz");
        setIsim(sc.nextLine());

        System.out.println("Doktor Unvanını Giriniz");
        setUnvan(sc.nextLine());
        boolean isValid=doktorValidation();
        if(isValid){
            dr.list();
        }else {
            System.out.println("Lütfen harf ve bosluk dısında karakter girmeyiniz");

            ekle();
        }


        sec();
    }

    private boolean doktorValidation() {
        boolean isPrime = true;
        String name =getIsim().replaceAll("[A-Za-z ]","");
        String unvan =getUnvan().replaceAll("[A-Za-z ]","");
        if(name.length()!=0 || unvan.length()!=0){

            isPrime=false;

        }
        return isPrime;
    }


    public void listele() {
        for (Map.Entry<String, String> w : doktorHash.entrySet()) {
            System.out.println(w.getKey() + " " + w.getValue());
        }
        sec();
    }
    public void bulma() {
        sc.nextLine();
        System.out.println("Bulmak istediğiniz kişinin ad ve soyadını giriniz");
        String unvan = sc.nextLine();
        int count = 0;
        for (Map.Entry<String, String> w : doktorHash.entrySet()) {

            if (w.getKey().equals(unvan)) {

                    System.out.println( w.getValue() + " Dr " +  w.getKey());

                count++;
            }
        }
        if (count == 0) {
            System.out.println("Girilen ad ve soyada ait  doktorumuz bulunmamaktadır.");
        } else {

            System.out.println("Girilen ad ve soyada ait  "+ count+" doktorumuz bulunmaktadır." );
        }
        sec();
    }
    public void silme() {
        sc.nextLine();
        System.out.println("Silmek istediğiniz kişinin ad ve soyadını  giriniz");
        String unvan = sc.nextLine();
        int count = 0;
        for (Map.Entry<String, String> w : doktorHash.entrySet()) {
            if (w.getKey().equals(unvan)) {
                doktorHash.remove(unvan);


                count++;
                break;
            }
        }

        if (count == 0) {
            System.out.println("Girilen ad ve soyadda doktorumuz bulunmamaktadır.");
        } else {
            System.out.println("Girilen ad ve soyaddaki doktorumuz silinmiştir.");
        }

        sec();
    }


    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    @Override
    public String toString() {
        return "Doktor{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", unvan='" + unvan + '\'' +
                '}';
    }
}
