package Array_list;

import java.util.ArrayList;
import java.util.Collections;

public class rev_arraylist {
        static void reverseList(ArrayList<Integer> list) {
            int front = 0;
            int back = list.size() - 1;

            while (front < back) {
                int temp = Integer.valueOf(list.get(front));
                list.set(front, list.get(back));
                list.set(back, temp);
                front++;
                back--;
            }

        }

        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(8);
            list.add(10);
            list.add(3);
            list.add(5);
            list.add(22);
            list.add(10);
            System.out.println("Original List " + list);
            Collections.reverse(list);
//            reverseList(list);
            System.out.println("Reverse List " + list);
            Collections.sort(list);
            System.out.println("Ascending order "+ list);
            Collections.sort(list, Collections.reverseOrder());
            System.out.println("Desc order " + list);

            ArrayList<String> li = new ArrayList<>();
            li.add("hello");
            li.add("wel");
            li.add("java");
            System.out.println("ori " + li);
            Collections.sort(li, Collections.reverseOrder());
            System.out.println("sorted " + li);
            for (String str: li) {
                System.out.println(str);
            }
    }
}
