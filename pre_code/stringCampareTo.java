public class stringCampareTo {
    public static void main(String[] args) {
        String name1 = "vishal";
        String name2 = "vishal";

        if (name1.compareTo(name2)==0){
            System.out.println("sting are eqval");
        } else if (name1.compareTo(name2) > name2.compareTo(name1)){
            System.out.println("string 1 is larg than string string 2");
        }else {
            System.out.println("string1 is small than string2");
        }
    }
}
