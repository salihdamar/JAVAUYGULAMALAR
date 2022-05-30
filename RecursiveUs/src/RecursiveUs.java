import java.util.Scanner;

public class RecursiveUs {
    /**Recursive Metotlar ile Üslü Sayı Hesaplama
     * Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive"
     * metot kullanarak yapan programı yazınız.
     */

    static  int usAlma(int taban, int us){
        if(us==0) return 1;
        return taban * usAlma(taban,us-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Taban sayıyı giriniz: ");
        int taban = sc.nextInt();

        System.out.print("Ussu giriniz: ");
        int us = sc.nextInt();

        System.out.println("Sonuc = " + usAlma(taban,us));

    }

}
