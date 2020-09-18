package com.horcrux.hufflepuff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Uniquename {
    public static String firstUniqueName(String[] names) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");

        List<String> list = Arrays.asList(names);

        List<String> list1 = new ArrayList<String>();

        list1 = list.stream().filter(i -> Collections.frequency(list, i) == 1).collect(Collectors.toList());

        return list1.size() == 0 ? null : list1.get(0);
    }
}
