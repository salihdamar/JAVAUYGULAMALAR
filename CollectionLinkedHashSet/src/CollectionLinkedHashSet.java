import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lSet=new LinkedHashSet<>();
        lSet.add(10);
        lSet.add(20);
        lSet.add(30);
        lSet.add(20);
        lSet.add(30);

        Iterator<Integer> itr= lSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
