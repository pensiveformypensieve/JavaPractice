package com.horcrux.hufflepuff;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {

        List<String> mergedList = new ArrayList<String>();

        for(int i = 0; i<names1.length; i++) {
            mergedList.add(names1[i]);
        }

        for(int i = 0; i<names2.length; i++) {
            mergedList.add(names2[i]);
        }

        Set<String> set = new HashSet<>(mergedList);
        mergedList.clear();
        mergedList.addAll(set);

        String[] names = new String[set.size()];
        set.toArray(names);

        return names;

//        throw new UnsupportedOperationException("Waiting to be implemented.");
    }
}
