public class Main {
    public static void main(String[] args) {
        System.out.println("Out Sınıfından nesne oluşturarak In sınıfına ait metodlara ulaşıldı.");
        Out out=new Out();
        out.OutRun();

        System.out.println("--------------------------");

        System.out.println("Out Sınıfı araçığıyla In Sınıfından nesne oluşturarak In sınıfına ait metodlara ulaşıldı.");
        Out.In in=out.new In();
        in.inRun();


    }
}
