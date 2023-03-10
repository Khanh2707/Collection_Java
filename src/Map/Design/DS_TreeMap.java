package Map.Design;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DS_TreeMap {
    public static void main(String[] args) {
        // put remove
        Scanner sc = new Scanner(System.in);
        String s = "Trần Phúc Khánh";
        TreeMap<Character,Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int soLanXH = map.get(c);
                ++soLanXH;
                map.put(c,soLanXH);
            }
            else
                map.put(c,1);
        }
        char res1 = ' ', res2 = ' ';
        int soLanXH1 = 0;   int soLanXH2 = (int)1e9;
        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            if (entry.getValue() >= soLanXH1) {
                soLanXH1 = entry.getValue();
                res1 = entry.getKey();
            }
            if (entry.getValue() <= soLanXH2) {
                soLanXH2 = entry.getValue();
                res2 = entry.getKey();
            }
        }
        System.out.println(res1+ " " +soLanXH1);
        System.out.println(res2+ " " +soLanXH2);
        /*
        map.firstEntry();
        map.lastEntry();
        map.headMap(2);
        map.tailMap(3);
        map.lowerKey(1);
        map.floorKey(2);
        map.ceilingKey(3);
        map.higherKey(4);
        map.pollFirstEntry();
        map.pollLastEntry();
        map.lowerEntry(1);
        map.floorEntry(2);
        map.ceilingEntry(3);
        map.higherEntry(4);
        map.putAll(map);
        // ..................
         */
    }
}
