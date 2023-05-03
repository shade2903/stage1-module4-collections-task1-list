package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> numbers = new LinkedList<>();

        for(Integer number : sourceList){
            if(number % 2 == 0 && number !=0){
                numbers.addLast(number);
            }else {
                numbers.addFirst(number);
            }
        }
        return numbers;
    }
}
