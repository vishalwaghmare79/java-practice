package string;

public class print_substrings {
    public static void main(String[] args) {
        String s = "abcd";

        for (int i= 0 ;i <= s.length(); i++){
            for (int j= i+1; j<= s.length(); j++){
                System.out.print(s.substring(i,j)+" ");  //  a ab abc abcd  b bc bcd  c cd  d
            }
        }
    }
}
