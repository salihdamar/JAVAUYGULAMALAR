import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        /* Kullanıcı Girişi
        *  Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        *  eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
        *  unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise
        *  ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre
        *  oluşturuldu" yazan programı yazınız.
        */


        //Değişkenleri Tanımla
        String kullaniciAdi, parola, yeniParola;

        //Kullanıcı Adı ve Parola Değerlerini Al
        Scanner sc=new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz: ");
        kullaniciAdi= sc.nextLine();
        System.out.print("Parolanızı Giriniz: ");
        parola= sc.nextLine();

        // Kullanıcı Adı ve Parola Değerlerini Kontrol et
        if (kullaniciAdi.equals("patika")  && parola.equals("java123")){
            System.out.println("Sisteme Giriş Yaptınız");
        }
        else{
            System.out.println("Giriş Yapılamadı");

            // Parolayı sıfırlamak isteyip istemediğini sor
            System.out.println("Şifreni Sıfırlamak İstiyor musun?" +
                    "\n Sıfırlamak istiyorsan '1' " +
                    "\n İstemiyorsan '2' seç.");
            int secim=sc.nextInt();

            switch (secim){
                case 1:

                    System.out.print("Yeni Bir Parola Giriniz: ");
                    yeniParola= sc.nextLine();

                    if (yeniParola.equals("java123")){
                        System.out.print("Yeni Parolanız eski parola aynı Giriniz: ");
                    }
                    else {
                        System.out.print("Tebrikler Parolanız Sıfırlandı" );
                        System.out.print("Yeni Parolanız: " +yeniParola );
                    }

                    break;
                case 2:
                    break;
                default:
                    System.out.println("Lütfen '1' veya '2' değerlerinin birini seçiniz.");
            }
        }
    }
}
