import java.util.Scanner;

public class PalindromSayi {
    /**Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
     * Palindrom Sayı Nedir?: Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
     * Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
     */

    static String isPalindrom(int sayi){
        int geciciSayi=sayi, tersSayi=0, sonSayi;

        while (geciciSayi != 0){
            sonSayi=geciciSayi%10;
            tersSayi=tersSayi*10 + sonSayi;
            geciciSayi=geciciSayi/10;
        }
        return  tersSayi==sayi ? sayi+" sayisi palindram sayıdır." : sayi+" sayisi palindram sayı değildir.";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int input=sc.nextInt();
        System.out.println(isPalindrom(input));

    }
}
