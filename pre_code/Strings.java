import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //concatenation
        String Fname = "vishal";
        String Lname = "waghmare";

        String fullName = Fname + " " + Lname;
        System.out.println(fullName.length());

        for (int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
