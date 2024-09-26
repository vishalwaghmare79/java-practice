package fuction_method;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class vote_18 {

    public static String voteEligible(int n){
        String vote = n > 18 ? "person eligible for vote" : "person not eligible for vote";
        return vote;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your age");
        int age = sc.nextInt();

        String val = voteEligible(age);
        System.out.println(val);
    }
}
