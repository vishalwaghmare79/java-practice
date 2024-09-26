package bit_manipulation;

public class setBit {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 1; // position 1
        int bitMask = 1<< pos;
        // 1<<1
        // 0001<<1
        // 0010 bit mask
        // 0101 actual no
        // ```````````
        // 0111

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
