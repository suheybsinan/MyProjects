package stone_paper_scissors;

import java.util.Scanner;

public class Study_StonePaperScissors00 {

    /*
        __Tas-Kagit-Makas__

    1.Adim:  Kodumuzu calistirmak icin Main fonksiyonu ve
             kullanicidan girdi almak icin scanner classindan bir input objesi olusturalim.

    2.Adim:  Kullanacagimiz degiskenleri atayalim. (kullanici puani,bilgisayar puani,tekrar,tur sayaci,beraberlik)

    3.Adim:  Kullaniciya oyun hakkinda bilgilendirme yapilabilir.

    4.Adim:  Do While loop kullanalim. Sartimiz kullanici oyunu kendi istegi ile sonlandirmasi olsun.

    5.Adim:  Kullanicidan alinacak secimi degiskene atayalim. (Dongu icerisinde tekrarlanacak)

    6.Adim:  Bilgisayarin secimini Math.random methodunu kullanarak alalim.

    7.Adim:  Oyun esnasinda hatali giris yapilirsa kullaniciyi uyaralim ama oyun ayni turdan devam etsin.

    8.Adim:  If leri kullanarak secimler karsilastirilsin ve tur sonucu yazdirilsin.

    9.Adim:  Kullanici yada bilgisayar 3 puana ulasirsa oyun sonlansin ve sonuclar yazdirilsin.

    10.Adim: Kullanici oyun tekrari isterse dongu bastan baslasin.

    11.Adim: Bu kisimda da hatali girdi yapilma ihtimaline karsi bir loop daha kullanabiliriz.

    12.Adim: Kullanici oyunu sonlandirmak isterse looplar kirilir ve ugurlama mesaji verilebilir.

    13.Adim: Istenilen duzeyde calisan kod uzerinde gorsel duzenlemeler yapilabilir.

    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userScore = 0;
        int pcScore = 0;
        String again = "";
        int counter = 1;
        int tieScore = 0;

        do {

            if (counter==1){

                System.out.println("Tas -Kagit-Makas oyununa hosgeldiniz..");
                System.out.println("Unutmayin: Tas makasi ezer. Makas kagidi kese. Kagit tasi sarar.");
                System.out.println("3 puana ulasan kazanir. Beraberlikte puan yoktur.");
                System.out.println("Oyunu sonlandirmak Q' ya basiniz.");
            }

            System.out.println(counter+". tur");
            System.out.println("Lutfen seciminizi giriniz. (Tas, Kagit, Makas)");
            String userChoice = input.next().toLowerCase();
            int pcChoice = (int)(Math.random()*3);

            if (userChoice.equals("q")){
                break;
            } else if ((userChoice.equals("tas") && pcChoice == 2)
                || (userChoice.equals("makas") && pcChoice == 1)
                || (userChoice.equals("kagit") && pcChoice == 0)) {

                System.out.println("Sayi sizin.");
                userScore++;
                System.out.println("userScore = " + userScore);
                System.out.println("pcScore = " + pcScore);
            } else if ((userChoice.equals("makas") && pcChoice == 0)
                || (userChoice.equals("kagit") && pcChoice == 2)
                || (userChoice.equals("tas") && pcChoice == 1)){

                System.out.println("Sayi bilgisayarin.");
                pcScore++;
                System.out.println("userScore = " + userScore);
                System.out.println("pcScore = " + pcScore);
            } else if ((userChoice.equals("tas") && pcChoice == 0)
                    || (userChoice.equals("kagit") && pcChoice == 1)
                    || (userChoice.equals("makas") && pcChoice == 2)) {

                System.out.println("Berabere. Puan alamadiniz.");
                tieScore++;

            }else {
                System.out.println("Hatali giris yaptiniz.");
                counter--;

            }
            counter++;


            if (userScore == 3 || pcScore == 3) {

                if (userScore > pcScore) {

                    System.out.println("Tebrikler oyunu kazandiniz.");

                } else {
                    System.out.println("Uzgunum oyunu kaybettiniz.");
                }


                System.out.println("Oyun sona erdi.");

                System.out.println("userScore = " + userScore);
                System.out.println("pcScore = " + pcScore);
                System.out.println("tieScore = " + tieScore);


                do {
                    System.out.println("Tekrar oynamak icin R' ye basiniz.");
                    System.out.println("oyunu sonlandirmak icin Q'ya basiniz.");
                    again = input.next().toLowerCase();

                    if (again.equals("r") || again.equals("q")) {
                        userScore = 0;
                        pcScore = 0;
                        counter = 1;
                        tieScore = 0;
                        break;
                    } else {
                        System.out.println("Hatali giris yaptiniz.");
                    }

                } while (true);

            }






        }while (!again.equals("q"));

        System.out.println("Bir sonraki oyunda gorusmek uzere. Hosca kalin.");


    }




}






