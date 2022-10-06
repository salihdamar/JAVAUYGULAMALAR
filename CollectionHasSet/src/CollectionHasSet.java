import java.util.HashSet;
import java.util.Iterator;

public class CollectionHasSet {
    public static void main(String[] args) {
        HashSet<Integer> hSet=new HashSet<>();
        hSet.add(20);
        hSet.add(30);
        hSet.add(90);
        hSet.add(67);
        hSet.add(null);

        System.out.println(hSet.size());
        System.out.println("----------------");
        hSet.remove(67);
        System.out.println(hSet.contains(67));
        System.out.println("-----foreach-----");
        for (Integer i:hSet) {
            System.out.println(i);
        }

        System.out.println("----Iterator----");
        Iterator<Integer> itr=hSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
