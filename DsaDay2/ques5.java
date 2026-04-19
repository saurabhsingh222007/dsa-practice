package dsaQuestions.DsaDay2;

public class ques5 {
    public static void main(String arg[]) {
        int n = 5;
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }

}
