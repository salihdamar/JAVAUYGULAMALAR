import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        /** Sınıfı Geçme Durumu
         *  Dersler : Matematik,Fizik,Türkçe,Kimya,Müzik
         *  Geçme Notu : 55
         *
         * Ödev:Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın
         */

        //For Konusu işlenilmediği için  if ile çözüldü.
        //Değişkenleri tanımla
        int  matematik,fizik,turkce,kimya,muzik;
        double notOrtalama=0;
        int sayac=0;
        int toplam=0;

        // Not Değeri Al
        Scanner sc=new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        matematik= sc.nextInt();
        if (0<=matematik && matematik<=100){
            toplam+=matematik;
            sayac++;
        }else{
            System.out.print("Geçersiz Değer Araliğinda Bir Not Girdiniz.");
        }

        System.out.print("Fizik notunu giriniz: ");
        fizik= sc.nextInt();
        if (0<=fizik && fizik<=100){
           toplam+=fizik;
            sayac++;
        }else{
             System.out.print("Geçersiz Değer Araliğinda Bir Not Girdiniz.");
        }


        System.out.print("Türkçe notunu giriniz: ");
        turkce= sc.nextInt();
        if (0<=turkce && turkce<=100){
            toplam+=turkce;
            sayac++;
        }else{
            System.out.print("Geçersiz Değer Araliğinda Bir Not Girdiniz.");
        }

        System.out.print("Kimya notunu giriniz: ");
        kimya= sc.nextInt();
        if (0<=kimya && kimya<=100){
            toplam+=kimya;
            sayac++;
        }else{
             System.out.print("Geçersiz Değer Araliğinda Bir Not Girdiniz.");
        }

        System.out.print("Müzik notunu giriniz: ");
        muzik = sc.nextInt();
        if (0<=muzik && muzik<=100){            
            toplam+=muzik;
            sayac++;
        }else{
             System.out.print("Geçersiz Değer Araliğinda Bir Not Girdiniz.");
        }

        notOrtalama = topla/sayac;

        if (notOrtalama<55){
            System.out.println("Sınıfta Kaldınız.");
        }else{
            System.out.println("Sınıftı Geçtiniz.");
        }
        System.out.print("Ortalamanız : "+ notOrtalama);
    }
}
