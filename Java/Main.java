import generics.Box;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Box<String> box = new Box<>();

        System.out.println(box.append("first name", "last_name"));

        genericMethod("thing 1", "thing 2");

        Set<Integer> s = new HashSet<Integer>(){{
            add(1); add(2); add(3); add(4); add(5);
        }};

        System.out.println(convert(s));
        System.out.println(convertListToString(convert(s)));
        System.out.println(sumNumbersInList(convert(s)));
        System.out.println(sumStringLength(new ArrayList<>(){{
            add("from"); add("generic"); add("method"); add("am"); add("!");
        }}));
    }

    // use wildcard ? when you do not know exactly what the generic type will be

    private static <T, V> void genericMethod(T val, V otherVal){
        System.out.println(val + " - I am from a generic method");
        System.out.println(otherVal + " - I am from a generic method");
    }

    private static List<Integer> convert(Set<Integer> myIntegerSet){
        return new ArrayList<>(myIntegerSet);
    }

    private static String convertListToString(List<Integer> myList){
        return myList.stream().map(String::valueOf).collect(Collectors.joining(" - ", "[ ", " ]"));
    }

    private static Integer sumNumbersInList(List<Integer> myList){
        return myList.stream().filter(x -> x%2==0).reduce(0, (accumulator, elem) -> accumulator + elem);
//        return myList.stream().reduce(0, Integer::sum);
    }

    private static Integer sumStringLength(List<String> myList){
       return myList.stream().map(String::length).reduce(0, Integer::sum);
    }

}