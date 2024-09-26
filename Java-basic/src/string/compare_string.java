package string;

public class compare_string {
    public static void main(String[] args) {
        String name1 = "vishal";
        String name2 = "vishal";

//        if(name1.compareTo(name2) == 0) {
//            System.out.println("Strings are eqval");
//        } else {
//            System.out.println("Strings are not equal");
//        }
//        if(name1 == name2) {
//            System.out.println("Strings are eqval");
//        } else {
//            System.out.println("Strings are not equal");
//        }

        if (new String("Tony") == new String("tony")){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
