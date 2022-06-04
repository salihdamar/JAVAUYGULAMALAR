import java.util.Scanner;

public class RecursiveDesen {
    
    /** Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir
     * "Recursive" metot yazın.
     * Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her
     * çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar
     * 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
     *
     * N Sayısı : 16
     * Çıktısı : 16 11 6 1 -4 1 6 11 16
     *
     * N Sayısı : 25
     * Çıktısı : 25 20 15 10 5 0 5 10 15 20 25
     */

    static int desenCikar(int sayi) {
        if (sayi <= 0) return sayi;
        System.out.print(sayi+" ");
        return desenCikar(sayi -5);
    }

    static int desenTopla(int cikarSayi, int sayi ) {
        if (cikarSayi > sayi) return cikarSayi;
        System.out.print(cikarSayi + " ");
        return desenTopla(cikarSayi + 5,sayi);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("N Sayisi:");
        int sayi=sc.nextInt();
        desenTopla(desenCikar(sayi),sayi);
    }
}
