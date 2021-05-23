package ArrayProblems1;

public class Q3_MergeArr {

    static void mergeArr(long A[], long B[], int n, int m) {
        int gap = getNextGap(n + m);

        while (gap > 0) {
            int i = 0, j = gap;
            while (j < n + m) {
                if (getVal(A, B, i) > getVal(A, B, j)) {
                    swapVal(A, B, i, j);
                }
                i++;
                j++;
            }
            gap = getNextGap(gap);
        }
    }

    static int getNextGap(int gap) {
        return gap <= 1 ? 0 : gap / 2 + gap % 2;
    }

    static long getVal(long[] A, long[] B, int ind) {
        int n = A.length;
        return ind < n ? A[ind] : B[ind - n];
    }

    static void swapVal(long[] A, long[] B, int i, int j) {
        int n = A.length;
        if (i < n && j < n) {
            swap(A, i, j);
        } else if (i < n && j >= n) {
            A[i] ^= B[j - n];
            B[j - n] ^= A[i];
            A[i] ^= B[j - n];
        } else {
            swap(B, i - n, j - n);
        }
    }

    static void swap(long[] A, int i, int j) {
        A[i] ^= A[j];
        A[j] ^= A[i];
        A[i] ^= A[j];
    }

    public static void main(String[] args) {
        long[] A = { 2, 5, 6, 20 };
        long[] B = { 1, 3, 6 };
        mergeArr(A, B, A.length, B.length);
        printArr(A);
        printArr(B);
    }

    static void printArr(long[] A) {
        for (long val : A) {
            System.out.print(val + " ");
        }
    }

}