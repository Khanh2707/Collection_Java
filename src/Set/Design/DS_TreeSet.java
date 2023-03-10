package Set.Design;

import java.util.*;
import java.util.TreeSet;

public class DS_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ts.add(sc.nextInt());
        }
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.higher(5));
        System.out.println(ts.lower(5));
        System.out.println(ts.ceiling(5));
        System.out.println(ts.floor(5));
        ts.pollFirst();
        ts.pollLast();
        System.out.println(ts);
        System.out.println(ts.headSet(5));
        System.out.println(ts.tailSet(5));
    }
}
