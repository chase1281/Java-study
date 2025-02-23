package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productARr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        Map<String, Integer> productMap = new HashMap<>();
        for (String[] product : productARr) {
            productMap.put(product[0], Integer.valueOf(product[1]));
        }

        Set<Map.Entry<String, Integer>> entries = productMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("제품: " + entry.getKey() + ", 가격: " + entry.getValue());
        }
    }
}
