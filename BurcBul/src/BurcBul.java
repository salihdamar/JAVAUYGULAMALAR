import java.util.Scanner;

public class BurcBul {

    public static void main(String[] args) {
        /** Ödev: switch-case kullanmadan burç bulan program yazınız.
         * Koç Burcu    : 21 Mart - 20 Nisan
         * Boğa Burcu   : 21 Nisan - 21 Mayıs
         * İkizler Burcu: 22 Mayıs - 22 Haziran
         * Yengeç Burcu : 23 Haziran - 22 Temmuz
         * Aslan Burcu  : 23 Temmuz - 22 Ağustos
         * Başak Burcu  : 23 Ağustos - 22 Eylül
         * Terazi Burcu : 23 Eylül - 22 Ekim
         * Akrep Burcu  : 23 Ekim - 21 Kasım
         * Yay Burcu    : 22 Kasım - 21 Aralık
         * Oğlak Burcu  : 22 Aralık - 21 Ocak
         * Kova Burcu   : 22 Ocak - 19 Şubat
         * Balık Burcu  : 20 Şubat - 20 Mart
         */

        int gun, ay;
        String burc="";
        boolean isHata=false;

        // Ay ve gün Değerlerini al
        Scanner sc = new Scanner(System.in);

        System.out.print("Ay giriniz: ");
        ay = sc.nextInt();

        System.out.print("Gün giriniz: ");
        gun = sc.nextInt();


        // Ay ve gun değeri kontrol et
        if (ay == 1) {
            if (1 <= gun && gun<=31){
                if (gun < 22 ) {
                    burc="Oğlak";
                } else {
                    burc="Kova";
                }
            }else {
                isHata=true;
            }
        } else if (ay == 2) {
            if (1 <= gun && gun <= 28) {
                if (gun < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else {
                isHata = true;
            }
        } else if (ay == 3) {
            if (1 <= gun && gun <= 31) {
                if (gun < 21) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else {
                isHata = true;
            }
        } else if (ay == 4) {
            if (1 <= gun && gun <= 31) {
                if (gun < 21) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            } else {
                isHata = true;
            }
        } else if (ay == 5) {
            if (1 <= gun && gun <= 31) {
                if (gun < 22) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            } else {
                isHata = true;
            }
        } else if (ay == 6) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            } else {
                isHata = true;
            }
        } else if (ay == 7) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
            } else {
                isHata = true;
            }
        } else if (ay == 8) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            } else {
                isHata = true;
            }
        } else if (ay == 9) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            } else {
                isHata = true;
            }
        } else if (ay == 10) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else {
                isHata = true;
            }
        } else if (ay == 11) {
            if (1 <= gun && gun <= 31) {
                if (gun < 22) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                isHata = true;
            }
        } else if (ay == 12) {
            if (1 <= gun && gun <= 31) {
                if (gun < 22) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            } else {
                isHata = true;
            }
        }else {
            isHata=true;
        }

        // Çıktı ve Hata ver.
        // Hata değeri true ise hata ver.
        if (isHata){
            System.out.println("Hatalı Değer Girdiniz.Lütfen Tekrar Giriniz.");

        }else {
            System.out.println("Burcunuz: " + burc);
        }

    }
}
