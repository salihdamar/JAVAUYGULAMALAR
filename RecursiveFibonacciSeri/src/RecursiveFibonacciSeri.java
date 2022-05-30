import java.util.Scanner;

public class RecursiveFibonacciSeri {

    /**Java'da recursive metotlar ile fibonacci serisi bulan program yazınız.
     */

    static int fibonacci(int sayi){

        if (sayi==1 || sayi==2){
            return 1;
        }
        return fibonacci(sayi-1) +fibonacci(sayi-2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int input=sc.nextInt();
        System.out.println(fibonacci(input));

    }
}
