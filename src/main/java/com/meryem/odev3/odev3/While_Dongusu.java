package com.meryem.odev3.odev3;

public class While_Dongusu {
    public static void main(String[] args) {
        /**
         * while döngüsü, belirli bir koşul doğru olduğu sürece döngünün içindeki işlemlerin
         * tekrarlanmasını sağlayan bir döngü yapısıdır. while döngüsü, başlangıçta belirlenen bir
         * koşulun doğruluğunu kontrol eder. Koşul doğru olduğu sürece döngü içindeki işlemler tekrarlanır.
         * Koşul yanlış olduğunda döngü sona erer ve program döngüden sonra gelen satırlara devam eder.
         *
         * while döngüsünün genel yapısı şu şekildedir:
         *
         * while (koşul) {
         *     // Koşul doğru olduğu sürece yapılacak işlemler
         *     // Döngü içinde gerçekleştirilecek kodlar
         * }
         */

        int sayac = 0;

        while (sayac < 5) {
            System.out.println("Sayacın değeri: " + sayac);
            sayac++; // Her döngü adımında sayac değerini bir artır
        }


    }
}
