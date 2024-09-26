package Recursion;

public class remove_string {
    static String removeCh(String str,int idx) {

        if (idx == str.length()) return "";
        String sans = removeCh(str, idx + 1);
        char curr = str.charAt(idx);
        if (curr != 's') {
            return curr + sans;
        } else {
            return sans;
        }
    }
    public static void main(String[] args) {
        String name = "vishal";
        System.out.println(removeCh(name,0));
    }
}
