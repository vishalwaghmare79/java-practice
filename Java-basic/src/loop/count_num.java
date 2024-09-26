package loop;

import java.util.Scanner;

public class count_num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        int flage;
        do {

            System.out.println("enter the number");
            int num = sc.nextInt();

            if (num > 0){
                positive += num;
            } else if (num < 0){
                negative += num;
            } else {
                zeros += num;
            }

            System.out.println("do you want to countinews press 1");
            flage = sc.nextInt();
        } while (flage == 1);

        System.out.println("positive numbers count : " + positive);
        System.out.println("negative numbers count : " + negative);
        System.out.println("zeros numbers count : " + zeros);
    }
}
