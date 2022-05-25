import java.util.Scanner;

public class DordunBesinKuvveti {

    public static void main(String[] args) {
        /** Ödev:
         * Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazınız.
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        int sayi=sc.nextInt();

        System.out.print( sayi+ " sayısından küçük dördün kuvvetleri: ");
        for (int i=1; i<=sayi; i*=4){
            System.out.print(i + "   ");
        }

        System.out.print( sayi+ " sayısından küçük beşin kuvvetleri: ");
        for (int i=1; i<=sayi; i*=5){
            System.out.print(i + "   ");
        }

    }
}
