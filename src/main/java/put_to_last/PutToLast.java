package put_to_last;

import java.util.Arrays;
import java.util.Scanner;

public class PutToLast {
    public static void main(String[] args) {

        // Kullanicidan aldiginiz sayilarin icerisinden kullanicinin belirledigi sayiyi sona alan kodu yaziniz.
        // Kullanicidan sayi girdileri aliniyor. (Kac sayi girdisi olacagini kullanici belirliyor.)
        // Kullanicinin girdigi sayilardan hangisinin sona alacagini isteniyor.
        // Kullaniciya belirttigi sayinin sona alindigi bilgisi yazdiriliyor.

        /*
        1.Adim: Scanner clasindan input objesi olusturulmali.

        2.Adim: Kullanicidan olusturulacak array in eleman sayisi istenmeli. (ilk arrayi olusturmus oluyoruz)

        3.Adim: Olusan array in elemanlari kullanicidan istenmeli. (loop)

        4.Adim: Kullaniciya olusturdugu array i gostererek hangi sayinin sona alinacagi sorulmali.

        5.Adim: Sona alinmasi istenilen sayinin array de kac kere oldugu hesaplanmali. (loop)

        6.Adim: Ilk array uzunlugu olcusunde sonuc array i olusturulmali.

        7.Adim: Sona koyulacak sayinin kac adet olduguna gore belirlenen index ten itibaren yazdirilmali. (array-loop)

        8.Adim: Array in istenilen duzene geldigini kullaniciya gosterilmeli.
        */


        Scanner input = new Scanner(System.in);


        System.out.println("Lutfen yapilacak islem sayisini giriniz.");
        int numberOfElement = input.nextInt();
        int[] numbers = new int[numberOfElement];

        for (int i = 0; i < numberOfElement; i++) {
            System.out.println("Lutfen " + (i + 1) + ". sayiyi giriniz");
            int num = input.nextInt();
            numbers[i] = num;
        }






        int end;
        int counter = 0;
        do {
            System.out.println("First instance: " + Arrays.toString(numbers));
            System.out.println("Lutfen islem yapilacak sayiyi giriniz.");
            end = input.nextInt();

            for (int w : numbers) {
                if (w == end) {
                    counter++;
                }
            }

            if (counter > 0) {
                System.out.println(end + " sayisi array'de " + counter + " defa var.");
                break;
            } else {
                System.out.println(end + " sayisi array'de yok.");
            }
        } while (true);






        int[] result = new int[numbers.length];

        int idx1 = 0;
        int idx2 = numbers.length - counter;

        for (int z : numbers) {

            if (z != end) {
                result[idx1] = z;
                idx1++;

            } else {
                result[idx2] = z;
                idx2++;
            }
        }
        System.out.println("Last instance: " + Arrays.toString(result));


    }
}



/*

Biri bastan yerelstirmeye baslasin, digeri sondan.

        */
