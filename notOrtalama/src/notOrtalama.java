import java.util.Scanner;

public class notOrtalama {
    public static void main(String[] args) {
            //Değişkenler
            int mat, fizik, kimya, turkce, tarih, muzik;

            //Scanner Sınıfı
            Scanner sc = new Scanner(System.in);

            //Kullanıcıdan Veri Alma
            System.out.print("Matematik Notunuzu Giriniz : ");
            mat = sc.nextInt();

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

            //Verilerin Ortalamasını Alma
            int toplam = mat + fizik + kimya + turkce + tarih + muzik;
            double sonuc = toplam / 6;

            //Ekrana Not Ortalaması Yazdırma
            System.out.println("Ortalamanız : "+sonuc);

            //Sınıf Geçip Geçmemesi?
            boolean kosul = sonuc >= 60;
            String gectiMi = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
            System.out.println(gectiMi);

    }

}
