public class DiziHarmonikOrtalamasi {
    public static void main(String[] args) {
        /**ödev: Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
         *
         * Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
         *  1 + (1/2) + (1/3) +  (1/4) +  (1/5) + ....... +  (1/n)
         * */

        double[] list={34,55,67,200,44,55,84};
        double listHarmonicAverage=0.0, listHarmonicSum=0.0;
        for (int i=0; i<list.length; i++){
                listHarmonicSum+=1/list[i];
        }

        listHarmonicAverage=list.length/listHarmonicSum;
        System.out.println(listHarmonicAverage);
    }
}
