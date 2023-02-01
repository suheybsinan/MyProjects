import java.util.Scanner;

public class LetsPlay_NumberGuessingGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int rastgeleSayi = (int) (Math.random() * 101);
        int sayi;
        int sayac = 10;
        String tekrar = "";

        System.out.println("Lutfen 0-100 arasi bir tam sayi giriniz.");
        do {
            sayac--;
            sayi = input.nextInt();

            if (sayac == 0) {
                System.out.println("Hakkınız bitti");

            } else if (sayi < rastgeleSayi) {
                System.out.println(sayac + " hakkiniz kaldi.");
                System.out.println("Daha buyuk bir sayi giriniz.");

            } else if (sayi > rastgeleSayi) {
                System.out.println(sayac + " hakkiniz kaldi.");
                System.out.println("Daha kucuk bir sayi giriniz.");

            } else {
                System.out.println("Tebrikler!!! " + (10 - sayac) + " tahminde buldunuz.");
                System.out.println("Puanınız: " + (sayac + 1) * 10);
            }
            if (sayac == 0 || sayi == rastgeleSayi) {

                do {
                    System.out.println("Tekrar oynamak icin R'ye basiniz.");
                    System.out.println("Oyunu sonlandirmak icin Q'ya basiniz.");
                    tekrar = input.next().toLowerCase();

                    if (tekrar.equals("r")) {
                        sayac = 10;
                        rastgeleSayi = (int) (Math.random() * 101);
                        System.out.println("Lutfen 0-100 arasi bir tam sayi giriniz.");
                        break;

                    } else if (tekrar.equals("q")) {
                        break;

                    } else {
                        System.out.println("Hatali giris yaptiniz.");
                    }
                } while (true);

            }

        } while (!tekrar.equals("q"));

        System.out.println("Bir sonraki oyunda gorusmek uzere. Hosca kalin..");

    }
}
