import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        /**
         *Ödev:
         * Videodaki hesap makinesini switch-case kullanarak yapınız.
         */

        // Değişkenleri Tanımla
        int sayi1,sayi2, secim;

        Scanner sc=new Scanner(System.in);

        // Sayiların Değeri Al
        System.out.print("Birinci Sayının Dğerini Giriniz: ");
        sayi1=sc.nextInt();

        System.out.print("İkinci Sayının Dğerini Giriniz: ");
        sayi2=sc.nextInt();
        System.out.println("---------------------------------");
        System.out.println("Yapmak istediğiniz işlemi seçiniz");
        System.out.println("Toplama işlemi için: '1'" +
                "\nÇıkarma işlemi için: '2'"+
                "\nÇarpma işlemi için: '3'"+
                "\nBölme işlemi için: '4'");
        secim=sc.nextInt();
        System.out.println("---------------------------------");
        switch (secim){
            case 1:
                System.out.print("İşleminizin Sonucu: "+(sayi1+sayi2));
                break;
            case 2:
                System.out.print("İşleminizin Sonucu: "+(sayi1-sayi2));
                break;
            case 3:
                System.out.print("İşleminizin Sonucu: "+(sayi1*sayi2));
                break;
            case 4:
                if(sayi2!=0){
                    System.out.print("İşleminizin Sonucu: "+(sayi1/sayi2));
                }else {
                    System.out.print("Bir sayı sıfıra bölünemez");
                }
                break;
            default:
                System.out.print("Lütfen 1-2-3-4 değerlerinde birini seçiniz!");
        }
    }

}
