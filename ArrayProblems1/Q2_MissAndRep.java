package ArrayProblems1;

public class Q2_MissAndRep {

    static void getRepAndMiss(int[] arr, int n) {
        int sum = n * (n + 1) / 2;
        int sqSum = n * (n + 1) * (2 * n + 1) / 6;

        int arrSum = 0, arrSqSum = 0;

        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
            arrSqSum += arr[i] * arr[i];
        }

        int c = sum - arrSum;
        int d = sqSum - arrSqSum;

        System.out.println(c);
        System.out.println(d);

        int x = (d + c * c) / 2 * c;
        int y = x - c;

        checkPrintRepMiss(arr, x, y);
    }

    static void checkPrintRepMiss(int[] arr, int x, int y) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                found = true;
        }
        if (!found)
            swap(x, y);
        System.out.println("Repeted: " + x);
        System.out.println("Missing: " + y);
    }

    static void swap(int x, int y) {
        x ^= y;
        y ^= x;
        x ^= y;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 3, 5 };
        getRepAndMiss(arr, arr.length);
    }
}