package us.deans.javastudy.operations.core10;

import java.util.HashMap;
import java.util.Map;

import us.deans.javastudy.base.BaseOperation;

public class OpHashMap extends BaseOperation {

    public void start() {

        Map<String, Integer> hmap = new HashMap<>();

        // Adding key-value pairs to a HashMap
        hmap.put("One", 1);
        hmap.put("Two", 2);
        hmap.put("Three", 3);

        // Add a new key-value pair only if the key does not exit in the HasMap, or is mapped to null
        hmap.putIfAbsent("Four", 4);

        System.out.println(hmap);

    }


}
