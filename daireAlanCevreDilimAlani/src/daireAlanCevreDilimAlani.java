import java.util.Scanner;

public class daireAlanCevreDilimAlani {
    public static void main(String[] args) {
        /**
        * Dairenin Alanını ve Çevresini Hesaplayan Program
        * java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
        *  -Alan Formülü : π * r * r;
        *  -Çevre Formülü : 2 * π * r;
        *
        * Ödev:
        * Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        *  -𝜋 sayısını = 3.14 alınız.
        *  -Formül : (𝜋 * (r*r) * 𝛼) / 360
        */

        double yariCap;
        double pi=3.14;
        double daireAlan;
        double daireCevre;
        double daireDilimAlani;
        double daireDilimAcisi;

        Scanner sc=new Scanner(System.in);

        // Yarıçap Değeri Al
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        yariCap=sc.nextDouble();

        // Daire Dilim Açısı
        System.out.print("Daire Dilimin Açısını Giriniz (Derece): ");
        daireDilimAcisi=sc.nextDouble();

        // Daire Dilim Alanı
        daireDilimAlani=(pi*daireDilimAcisi*(yariCap*yariCap))/360;

        //Dairenin Çevresi Hesapla
        daireCevre=2*pi*yariCap;

        //Dairenin Alanını Hesapla
        daireAlan=pi*yariCap*yariCap;

        //Ekrana Yazdır
        System.out.println("----------------------------------------------------------");
        System.out.println("| Dairenin Yarıçap Değeri :| "+yariCap);
        System.out.println("| -------------------------|-----------------------------|");
        System.out.println("| Daire Dilimin Açısını   :| "+daireDilimAcisi);
        System.out.println("| -------------------------|-----------------------------|");
        System.out.println("| Tüm Dairenin Çevresi    :| "+daireCevre);
        System.out.println("| -------------------------|-----------------------------|");
        System.out.println("| Tüm Dairenin Alanı      :| "+daireAlan);
        System.out.println("| -------------------------|-----------------------------|");
        System.out.println("| Daire Dilimin Alanı     :| "+daireDilimAlani);
        System.out.println("| -------------------------------------------------------|");

    }
}
