package example.example;

import java.util.HashMap;
import java.util.Map;

public class MapVK {
    public static <K, V> Map<V, K> swapKeysAndValues(Map<K, V> originalMap) {
        Map<V, K> swappedMap = new HashMap<V, K>();
        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            swappedMap.put(entry.getValue(), entry.getKey());
        }
        return swappedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("Pusha", 5);
        originalMap.put("Pelmesha", 15);
        originalMap.put("Fish", 13);

        Map<Integer, String> swappedMap = swapKeysAndValues(originalMap);

        System.out.println("Map<K,V>: " + originalMap);
        System.out.println("Map<V,K>: " + swappedMap);
    }

}
