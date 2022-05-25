import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        /** Java ile faktöriyel hesaplayan program yazıyoruz.
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Faktöriyel Sayını Giriniz");
        int sayi=sc.nextInt();
        int toplam=1;
        int sayac=1;

        while (sayac <= sayi){
            toplam*=sayac;
            sayac++;
        }
        System.out.println( sayi+" sayısının faktöriyeli: "+toplam);
    }
}
