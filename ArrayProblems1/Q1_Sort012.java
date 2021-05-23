package ArrayProblems1;

public class Q1_Sort012 {

    static void flagSort(int[] arr) {
        int s = 0, mid = 0, e = arr.length - 1;

        while (mid < e) {
            if (arr[mid] == 2) {
                swap(arr, e--, mid);
            } else if (arr[mid] == 0) {
                swap(arr, s++, mid++);
            } else {
                mid++;
            }
        }
    }

    static void countSort(int[] arr) {
        int z = 0, o = 0, t = 0;
        for (int val : arr) {
            if (val == 0)
                z++;
            else if (val == 1)
                o++;
            else
                t++;
        }
        int it = 0;
        while (z-- > 0)
            arr[it++] = 0;
        while (o-- > 0)
            arr[it++] = 1;
        while (t-- > 0)
            arr[it++] = 2;
    }

    static void swap(int[] arr, int i, int j) {
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 2, 1, 2, 0 };
        countSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}