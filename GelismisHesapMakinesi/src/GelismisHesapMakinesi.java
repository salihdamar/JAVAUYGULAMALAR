import java.util.Scanner;

public class GelismisHesapMakinesi {

    static  void toplama() {
        Scanner sc = new Scanner(System.in);
        int sayi, sonuc = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı (çıkmak için '0' seçiniz) :");
            sayi = sc.nextInt();
            if (sayi == 0) {
                break;
            }
            sonuc += sayi;
        }
        System.out.println("Sonuç : " + sonuc);
    }

    static void cikarma() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int sayac = sc.nextInt();
        int sayi, sonuc = 0;

        for (int i = 1; i <= sayac; i++) {
            System.out.print(i + ". sayı :");
            sayi = sc.nextInt();
            if (i == 1) {
                sonuc += sayi;
                continue;
            }
            sonuc -= sayi;
        }

        System.out.println("Sonuç : " + sonuc);
    }

    static void times() {
        Scanner sc = new Scanner(System.in);
        int sayi, sonuc = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            sayi = sc.nextInt();

            if (sayi == 1)
                break;

            if (sayi == 0) {
                sonuc = 0;
                break;
            }
            sonuc *= sayi;
        }

        System.out.println("Sonuç : " + sonuc);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int sayac = scan.nextInt();
        double sayi, sonuc = 0.0;

        for (int i = 1; i <= sayac; i++) {
            System.out.print(i + ". sayı :");
            sayi = scan.nextDouble();
            if (i != 1 && sayi == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                sonuc = sayi;
                continue;
            }
            sonuc /= sayi;
        }

        System.out.println("Sonuç : " + sonuc);
    }

    static void power() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int taban = sc.nextInt();
        System.out.print("Üs değeri giriniz :");
        int us = sc.nextInt();
        int sonuc = 1;

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        System.out.println("Sonuç : " + sonuc);
    }

    static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int sayi = sc.nextInt();
        int sonuc = 1;

        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }

        System.out.println("Sonuç : " + sonuc);
    }

    static void mod() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Modu alınacak Sayıyı giriniz :");
        int moduAlinan = sc.nextInt();
        System.out.print("Mod sayısını giriniz :");
        int modSayisi = sc.nextInt();
        int sonuc = moduAlinan%modSayisi;
        System.out.println("Sonuç : " + sonuc);
    }
    static void dikdortgenAlanCevre() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci kenar uzunluğunun giriniz :");
        int kenar1 = sc.nextInt();
        System.out.print("İkinci kenar uzunluğunun giriniz :");
        int kenar2 = sc.nextInt();
        int alan, cevre;
        cevre=2*(kenar1+kenar2);
        alan=kenar1*kenar2;
        System.out.println("Dikdörtgenin çevresi: " + cevre);
        System.out.println("Dikdörtgenin alanı: " + alan);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dikdortgenAlanCevre();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}
