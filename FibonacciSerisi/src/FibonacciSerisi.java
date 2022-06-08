import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        /**
         * Java döngüler ile fibonacci serisi bulan program yazınız. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
         *
         * Fibonacci Serisi Nedir?:
         * Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir. Bu şekilde devam
         * eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar, yani bir sayı kendisinden önceki sayıya
         * bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.
         * Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın
         * sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:
         *
         * 9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
         */

        int oncekiSayi = 0, simdikiSayi = 1, sonrakiSayi =0;

        Scanner sc=new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int elamanSayisi = sc.nextInt();

        for (int i = 0; i <= elamanSayisi; i++) {
            System.out.print(oncekiSayi + " ");

            sonrakiSayi=oncekiSayi + simdikiSayi;
            oncekiSayi=simdikiSayi;
            simdikiSayi=sonrakiSayi;

        }
    }
}