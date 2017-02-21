import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

public class MatrixChoice {

    private static Vector<Matrix> matrixList;
    private static int numberOfMatrix;

    class Matrix
    {
        private int n;
        private int m;

        Matrix(int n, int m)
        {
            this.n = n;
            this.m = m;
        }

        Matrix() {}

        public int multiply(Matrix m1, Matrix m2)
        {
            return m1.n*m1.m*m2.m ;
        }

        
    }

    public static void main(String[] args) throws IOException {
        MatrixChoice main = new MatrixChoice();
        MatrixChoice.matrixList = new Vector<>();
        Scanner sc = new Scanner(new File("input.txt"));
        MatrixChoice.numberOfMatrix = sc.nextInt();
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            MatrixChoice.matrixList.add(main.new Matrix(n, m));
        }

        File f = new File("output.txt");
        PrintWriter pw = new PrintWriter(f);
        //pw.println(value);
        pw.close();
    }
}
