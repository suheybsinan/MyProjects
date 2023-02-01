package put_to_last;

import java.util.Arrays;
import java.util.Scanner;

public class PutToLast01 {
    public static void main(String[] args) {

        // Kullanicidan aldiginiz sayilarin icerisinden kullanicinin belirledigi sayiyi sona alan kodu yaziniz.
        // Kullanicidan sayi girdileri aliniyor. (Kac sayi girdisi olacagini kullanici belirliyor.)
        // Kullanicinin girdigi sayilardan hangisinin sona alacagini isteniyor.
        // Kullaniciya belirttigi sayinin sona alindigi bilgisi yazdiriliyor.



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
        int idx2 = numbers.length-1;

        for (int z : numbers) {

            if (z != end) {
                result[idx1] = z;
                idx1++;

            } else {
                result[idx2] = z;
                idx2--;
            }
        }
        System.out.println("Last instance: " + Arrays.toString(result));


    }
}



/*

Biri bastan yerelstirmeye baslasin, digeri sondan.

System.out.println("Lutfen islem yapilacak sayiyi giriniz.");
        int endNum = input.nextInt();

        Arrays.sort(numbers);

        if (Arrays.bumbeinarySearch(nrs,endNum);
        */
