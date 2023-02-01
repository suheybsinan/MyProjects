package stone_paper_scissors;

import java.util.Scanner;

public class LetsPlay_StonePaperScissors {

    /*
        __Tas-Kagit-Makas__

    1.Adim:  Kodumuzu calistirmak icin Main fonksiyonu ve
             kullanicidan girdi almak icin scanner classindan bir input objesi olusturalim..

    2.Adim:  Kullanacagimiz degiskenleri atayalim. (kullanici puani,bilgisayar puani,tekrar,tur sayaci,beraberlik)

    3.Adim:  Kullaniciya oyun hakkinda bilgilendirme yapilabilir.

    4.Adim:  Do While loop kullanalim. Sartimiz kullanici oyunu kendi istegi ile sonlandirmasi olsun.

    5.Adim:  Kullanicidan alinacak secimi degiskene atayalim. (Dongu icerisinde tekrarlanacak)

    6.Adim:  Bilgisayarin secimini Math.random methodunu kullanarak alalim.

    7.Adim:  Oyun esnasinda hatali giris yapilirsa kullaniciyi uyaralim ama oyun ayni turdan devam etsin.

    8.Adim:  If leri kullanarak secimler karsilastirilsin ve tur sonucu yazdirilsin.

    9.Adim:  Kullanici yada bilgisayar 10 puana ulasirsa oyun sonlansin ve sonuclar yazdirilsin.

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
        System.out.println("");

        do {
            if (counter == 1) {

                System.out.println("┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀\r\n"
                        + "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼\r\n"
                        + "██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀\r\n"
                        + "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼\r\n"
                        + "███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n");

                System.out.println("\t\t    _______\r\n"
                        + "\t\t---'   ____)\r\n"
                        + "\t\t      (_____)\r\n"
                        + "\t\t      (_____)\r\n"
                        + "\t\t      (____)\r\n"
                        + "\t\t---.__(___)\r\n"
                        + "\t\t\r\n"
                        + "    _______\r\n"
                        + "---'   ____)____\r\n"
                        + "          ______)\r\n"
                        + "          _______)\r\n"
                        + "         _______)\r\n"
                        + "---.__________)\r\n"
                        + "\r\n"
                        + "\t\t    _______\r\n"
                        + "\t\t---'   ____)____\r\n"
                        + "\t\t          ______)\r\n"
                        + "\t\t       __________)\r\n"
                        + "\t\t      (____)\r\n"
                        + "\t\t---.__(___)");

                System.out.println("================================================");
                System.out.println("");
                System.out.println("\tTas-Kagit-Makas oyununa hos geldiniz..");
                System.out.println("Unutmayin:\n\tTas makasi ezer. Makas kagidi keser. Kagit tasi sarar.");
                System.out.println("\t10 puana ulasan kazanir. Beraberlikte puan yoktur.");
                System.out.println("\tOyunu sonlandirmak icin Q'ya basiniz.");
                System.out.println("Keyifli Oyunlar..");
            }

            System.out.println("================================================");
            System.out.println("\t" + counter + ". tur");
            System.out.println("Lutfen seciminizi giriniz. (Tas, Kagit, Makas)");
            String userChoice = input.next().toLowerCase();
            int pcChoice = (int) (Math.random() * 3);

            if (userChoice.equals("q")) {
                break;
            } else if (userChoice.equals("tas") && pcChoice == 2) {

                System.out.println("\t\t    _______\r\n"
                        + "\t\t---'   ____)\r\n"
                        + "\t\t      (_____)\r\n"
                        + "\t\t      (_____)\r\n"
                        + "\t\t      (____)\r\n"
                        + "\t\t---.__(___)\r\n"
                        + "\t\t\r\n");

                System.out.println("\r\n"
                        + "\t\t    _______\r\n"
                        + "\t\t---'   ____)____\r\n"
                        + "\t\t          ______)\r\n"
                        + "\t\t       __________)\r\n"
                        + "\t\t      (____)\r\n"
                        + "\t\t---.__(___)");
                System.out.println("\tSayi sizin. Tas makasi ezer.");
                userScore++;
                System.out.println("Sizin puaniniz     : " + userScore);
                System.out.println("Bilgisayarin puani : " + pcScore);

            } else if (userChoice.equals("tas") && pcChoice == 1) {

                System.out.println("\t\t    _______\r\n"
                        + "\t\t---'   ____)\r\n"
                        + "\t\t      (_____)\r\n"
                        + "\t\t      (_____)\r\n"
                        + "\t\t      (____)\r\n"
                        + "\t\t---.__(___)\r\n");

                System.out.println(
                        "    _______\r\n"
                                + "---'   ____)____\r\n"
                                + "          ______)\r\n"
                                + "          _______)\r\n"
                                + "         _______)\r\n"
                                + "---.__________)\r\n"
                                + "\r\n");
                System.out.println("\tSayi bilgisayarin. Kagit tasi sarar.");
                pcScore++;
                System.out.println("Sizin puaniniz     : " + userScore);
                System.out.println("Bilgisayarin puani : " + pcScore);

            } else if (userChoice.equals("kagit") && pcChoice == 0) {

                System.out.println("\t\t\r\n"
                        + "    _______\r\n"
                        + "---'   ____)____\r\n"
                        + "          ______)\r\n"
                        + "          _______)\r\n"
                        + "         _______)\r\n"
                        + "---.__________)\r\n"
                        + "\r\n");

                System.out.println("\t\t    _______\r\n"
                        + "\t\t---'   ____)\r\n"
                        + "\t\t      (_____)\r\n"
                        + "\t\t      (_____)\r\n"
                        + "\t\t      (____)\r\n"
                        + "\t\t---.__(___)\r\n"
                        + "\t\t\r\n");
                System.out.println("\tSayi sizin. Kagit tasi sarar.");
                userScore++;
                System.out.println("Sizin puaniniz     : " + userScore);
                System.out.println("Bilgisayarin puani : " + pcScore);

            } else if (userChoice.equals("kagit") && pcChoice == 2) {

                System.out.println("\t\t\r\n"
                        + "    _______\r\n"
                        + "---'   ____)____\r\n"
                        + "          ______)\r\n"
                        + "          _______)\r\n"
                        + "         _______)\r\n"
                        + "---.__________)\r\n");

                System.out.println("\r\n"
                        + "\t\t    _______\r\n"
                        + "\t\t---'   ____)____\r\n"
                        + "\t\t          ______)\r\n"
                        + "\t\t       __________)\r\n"
                        + "\t\t      (____)\r\n"
                        + "\t\t---.__(___)");
                System.out.println("\tSayi bilgisayarin. Makas kagidi keser.");
                pcScore++;
                System.out.println("Sizin puaniniz     : " + userScore);
                System.out.println("Bilgisayarin puani : " + pcScore);

            } else if (userChoice.equals("makas") && pcChoice == 0) {

                System.out.println("\r\n"
                        + "\t\t    _______\r\n"
                        + "\t\t---'   ____)____\r\n"
                        + "\t\t          ______)\r\n"
                        + "\t\t       __________)\r\n"
                        + "\t\t      (____)\r\n"
                        + "\t\t---.__(___)");
                System.out.println();
                System.out.println("\t\t    _______\r\n"
                        + "\t\t---'   ____)\r\n"
                        + "\t\t      (_____)\r\n"
                        + "\t\t      (_____)\r\n"
                        + "\t\t      (____)\r\n"
                        + "\t\t---.__(___)\r\n"
                        + "\t\t\r\n");
                System.out.println("\tSayi bilgisayarin. Tas makasi ezer.");
                pcScore++;
                System.out.println("Sizin puaniniz     : " + userScore);
                System.out.println("Bilgisayarin puani : " + pcScore);

            } else if (userChoice.equals("makas") && pcChoice == 1) {

                System.out.println("\r\n"
                        + "\t\t    _______\r\n"
                        + "\t\t---'   ____)____\r\n"
                        + "\t\t          ______)\r\n"
                        + "\t\t       __________)\r\n"
                        + "\t\t      (____)\r\n"
                        + "\t\t---.__(___)");

                System.out.println("\t\t\r\n"
                        + "    _______\r\n"
                        + "---'   ____)____\r\n"
                        + "          ______)\r\n"
                        + "          _______)\r\n"
                        + "         _______)\r\n"
                        + "---.__________)\r\n"
                        + "\r\n");
                System.out.println("\tSayi sizin. Makas kagidi keser.");
                userScore++;
                System.out.println("Sizin puaniniz     : " + userScore);
                System.out.println("Bilgisayarin puani : " + pcScore);

            } else if ((userChoice.equals("tas") && pcChoice == 0) || (userChoice.equals("makas") && pcChoice == 2) || (userChoice.equals("kagit") && pcChoice == 1)) {
                System.out.println("\tBerabere. Puan alamadiniz.");
                tieScore++;
            } else {
                System.out.println("\tHatali giris yaptiniz.");
                counter--;
            }
            counter++;
            System.out.println("");

            if (userScore == 3 || pcScore == 3) {

                if (userScore > pcScore) {
                    System.out.println("=================================================================");

                    System.out.println("░░░░░░░░░░░░░░░░░░░░░░█████████\r\n"
                            + "░░███████░░░░░░░░░░███▒▒▒▒▒▒▒▒███\r\n"
                            + "░░█▒▒▒▒▒▒█░░░░░░░███▒▒▒▒▒▒▒▒▒▒▒▒▒███\r\n"
                            + "░░░█▒▒▒▒▒▒█░░░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                            + "░░░░█▒▒▒▒▒█░░░██▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒███\r\n"
                            + "░░░░░█▒▒▒█░░░█▒▒▒▒▒▒████▒▒▒▒████▒▒▒▒▒▒██\r\n"
                            + "░░░█████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                            + "░░░█▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                            + "░██▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██\r\n"
                            + "██▒▒▒███████████▒▒▒▒▒██▒▒▒▒▒▒▒▒██▒▒▒▒▒██\r\n"
                            + "█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒████████▒▒▒▒▒▒▒██\r\n"
                            + "██▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                            + "░█▒▒▒███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                            + "░██▒▒▒▒▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█\r\n"
                            + "░░████████████░░░█████████████████");

                    System.out.println("==============================================================");
                    System.out.println("\tTebrikler. Oyunu kazandiniz.");

                } else {
                    System.out.println("==================================================================");

                    System.out.println("┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                            + "███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀\r\n"
                            + "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼\r\n"
                            + "██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀\r\n"
                            + "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼\r\n"
                            + "███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄\r\n"
                            + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                            + "███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼\r\n"
                            + "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼\r\n"
                            + "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼\r\n"
                            + "██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼\r\n"
                            + "███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄\r\n"
                            + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                            + "┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼\r\n"
                            + "┼┼┼┼┼┼████▄┼┼┼▄▄▄▄▄▄▄┼┼┼▄████┼┼┼┼┼┼┼\r\n"
                            + "┼┼┼┼┼┼┼┼┼▀▀█▄█████████▄█▀▀┼┼┼┼┼┼┼┼┼┼\r\n"
                            + "┼┼┼┼┼┼┼┼┼┼┼█████████████┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                            + "┼┼┼┼┼┼┼┼┼┼┼██▀▀▀███▀▀▀██┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                            + "┼┼┼┼┼┼┼┼┼┼┼██┼┼┼███┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                            + "┼┼┼┼┼┼┼┼┼┼┼█████▀▄▀█████┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                            + "┼┼┼┼┼┼┼┼┼┼┼┼███████████┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                            + "┼┼┼┼┼┼┼┼▄▄▄██┼┼█▀█▀█┼┼██▄▄▄┼┼┼┼┼┼┼┼┼\r\n"
                            + "┼┼┼┼┼┼┼┼▀▀██┼┼┼┼┼┼┼┼┼┼┼██▀▀┼┼┼┼┼┼┼┼┼\r\n"
                            + "┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼\r\n"
                            + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                            + "\r\n"
                            + "");
                    System.out.println("==============================================================");
                    System.out.println("\tUzgunum. Oyunu kaybettiniz.");
                }

                System.out.println("\tVe heyecan dolu oyun sona erdi.");
                System.out.println("");
                System.out.println("\tSizin puaniniz     : " + userScore);
                System.out.println("\tBilgisayarin puani : " + pcScore);
                System.out.println("\tBerabere kaldiginiz: " + tieScore);
                System.out.println("");

                do {
                    System.out.println("Tekrar oynamak icin R'ye basiniz.");
                    System.out.println("Oyunu sonlandirmak icin Q'ya basiniz.");
                    again = input.next().toLowerCase();

                    if (again.equals("r") || again.equals("q")) {
                        userScore = 0;
                        pcScore = 0;
                        tieScore = 0;
                        counter = 1;
                        System.out.println("");
                        break;

                    } else {
                        System.out.println("Hatali giris yaptiniz.");
                    }
                } while (true);
            }
        } while (!again.equals("q"));

        System.out.println("┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                + "┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼\r\n"
                + "┼┼┼┼┼┼████▄┼┼┼▄▄▄▄▄▄▄┼┼┼▄████┼┼┼┼┼┼┼\r\n"
                + "┼┼┼┼┼┼┼┼┼▀▀█▄█████████▄█▀▀┼┼┼┼┼┼┼┼┼┼\r\n"
                + "┼┼┼┼┼┼┼┼┼┼┼█████████████┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                + "┼┼┼┼┼┼┼┼┼┼┼██▀▀▀███▀▀▀██┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                + "┼┼┼┼┼┼┼┼┼┼┼██┼┼┼███┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                + "┼┼┼┼┼┼┼┼┼┼┼█████▀▄▀█████┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                + "┼┼┼┼┼┼┼┼┼┼┼┼███████████┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                + "┼┼┼┼┼┼┼┼▄▄▄██┼┼█▀█▀█┼┼██▄▄▄┼┼┼┼┼┼┼┼┼\r\n"
                + "┼┼┼┼┼┼┼┼▀▀██┼┼┼┼┼┼┼┼┼┼┼██▀▀┼┼┼┼┼┼┼┼┼\r\n"
                + "┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼\r\n"
                + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n");
        System.out.println("================================================");
        System.out.println("Bir sonraki oyunda gorusmek uzere. Hosca kalin..");
        System.out.println("================================================");

    }
}




/*
Scanner input = new Scanner(System.in);

        do {

            System.out.println("Bir oyun hakki icin carpim tablosundan bir soru bilmelisiniz.");
            int pcChoice1 = (int) (Math.random() * 10)+1;
            int pcChoice2 = (int) (Math.random() * 10)+1;
            System.out.println(pcChoice1+" * "+pcChoice2+" : ?");
            int result = input.nextInt();

            if ((pcChoice1*pcChoice2)==result){
                System.out.println("Tekrar oynamaya hak kazandiniz. Keyifli oyunlar..");
                break;
            }else {
                System.out.println("Uzgunum bir soru daha geliyor.");
            }
        }while (true);
 */



