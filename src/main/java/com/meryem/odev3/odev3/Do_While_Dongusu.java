package com.meryem.odev3.odev3;

import java.util.Scanner;

public class Do_While_Dongusu {
    public static void main(String[] args) {
        /**
         *do-while döngüsü, koşulun döngü bloğunu çalıştırmadan önce değil, çalıştırıldıktan sonra
         *kontrol edildiği bir döngü türüdür. Bu nedenle, do-while döngüsü, döngü bloğunu en az bir
         *kez çalıştırır ve ardından koşulu kontrol eder. Koşul doğru olduğu sürece döngü bloğu tekrar
         *çalıştırılır.
         *
         *  şu şekilde yazılır;
         *
         *   do {
         *     // Döngü bloğu
         *     // Bu blok en az bir kez çalıştırılır
         *
         *     // Döngüden çıkmak için koşulu değiştiren bir durum sağlanmalıdır
         *   } while (koşul);
         */

        Scanner scanner = new Scanner(System.in);
        int sayi;

        do {
            System.out.print("Lütfen pozitif bir sayı girin: ");
            sayi = scanner.nextInt();
        } while (sayi <= 0);

        System.out.println("Girdiğiniz sayı pozitif: " + sayi);

        // kullanıcıdan pozitif bir sayı girmesi istenir.
        // Eğer kullanıcı pozitif bir sayı giremezse, döngü sürekli olarak çalışmaya devam eder
        // ve kullanıcı pozitif bir sayı girene kadar istemeye devam eder. Kullanıcı pozitif bir
        // sayı girdikten sonra döngü sona erer ve girdiği sayı ekrana bastırılır.

    }
}
