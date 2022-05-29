import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        /** Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*)
         * ile ekrana ters üçgen çizen programı yazın.
         */

        Scanner sc=new Scanner(System.in);
        System.out.print("Basamak Sayısı Giriniz:");
        int sayi=sc.nextInt();

        for (int i=sayi; i >0 ; i--){

            for (int k=sayi-i; k>0; k--){
                System.out.print(" ");
            }

            for (int j=(2*i)-1; j>0; j--){
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
