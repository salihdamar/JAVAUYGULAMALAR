import java.util.Scanner;

public class SayilariBuyuktenKucugeSirala {
    public static void main(String[] args) {
        int sayi1, sayi2, sayi3;
        Scanner sc=new Scanner(System.in);

        System.out.println("Lütfen Üç Farlı Sayı Girinizi");

        System.out.println("Birinci Sayiyi Giriniz");
        sayi1=sc.nextInt();
        System.out.println("İkinci Sayiyi Giriniz");
        sayi2=sc.nextInt();
        System.out.println("Üçüncü Sayiyi Giriniz");
        sayi3=sc.nextInt();

        if (sayi1 > sayi2 && sayi1 > sayi3)
        {
            if (sayi2 >sayi3)
            {
                System.out.println( sayi1 +" > " + sayi2 +" > "+ sayi3 );
            } else{
                System.out.println(sayi1 +" > " + sayi3+" > "+ sayi2);
            }
        } else if (sayi2 > sayi1 && sayi2> sayi3) {
            if (sayi1 > sayi3) {
                System.out.println(sayi2 + " > " + sayi1 + " > " + sayi3);
            } else {
                System.out.println(sayi2 + " > " + sayi3 + " > " + sayi1);
            }
        }else{
            if (sayi1 > sayi2) {
                System.out.println(sayi3 + " > " + sayi1 + " > " + sayi2);
            } else {
                System.out.println(sayi3 + " > " + sayi2 + " > " + sayi1);
            }
        }
    }
}
