/**
 * Created by eugeny on 17.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println();
        int[] b = {7, 15, -2};
        for (int element : b) {
            System.out.print(element);
            System.out.print(" ");
        }
        System.out.println();

        double[][] x = new double[3][4];
        for (int i = 0; i < x.length; i++) {
            double[] row = x[i];
            for (int j = 0; j < row.length; j++) {
                double v = row[j];
                System.out.print(v);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
