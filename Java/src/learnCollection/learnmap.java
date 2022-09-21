package learnCollection;

import java.util.HashMap;
import java.util.Map;

public class learnmap {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Windows", "2000");
        hashMap.put("Windows", "XP"); // k thể trùng key, lấy valua cuối
        hashMap.put("Languege1", "java");
        hashMap.put("Language2", "2000");
        System.out.println("Các phần tử của Map ");
        System.out.println("\t"+hashMap);

        // lấy gtri trong Map k cần for
        //dùng get(Key) để lấy gtri
        hashMap.get("Language2");
    }
}
