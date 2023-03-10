package Map.Design;

import java.util.HashMap;
import java.util.Map;

public class DS_HashMap {
    static void search(String s) {
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int soLanXH = map.get(s.charAt(i));
                ++soLanXH;
                map.put(s.charAt(i), soLanXH);
            }
            else {
                map.put(s.charAt(i),1);
            }
        }

        for (Map.Entry e : map.entrySet()) {
            System.out.println(e.getKey() + " xuất hiện " + e.getValue());
        }
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,1,2,2,4,4,2};
        // put get size isEmpty remove replace
        Map<String,String> map = new HashMap<>();
        map.put("USA","Biden");
        map.put("Russia","Putin");
        map.put("China","Tập Cận Bình");
        map.put("Việt Nam","Nguyễn Phú Trọng");
        map.put("Việt Nam","Nguyễn Xuân Phúc");
        map.put("Việt Nam","Phạm Minh Chính");
        System.out.println(map.keySet());
        System.out.println(map.values());
        search("Trần Phúc Khánh");
    }
}
