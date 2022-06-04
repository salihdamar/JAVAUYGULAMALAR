import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {

        /** Ödev:Java ile girilen sayının harmonik serisini bulan program yazacağız.
         * 1 + (1/2) + (1/3) +  (1/4) +  (1/5) + ....... +  (1/n)
         */

        int sayi;
        double toplam=0.0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        sayi=sc.nextInt();

        for (double i=1; i<=sayi; i++){
            toplam+=(1/i);
        }
        System.out.println(toplam);
    }
}
