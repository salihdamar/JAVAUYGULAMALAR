public class Main {
    public static void main(String[] args) {
        Integer i=24;
        String str="patika";
        Double pi=3.14;

        GenericsClassTest<Integer,String,Double> gnTest=new GenericsClassTest<>(i,str,pi);
        gnTest.showInfo();
    }
}
