import java.util.HashSet;
import java.util.Scanner;

public class HackerRankHashSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        String[] pair_left=new String[t];
        String[] pair_right=new String[t];
        for (int i=0; i<t;i++){
            pair_left[i]= sc.next();
            pair_right[i]=sc.next();
        }

        HashSet<String> hset=new HashSet(t);

        for (int i=0; i<t;i++){
           hset.add(pair_left[i]+ " "+pair_right[i]);
            System.out.println(hset.size());
        }
    }
}
