package stone_paper_scissors;

import java.util.Scanner;

public class Study_StonePaperScissors02 {

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

                System.out.println("\tTas-Kagit-Makas oyununa hos geldiniz..");
                System.out.println("Unutmayin:\n\tTas makasi ezer. Makas kagidi keser. Kagit tasi sarar.");
                System.out.println("\t10 puana ulasan kazanir. Beraberlikte puan yoktur.");
                System.out.println("\tOyunu sonlandirmak icin Q'ya basiniz.");
                System.out.println("Keyifli Oyunlar..");
            }


            System.out.println("\t" + counter + ". tur");
            System.out.println("Lutfen seciminizi giriniz. (Tas, Kagit, Makas)");
            String userChoice = input.next().toLowerCase();
            int pcChoice = (int) (Math.random() * 3);



            if (userChoice.equals("q")) {
                break;

            } else if (userChoice.equals("tas") && pcChoice == 2) {

                System.out.println("\tSayi sizin. Tas makasi ezer.");
                userScore++;
                System.out.println("Sizin puaniniz     : " + userScore);
                System.out.println("Bilgisayarin puani : " + pcScore);

            } else if (userChoice.equals("tas") && pcChoice == 1) {

                System.out.println("\tSayi bilgisayarin. Kagit tasi sarar.");
                pcScore++;
                System.out.println("Sizin puaniniz     : " + userScore);
                System.out.println("Bilgisayarin puani : " + pcScore);

            } else if (userChoice.equals("kagit") && pcChoice == 0) {

                System.out.println("\tSayi sizin. Kagit tasi sarar.");
                userScore++;
                System.out.println("Sizin puaniniz     : " + userScore);
                System.out.println("Bilgisayarin puani : " + pcScore);

            } else if (userChoice.equals("kagit") && pcChoice == 2) {

                System.out.println("\tSayi bilgisayarin. Makas kagidi keser.");
                pcScore++;
                System.out.println("Sizin puaniniz     : " + userScore);
                System.out.println("Bilgisayarin puani : " + pcScore);

            } else if (userChoice.equals("makas") && pcChoice == 0) {

                System.out.println("\tSayi bilgisayarin. Tas makasi ezer.");
                pcScore++;
                System.out.println("Sizin puaniniz     : " + userScore);
                System.out.println("Bilgisayarin puani : " + pcScore);

            } else if (userChoice.equals("makas") && pcChoice == 1) {

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

                    System.out.println("\tTebrikler. Oyunu kazandiniz.");

                } else {

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

        System.out.println("Bir sonraki oyunda gorusmek uzere. Hosca kalin..");


    }

}
