import java.util.Scanner;

public class StringbuilderReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder name = new StringBuilder(str);
        for (int i=0;i<name.length();i++){
            if (name.charAt(i)=='e'){
                name.setCharAt(i,'i');
            }
        }
        System.out.println(name);
    }
}
