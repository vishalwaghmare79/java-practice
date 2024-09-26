import java.util.Scanner;

public class no_cal_pnz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input;
        int positive = 0;
        int negative = 0;
        int zeros = 0;

        do {
            System.out.println("Entre any numbers");
            int num = sc.nextInt();
            if (num > 0){
                positive++;
            } else if (num < 0) {
                negative++;
            } else if (num == 0) {
                zeros++;
            }
            System.out.println("you want to be continues press 1 : you want to close press 0");
            input = sc.nextInt();

        }while (input == 1);

        System.out.println("total positive no :"+positive+"\ntotal Negative no : "+negative+"\ntotal zeros : "+zeros);
    }
}


