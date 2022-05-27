import java.util.Scanner;

public class YildizUcgen {
    public static void main(String[] args) {

        /** Java'da döngüler kullanılarak yıldızlar ile üçgen yapınız.
         */

        Scanner sc=new Scanner(System.in);
        System.out.print("Basamak Sayısı Giriniz:");
        int sayi=sc.nextInt();

        for (int i=1; i <= sayi; i++){

            for (int k=1; k<= (sayi-i); k++){
                System.out.print(" ");
            }

            for (int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
