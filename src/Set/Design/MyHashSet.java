package Set.Design;

import java.util.ArrayList;

public class MyHashSet {
    private final int SIZE = 1000;
    private ArrayList<Integer> buckets[];

    public MyHashSet() {
        buckets = new ArrayList[SIZE];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    public int hashFunction(int key) {
        return key % SIZE;
    }

    public void add(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = buckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);

        if (keyIndex < 0) {
            bucket.add(key);
        }
        System.out.println(bucket);
        System.out.println(buckets[hashValueIndex]);
    }

    public void remove(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = buckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);

        if (keyIndex >= 0) {
            bucket.remove(keyIndex);
        }
    }

    public boolean contains(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = buckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        return keyIndex >= 0;
    }

    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();
        set.add(2);
        set.add(10001);
        set.add(1);

        System.out.println(set.contains(1));
        set.remove(1);
        System.out.println(set.contains(1));

    }
}
