package com.company.dataStructures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Character> characterSet = new HashSet<>();
        characterSet.add('A');
        characterSet.add('C');
        for(char charater: characterSet){
            System.out.println(charater);
        }
        Iterator<Character> iterator = characterSet.iterator();
        while (iterator.hasNext()){
            Character character = characterSet.iterator().next();
            System.out.println(character);
        }
    }
}
