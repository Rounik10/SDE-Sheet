package ArrayProblems1;

public class Q4_KadensAlgo {

    static int kadens(int[] arr) {
        int max = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            if (sum > max) {
                sum = max;
            }
        }

        return max;
    }

    public static void main(String[] args) {

    }

}
