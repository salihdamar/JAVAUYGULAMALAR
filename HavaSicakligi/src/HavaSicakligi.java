import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {
        /**
         * Koşullar :
         *  -Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
         *  -Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
         *  -Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
         *  -Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
         *
         * Ödev: Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
         */
        int sicaklik;
        Scanner sc=new Scanner(System.in);
        System.out.println("Sıcaklık Değerini Giriniz(Derece Cinsinden)");
        sicaklik=sc.nextInt();

        /* Üç parça halinde koşullar oluşturuldu
        boolean kayak= sicaklik<5;
        boolean sinema= 5<=sicaklik && sicaklik<15;
        boolean piknik= 15<=sicaklik && sicaklik<25;

        // Sondan Başlayarak Koşul oluşturduk
        String YuzmePiknik = piknik ? "Pikniğe Gidebilirsiniz":"Yüzmeye Gidebilirsiniz";
        String sinemaYuzmePiknik = sinema ? "Sinemaya Gidebilirsiniz":YuzmePiknik;
        String durum = kayak ? "Kayak Yapabilirsiniz" : sinemaYuzmePiknik;
        */

        // Tek parça halinde koşullar oluşturuldu
        String durum= (sicaklik<5) ? "Kayak Yapabilirsiniz" : ( (5<=sicaklik && sicaklik<15) ? "Sinemaya Gidebilirsiniz":( (15<=sicaklik && sicaklik<25) ? "Pikniğe Gidebilirsiniz":"Yüzmeye Gidebilirsiniz"));

        System.out.println(durum);
    }
}
