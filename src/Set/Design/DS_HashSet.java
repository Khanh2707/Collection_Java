package Set.Design;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class DS_HashSet {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (set.contains(n) == true) {
                return true;
            } else {
                set.add(n);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        //add remove size contain addAll removeAll retainAll
        Set<Integer> set = new java.util.HashSet<>();
        Random rand = new Random();

        set.add(3);
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(5);
        set.add(2);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
