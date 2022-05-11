import java.util.Scanner;

public class vucutKitleIndeksi {
    public static void main(String[] args) {
        /**
        * Vücut Kitle İndeksi Hesaplama:
        * Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki
        * formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        * -Formül: Kilo (kg) / Boy(m) * Boy(m)
        */


        double boy;
        double kilo;
        double vucutKitleIndeksi;

        Scanner sc=new Scanner(System.in);

        // Boy Değeri Al
        System.out.print("Boyunuzu Giriniz (metre): ");
        boy=sc.nextDouble();

        // Kilo Değeri Al
        System.out.print("Kilonuzu Giriniz (kg) : ");
        kilo=sc.nextDouble();

        //Vücut Kitle İndeksi Hesapla
        vucutKitleIndeksi=kilo/(boy*boy);

        //Ekrana Yazdır
        System.out.println("--------------------------------------------------------");
        System.out.println("| Boyunuz               :| "+boy);
        System.out.println("| -----------------------|-----------------------------|");
        System.out.println("| Kilonuz               :| "+kilo);
        System.out.println("| -----------------------|-----------------------------|");
        System.out.println("| Vücut Kitle İndeksiniz:| "+vucutKitleIndeksi);
        System.out.println("| -----------------------------------------------------|");

    }
}
