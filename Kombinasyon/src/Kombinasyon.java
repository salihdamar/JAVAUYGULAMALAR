import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        
        /** Ödev: N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların
         *  sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde
         *  gösterilir.
         *
         * Java ile kombinasyon hesaplayan program yazınız. Kombinasyon formülü: C(n,r) = n! / (r! * (n-r)!)
         */

        //NOT: Fonsiyonlar konusu işlenmediği için for döngüleri ile yazılmıştır.

        int n,r;
        int nToplam=1, rToplam=1,nrToplam=1;
        double kombinasyon;

        Scanner sc=new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz");
        n=sc.nextInt();
        System.out.println("Bir Sayı Giriniz");
        r=sc.nextInt();

        int nr=n-r;

        for (int i=1; i<=n; i++){
            nToplam*=i;
        }

        for (int i=1; i<=r; i++){
            rToplam*=i;
        }

        for (int i=1; i<=nr; i++){
            nrToplam*=i;
        }

        kombinasyon=nToplam/(rToplam*nrToplam);
        System.out.println(n+ "'in "+r+"'li kombinasyonu C("+n+","+ r+"): "+ kombinasyon);

    }
}
