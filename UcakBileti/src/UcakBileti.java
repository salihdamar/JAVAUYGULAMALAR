import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        /**
         * Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
         * - Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
         * - Mesafe başına ücret 0,10 TL / km olarak alın.
         * - İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
         *      - Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
         *      - Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
         *      - Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
         *      - Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
         *      - Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */

        // Değişkenleri tanımla
        double biletFiyati = 0.0, mesafe, mesafeBasiUcret=0.10;
        int yas, yolculukTipi;
        boolean isHata=false;

        // Değişken Değerleri al
        Scanner sc = new Scanner(System.in);

        System.out.print("Mesafeyi Giriniz (Km) : ");
        mesafe = sc.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        yas = sc.nextInt();

        System.out.print("Yolculuk Tipini Giriniz (Tek Yön için: 1, Gidiş Dönüş için: 2): ");
        yolculukTipi = sc.nextInt();


         // yolculuk tipine göre tutar hesapla
         switch (yolculukTipi){
             case 1:
                 biletFiyati=mesafe*0.10;
                 break;
             case 2:
                 // Gidiş-Dönüş iki bilet olacağı için 2 ile çarpıldı ve %20 ((1-0.2)= 0.8) uygulandı.
                 biletFiyati=(mesafe*0.10)*2*0.8;
                 break;
             default:
                 isHata=true;
         }

         if (!isHata){
             if (0<yas && yas<12){
                 biletFiyati*=0.5;
                 System.out.println("Bilet Fiyatınız: " + biletFiyati+" TL");
             } else if (12<=yas && yas<24) {
                 biletFiyati*=0.9;
                 System.out.println("Bilet Fiyatınız: " + biletFiyati+" TL");
             } else if (24<=yas && yas<65) {
                 biletFiyati=biletFiyati;
                 System.out.println("Bilet Fiyatınız: " + biletFiyati+" TL");
             }else if (yas>65) {
                 biletFiyati*=0.7;
                 System.out.println("Bilet Fiyatınız: " + biletFiyati+" TL");
             }else {
                 System.out.println("Hatalı Veri Girdiniz");
             }

         }else {
             System.out.println("Hatalı Yolculuk Tipi Girdiniz. Lütfen 1 veya 2 Giriniz");
         }

    }
}
