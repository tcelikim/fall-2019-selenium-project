package officeHours;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class March10 {
    public static void main(String[] args) {
        /*
        under List Interface:
        - ArrayList (Indexes, faster to read, slower when we do manipulations (remove or add elements)
        - Vector (same as ArryList, but thread safe)
             - Stack (Last in First out (like a stack of paper )
        - LinkedList (node (each element reference to previous and next element in the list)
        (performance -sensitive, memory allocation
         */
        /*
        Set Interface : contain onlyy uniqe values
        HashSet : no indexes - faster because it is using hashing( it doesn't keep an order), allows 1 null
        TreeSet:  sorted set -no nulls
        LinkedHashSet: keeps the order
       */


        HashSet <String> hashSet = new HashSet<>();
        TreeSet <String> treeSet = new TreeSet<>();
        LinkedHashSet <String> linkedHashSet = new LinkedHashSet<>();
        for (String each : Arrays.asList("Value5", "Value1", "Value3")){
            hashSet.add(each);
            treeSet.add(each);
            linkedHashSet.add(each);
        }
        System.out.println("hashset: " + hashSet);
        System.out.println("treeset: " + treeSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);




    }
}
