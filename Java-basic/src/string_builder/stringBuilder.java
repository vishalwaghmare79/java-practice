package string_builder;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
//        System.out.println(sb.charAt(0));

        // set chat at index 0
//        sb.setCharAt(0 , 'p');
//        System.out.println(sb);

        // insert char at bigning at string
//        sb.insert(2, 'n');
//        System.out.println(sb);

        // delete the extra 'nn'
//        sb.delete(2, 4);
//        System.out.println(sb);


        // append string end of string
        StringBuilder h = new StringBuilder("h");
        h.append("e");
        h.append("l");
        h.append("l");
        h.append("o");
        System.out.println(h.length());
    }
}
