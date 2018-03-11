package by.itstep;

import java.util.List;

public class ListNewMethods {

    //Метод показывает только те элементы которы есть в первом но нет во втором
    public  void printUniqueInFirstList(List list1, List list2){
        for (int i = 0; i <list1.size() ; i++) {
            if (!(list2.contains(list1.get(i))))
                System.out.print(list1.get(i)+"\t");


        }
        System.out.println();
    }

    //Метод показывает только те элементы которые есть и там и там
    public void printCommonElements(List list1, List list2){
        for (int i = 0; i <list1.size() ; i++) {
            if (list2.contains(list1.get(i)))
                System.out.print(list1.get(i)+"\t");


        }
        System.out.println();
    }

    //метод показывает элементы, которые есть в одном и во втором, но не одновременно в обоих
    public  void printUniqueInBoth(List list1, List list2){
        for (int i = 0; i <list1.size() ; i++) {
            if (!(list2.contains(list1.get(i))))
                System.out.print(list1.get(i)+"\t");
            if (!(list1.contains(list2.get(i))))
                System.out.print(list2.get(i)+"\t");



        }
        System.out.println();
    }




}
