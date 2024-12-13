package Map.HW47_48.Inversion;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Character> map = new HashMap<>();
        map.put(1, 'C');
        map.put(2, 'B');
        map.put(3, 'A');

        System.out.println(map);

        System.out.println("Инверсия ключей и значений: " + changeKeysAndValues(map));
    }

    /**
     * Создаёт новую мапу, где ключами становятся значения исходной мапы, а значениями — ключи
     * @param map Map с ключом типа Integer, значением типа Character
     * @return Новая мапа с инверсией ключей и значений
     */
    public static Map<Character, Integer> changeKeysAndValues(Map<Integer, Character> map) {
        Map<Character, Integer> map1 = new LinkedHashMap<>();
        for (Integer key : map.keySet()) {
            map1.put(map.get(key), key);
        }
        return map1;
    }
}
