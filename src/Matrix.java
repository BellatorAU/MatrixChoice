import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

public class Matrix {

    private static Vector<Dimension> matrixList;
    private static int numberOfMatrix;

    class Dimension
    {
        private int n;
        private int m;

        Dimension(int n, int m)
        {
            this.n = n;
            this.m = m;
        }
    }

    Matrix(){}



    public static void main(String[] args) throws IOException {
        Matrix matrix = new Matrix();
        Matrix.matrixList = new Vector<>();
        Scanner sc = new Scanner(new File("input.txt"));
        Matrix.numberOfMatrix = sc.nextInt();
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            matrixList.add(matrix.new Dimension(n, m));
        }

        File f = new File("output.txt");
        PrintWriter pw = new PrintWriter(f);
        //pw.println(value);
        pw.close();
    }
}
