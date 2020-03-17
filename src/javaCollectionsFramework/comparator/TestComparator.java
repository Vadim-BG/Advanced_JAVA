package javaCollectionsFramework.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
//        List<String> animals = new ArrayList<>();
//
//        animals.add("asdfg");
//        animals.add("dog");
//        animals.add("cat");
//        animals.add("frog");
//        animals.add("ab");
//        animals.add("bird");
//        animals.add("a");
//
//        Collections.sort(animals, new StringLengthComparator());
//
//        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);

        Collections.sort(numbers, (o1, o2) -> {
            if(o1 > o2){
                return -1;
            }else if (o1< o2){
                return 1;
            }else {
                return 0;
            }
        });

        System.out.println(numbers);
    }
}



//class StringLengthComparator implements Comparator<String> {
//
//    @Override
//    public int compare(String o1, String o2) {
//        if(o1.length() > o2.length()){
//            return 1;
//        }else if (o1.length()< o2.length()){
//            return -1;
//        }else {
//            return 0;
//        }
//    }
//}

//class BackwardsIntegerComparator implements Comparator<Integer>{
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        if(o1 > o2){
//            return -1;
//        }else if (o1< o2){
//            return 1;
//        }else {
//            return 0;
//        }
//    }
//}
