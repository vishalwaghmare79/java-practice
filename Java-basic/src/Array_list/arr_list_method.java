package Array_list;

import java.util.ArrayList;

public class arr_list_method {
    public static void main(String[] args) {

//    wrapper classes
    /*Integer l = Integer.valueOf(4);
    System.out.println(l);*/

    ArrayList<Integer> list1 = new ArrayList<>();

//    add new element
    list1.add(5);
    list1.add(8);
    list1.add(3);
    list1.add(4);


//    get an element at index i
        System.out.println(list1.get(1));

//        print with for loop
     /*   for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i)); // 8
        }*/

//        print the array list directly
        System.out.println(list1); // [5, 8, 3, 4]

//        adding element at index i
        list1.add(1, 9);
        System.out.println(list1); // 5, 9, 8, 3, 4

//        remove an element at index i
        list1.remove(1);
        System.out.println(list1); // 5, 8, 3, 4

//        removing an element e
        list1.remove(Integer.valueOf(5));
        System.out.println(list1); // 8, 3, 4

//        if don't specify class , and put anything inside l
        ArrayList l = new ArrayList();
        l.add("dfdbjf");
        l.add(2);
        l.add(true);
        System.out.println(l);
    }
}
