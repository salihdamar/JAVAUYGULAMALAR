public class DiziOrtalamasi {
    public static void main(String[] args) {
        int[] arrayList={15,6,7,12,7,9,3};
        double arrayListAverage=0.0, arrayListSum=0;
        for (int i=0; i<arrayList.length; i++){
            arrayListSum=arrayList[i];
        }
        arrayListAverage=arrayListSum/arrayList.length;
        System.out.println(arrayListAverage);
    }
}
