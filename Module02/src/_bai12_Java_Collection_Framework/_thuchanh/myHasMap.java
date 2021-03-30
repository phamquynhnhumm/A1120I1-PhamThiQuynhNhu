package _bai12_Java_Collection_Framework._thuchanh;

import _11_map_bst.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class myHasMap {
    public static void main(String[] args) {
        Map<String,Integer> hasMap = new HashMap<>();
        hasMap.put("quynh nhu", 21);
        hasMap.put("huy tran", 20);
        hasMap.put("thanh thuy", 22);
        hasMap.put("oanh kieu", 23);
        hasMap.put("A", 23);
        hasMap.put("B", 23);
        System.out.println( "Danh sach  sinh vien la :"+hasMap);
        Map<String,Integer> treeMap = new TreeMap<>(hasMap); // treeMap sap xep thu tu
        System.out.println("Danh sach theo thu tu la:" + treeMap);
        Map<String, Integer>  linkedHashMap = new LinkedHashMap<>();
        ///+ myMap.get(key)); - hiển thị value của linkedHashMap
        linkedHashMap.put("hic", 40);
        linkedHashMap.put("huuh", 48);
        linkedHashMap.put("kahka",98);
        System.out.println("Key la:" + linkedHashMap.keySet()  );

    }

}
