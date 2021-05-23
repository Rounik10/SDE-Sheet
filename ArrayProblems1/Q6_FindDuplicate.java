package ArrayProblems1;

public class Q6_FindDuplicate {

    static int findDuplicate(int[] arr) {

        int s = 0, f = 0;

        do {
            s = arr[s];
            f = arr[arr[f]];
        } while (s != f);

        s = 0;
        while (s != f) {
            s = arr[s];
            f = arr[f];
        }

        return s;
    }
}
