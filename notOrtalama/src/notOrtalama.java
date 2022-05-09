import java.util.Scanner;

public class notOrtalama {
    public static void main(String[] args) {
        /*
        Not Ortalaması Hesaplayan Program Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan 
        ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
        
        Ödev:
        Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise 
        "Sınıfta Kaldı" yazsın.Not : If ve Else kullanılmayacak...        
        */
            //Değişkenler 
            int matematik, fizik, kimya, turkce, tarih, muzik;

            //Scanner Sınıfı
            Scanner sc = new Scanner(System.in);

            //Kullanıcıdan Veri Alma
            System.out.print("Matematik Notunuzu Giriniz : ");
            matematik = sc.nextInt();

            System.out.print("Fizik Notunuzu Giriniz : ");
            fizik = sc.nextInt();

            System.out.print("Kimya Notunuzu Giriniz : ");
            kimya = sc.nextInt();

            System.out.print("Türkçe Notunuzu Giriniz : ");
            turkce = sc.nextInt();

            System.out.print("Tarih Notunuzu Giriniz : ");
            tarih = sc.nextInt();

            System.out.print("Müzik Notunuzu Giriniz : ");
            muzik = sc.nextInt();

            //Girilen Notların Ortalamasını Al
            int toplam = mat + fizik + kimya + turkce + tarih + muzik;
            double sonuc = toplam / 6;

            //Not Ortalaması Yazdır
            System.out.println("Ortalamanız : "+sonuc);

            //Sınıf Geçip Geçmemesi?
            boolean kosul = sonuc >= 60;
            String gectiMi = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
            System.out.println(gectiMi);

    }

}
