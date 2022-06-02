import java.util.Scanner;

public class MaxMinSayilar {
    public static void main(String[] args) {
                
        int sayac,sayi,min=0,max=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kac sayi gireceksiniz : ");
        sayac = input.nextInt();

        for(int i=1; i<=sayac;i++){
            System.out.print(i + ". Sayiyi giriniz : "  );
            sayi = input.nextInt();

            if (i==1){
                max=sayi;
                min=sayi;
            }else{
                if (sayi>max){
                    max=sayi;
                } else if (sayi<min) {
                    min=sayi;
                }
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
