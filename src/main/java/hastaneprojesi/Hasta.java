package hastaneprojesi;

import java.util.*;

public class Hasta {
   static int hastaId=(int) (Math.random()*1000);
    private String isim;
    private String soyIsim;
    private int hastaID = hastaId;
    private Durum hastaDurumu;
    public static Hasta hs = new Hasta();
    static List<Integer> HastaNameList =new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static HashMap<String,String> hst = new HashMap<>();

    public static void sec() {

        while (true) {
            System.out.println("1 Hasta ekle\n2 Hasta Listele\n3 Hasta isminden bulma\n4 Hasta silme\n5 Ana Menü");
            String sec = sc.next();

            if (sec.equals("5")) {
                break;

            }else {
                switch (sec) {
                    case "1":
                        hs.ekle();
                        break;
                    case "2":
                        hs.listele();
                        break;
                    case "3":
                        hs.bulma();
                        break;
                    case "4":
                        hs.silme();
                        break;
                    default:
                        System.out.println("**** Hatali giris yaptiniz ****");
                }
            }
        }
    }

    public void list() {

        hst.put("Warren Traven", "Migren");
        hst.put("Petanow William", "Alerji");
        hst.put("Sophia George", "Bas agrisi");
        hst.put("Emma Tristan", "Soguk alginligi");
        hst.put("Darian Luis", "Migren");
        hst.put("Peter Cole", "Kalp hastaliklari");


        hst.put(getIsim(), HastaneRunner.hastaDurumum);

        System.out.println(hst);

    }


    public void ekle() {
        sc.nextLine();

            System.out.println("Ad ve Soyadınızı giriniz");
            setIsim(sc.nextLine());
            System.out.println("Hasta durumunu giriniz");
            setHastaDurumu(HastaneRunner.hastaDurumuBul(sc.nextLine()));
            //İd girişi otomatik olarak almaktadır.
            setHastaID(hastaID);

        System.out.println(HastaneRunner.doktorUnvan(HastaneRunner.hastaDurumum) + " Polikliniğine yonlendirildi.");


            hs.list();




        sec();
    }


    public void listele() {
        for (Map.Entry<String, String> w : hst.entrySet()) {
            System.out.println(w.getKey() + " " + w.getValue() + " " + getHastaID());
        }
        sec();
    }

    public void bulma() {
        sc.nextLine();
        System.out.println("Bulmak istediğiniz kişinin ad ve soyadını giriniz");
        String unvan = sc.nextLine();
        String acilliyet = "";
        int count = 0;
        for (Map.Entry<String, String> w : hst.entrySet()) {

            if (w.getKey().equals(unvan)) {
                if (!hastaDurumu.isAciliyet()) {
                    acilliyet = w.getValue();
                    System.out.println(w.getKey() + " " + acilliyet);
                } else {
                    acilliyet = w.getValue();
                    System.out.println(w.getKey() + " " + acilliyet);
                }
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Girilen ad ve soyad'a ait bir kişi bulunmamaktadır.");
        } else {

            System.out.println("Girilen ad ve soyada ait " + count + " hasta  bulunmaktadır.");
        }
        sec();
    }

    public void silme() {
        sc.nextLine();
        System.out.println("Silmek istediğiniz kişinin ad ve soyadını  giriniz");
        String unvan = sc.nextLine();
        int count = 0;
        for (Map.Entry<String, String> w : hst.entrySet()) {
            if (w.getKey().equals(unvan)) {
                hst.remove(unvan);


                count++;
                break;
            }
        }

        if (count == 0) {
            System.out.println("Girilen ad ve soyada ait bir hasta bulunmamaktadır.");
        } else {
            System.out.println("Girilen ad soyada ait  hasta kaydı silinmiştir.");
        }

        sec();
    }


    public String getIsim() {
        return isim;
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

    public int getHastaID() {


        return hastaID;
    }

    public void setHastaID(int hastaID) {

        this.hastaID = hastaID;
    }

    public Durum getHastaDurumu() {
        return hastaDurumu;
    }

    public void setHastaDurumu(Durum hastaDurumu) {
        this.hastaDurumu = hastaDurumu;
    }
}
