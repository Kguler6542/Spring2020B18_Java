package day53_Iterator_Maps;

import java.util.ArrayList;
import java.util.Arrays;

public class Iterating_Collection {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));

        for(int i=0; i < list.size(); i++){
            if( list.get(i) < 4){
                list.remove(i);
            }
        }

        System.out.println(list);

        System.out.println("=========================================");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));
        list2.removeIf( p -> p < 4  ); //uses the iterator interface internally
        System.out.println(list2);

        System.out.println("=================================");

    }

}