/*
 Eleme Sorusu – 1 :
     Aşağıda belirtilmiş olan algoritmanın amacını ve çalıştığında alacağı değer ve sonuçları yazınız.
     1. Start
     2. Initialize T=0
     3. Initialize N=0
     4. READ X
     5. IF X==0 GO TO Step 9
     6. T=T+X
     7. N=N+1
     8. GO TO Step 4
     9. Y=T/N
     10. Display Y on the Screen

 Cevap:
     1-Girilen sayıları toplayıp, girelen sayının sıfır olaması halinde ise girilmiş sayıların ortalamsını
alan bir algoritmadır.
     2-Eğer ilk olarak sıfır(0) sayısı girilirse N sıfır olacağından (Y=T/N=0/0) sıfıra
 bölme (ArithmeticException:/ by zero) hatası oluşacaktır.

 */

import java.util.Scanner;

public class Algoritma {
    public static void main(String[] args) {
        int  N=0,Y,T=0;

        while (true){
            Scanner sc=new Scanner(System.in);
            System.out.print("Bir sayi giriniz: ");
            int X=sc.nextInt();
            if (X==0){
                break;
            }
            T+=X;
            N++;
        }
        Y=T/N;
        System.out.println(Y);
    }
}
