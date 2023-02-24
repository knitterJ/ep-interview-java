//Return a two-dimensional array coming in the form of a table and containing numbers from 1 up to rows * columns. The size of the table will be specified by the given parameters.
// Numbers fill the table clockwise from the top-level corner in a spiral manner.
// For example, for parameter values (3, 4), the output array should be:
//
//  1  2  3  4
// 10 11 12  5
//  9  8  7  6


import java.util.Arrays;

public class PrintSpiral
{
    public static void main(String[] args)
    {
        // `M × N` matrix
        int M = 3;
        int N = 4;

        // an array of size `M×N`

        int[][] mat = printSpiralOrder(M, N);
        for (var r: mat) {
            System.out.println(Arrays.toString(r));
        }
    }


    private static int[][] printSpiralOrder(int M, int N)
    {


        // construct an `M × N` matrix
         int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
        int[][] mat = new int[M][N];

        int top = 0, bottom = M - 1;
        int left = 0, right = N - 1;

        int index = 0;

        while (true)
        {
            if (left > right) {
                break;
            }

            // print top row
            for (int i = left; i <= right; i++) {
                mat[top][i] = arr[index++];
            }
            top++;

            if (top > bottom) {
                break;
            }

            // print right column
            for (int i = top; i <= bottom; i++) {
                mat[i][right] = arr[index++];
            }
            right--;

            if (left > right) {
                break;
            }

            // print bottom row
            for (int i = right; i >= left; i--) {
                mat[bottom][i] = arr[index++];
            }
            bottom--;

            if (top > bottom) {
                break;
            }

            // print left column
            for (int i = bottom; i >= top; i--) {
                mat[i][left] = arr[index++];
            }
            left++;
        }
        return mat;
    }
}
