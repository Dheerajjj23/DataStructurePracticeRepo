package CollectionsInJava.HashMap;

import java.util.LinkedHashMap;

public class map {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("India", "IND");
        map.put("United States of America", "USA");
        map.put("Pakistan", "PAK");
        map.put("United Kingdom", "UK");
        System.out.println(map);
    }
}
