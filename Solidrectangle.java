package patternquestion;

public class Solidrectangle {

    public static void main(String args[]) {
        int n = 5;
        int m = 4;
        //outer loop for number of rows
        for (int i = 0; i < n; i++) {
            //inner loop for number of columns
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
