package Map.Design;

import java.util.ArrayList;

public class MyHashMap {
    public class Data {
        int key;
        int value;
        Data (int key, int value) {
            this.key = key;
            this.value = value;
        }

        public boolean equals(Object other) {
            if (other instanceof Data)
                return this.key == ((Data)other).key;
            return false;
        }
    }

    private final int SIZE = 1000;
    private ArrayList<Data> buckets[];

    public MyHashMap() {
        buckets = new ArrayList[SIZE];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    public int hashFunction(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int hashValueIndex = hashFunction(key);
        var bucket = buckets[hashValueIndex];
        Data newData = new Data(key,value);
        int keyIndex = bucket.indexOf(newData);

        if (keyIndex >= 0) {
            bucket.get(keyIndex).value = value;
        }
        else {
            bucket.add(newData);
        }
    }

    public void remove(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = buckets[hashValueIndex];
        Data deleteData = new Data(key,0);
        bucket.remove(deleteData);
    }

    public int get(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = buckets[hashValueIndex];
        Data findData = new Data(key,0);
        int keyIndex = bucket.indexOf(findData);
        if (keyIndex >= 0) {
            return bucket.get(keyIndex).value;
        }
        return -1;
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1,1);
        map.put(5001,2);
        System.out.println(map.get(5001));
        map.remove(5001);
    }
}
