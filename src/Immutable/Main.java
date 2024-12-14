package Immutable;


import Immutable.HW51_52.CustomMutableClass;
import Immutable.HW51_52.ImmutableClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CustomMutableClass mc = new CustomMutableClass(5);

        List<Integer> numberList = new ArrayList<>();

        numberList.add(3);
        numberList.add(13);

        ImmutableClass object1 = new ImmutableClass("book", numberList, mc);
        System.out.println(object1);

        mc.setValue(9);
        System.out.println(object1);

        Map<ImmutableClass, String> map = new HashMap<>();
        map.put(object1, "Harry Potter");

        System.out.println(map.containsKey(object1));

        numberList.removeFirst();
        System.out.println(map.containsKey(object1));

        numberList.add(78);
        System.out.println(map.containsKey(object1));
        System.out.println(numberList);

        System.out.println(map);

        object1.getValue().setValue(11);
        System.out.println(object1);
        System.out.println(map.containsKey(object1));

        //object1.getNumbers().add(5);
    }
}
