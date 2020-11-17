import java.util.Scanner;

public class ModulesixP4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // To input scanner
        System.out.println("Enter the matrix dimension: "); // Get user input for 2x2 or the dimension they want
        int n = input.nextInt();
        double A[][] = new double[n][n];
        System.out.println("Enter a, b, c, d:"); // To get user input for numbers corresponding with a,b,c,d
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = input.nextDouble();

        double d[][] = invert(A);

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(d[i][j] + "  ");
            }
            System.out.println();
        }
        input.close(); // To close scanner
        // You should handle the case where ther is no inverse
    }

    public static double[][] invert(double A[][]) // For converting to inverse matrix
    {
        int n = A.length; // Coding for answer to user input
        double x[][] = new double[n][n];
        double b[][] = new double[n][n];
        int index[] = new int[n];
        for (int i = 0; i < n; ++i)
            b[i][i] = 1;

        gaussian(A, index);

        for (int i = 0; i < n - 1; ++i)
            for (int j = i + 1; j < n; ++j)
                for (int k = 0; k < n; ++k)
                    b[index[j]][k] -= A[index[j]][i] * b[index[i]][k];

        for (int i = 0; i < n; ++i) {
            x[n - 1][i] = b[index[n - 1]][i] / A[index[n - 1]][n - 1];
            for (int j = n - 2; j >= 0; --j) {
                x[j][i] = b[index[j]][i];
                for (int k = j + 1; k < n; ++k) {
                    x[j][i] -= A[index[j]][k] * x[k][i];
                }
                x[j][i] /= A[index[j]][j];
            }
        }
        return x;
    }

    public static void gaussian(double A[][], int index[]) {
        int n = index.length;
        double c[] = new double[n];

        for (int i = 0; i < n; ++i)
            index[i] = i;

        for (int i = 0; i < n; ++i) {
            double c1 = 0;
            for (int j = 0; j < n; ++j) {
                double c0 = Math.abs(A[i][j]);
                if (c0 > c1)
                    c1 = c0;
            }
            c[i] = c1;
        }

        int k = 0;
        for (int j = 0; j < n - 1; ++j) {
            double pi1 = 0;
            for (int i = j; i < n; ++i) {
                double pi0 = Math.abs(A[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1) {
                    pi1 = pi0;
                    k = i;
                }
            }

            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i = j + 1; i < n; ++i) {
                double pj = A[index[i]][j] / A[index[j]][j];

                A[index[i]][j] = pj;

                for (int l = j + 1; l < n; ++l)
                    A[index[i]][l] -= pj * A[index[j]][l];
            }
        }
    }
}