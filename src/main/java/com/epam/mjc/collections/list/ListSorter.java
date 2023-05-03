package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    ListComparator comparator = new ListComparator();

    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, comparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        int funA = function(aInt);
        int funB = function(bInt);
        if (funA > funB) {
            return 1;
        }
        if (funA < funB) {
            return -1;
        }
        if (funA == funB) {
            return aInt - bInt;
        }
        return 0;
    }

    Integer function(int x) {
        return 5 * x * x + 3;
    }
}
