import java.util.Scanner;

public class AtmProjeSwitchCase {
    public static void main(String[] args) {
        /**Java döngüler ile kullanıcının banka hesabını yönetebildiği bir ATM projesi yapınız.
         * */

        String kullaniciAdi, parola;
        int girisHakki = 3, bakiye = 1500, secim;

        Scanner input = new Scanner(System.in);
        while (girisHakki > 0) {
            System.out.print("Kullanıcı Adınız :");
            kullaniciAdi = input.nextLine();

            System.out.print("Parolanız : ");
            parola = input.nextLine();

            if (kullaniciAdi.equals("patika") && parola.equals("dev123")) {

                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    secim = input.nextInt();


                    switch (secim) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz para miktarını giriniz : ");
                            int yatirPara = input.nextInt();
                            bakiye += yatirPara;
                            break;

                        case 2:
                            System.out.print("Çekmek istediğiniz para miktarını giriniz : : ");
                            int cekPara = input.nextInt();

                            if (cekPara > bakiye) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                bakiye -= cekPara;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + bakiye);
                            break;
                    }

                } while (secim != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                girisHakki--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");

                if (girisHakki == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + girisHakki);
                }
            }
        }
    }
}
