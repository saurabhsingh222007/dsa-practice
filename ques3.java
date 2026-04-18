package dsaQuestions;

public class ques3 {

    public static void main(String args[]) {
        int count = 1;
        int n = 4;
        for (int line = 1; line <= n; line++) {
            for (int num = 1; num <= line; num++) {
                System.err.print(num);
                count++;
            }
            System.out.println();
        }
    }

}
