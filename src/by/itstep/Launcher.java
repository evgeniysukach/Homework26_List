package by.itstep;

import java.util.ArrayList;
import java.util.List;

public class Launcher {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list1.add((int) (Math.random() * 20));
            list2.add((int) (Math.random() * 20));
        }

        for (int i = 0; i <10 ; i++) {
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
        for (int i = 0; i <10 ; i++) {
            System.out.print(list2.get(i)+" ");
        }
        System.out.println();

        List<Integer> unitedList = new ArrayList<Integer>();
        unitedList.addAll(list1);
        unitedList.addAll(list2);

       /* for (int i = 0; i <unitedList.size() ; i++) {
            System.out.print(unitedList.get(i)+" ");
        }
        System.out.println();
        */

        ListNewMethods l= new ListNewMethods();
        l.printUniqueInFirstList(list1, list2);
        l.printCommonElements(list1,list2);
        l.printUniqueInBoth(list1, list2);







    }



}
