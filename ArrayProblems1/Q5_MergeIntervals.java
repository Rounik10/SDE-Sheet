package ArrayProblems1;

import java.util.ArrayList;
import java.util.Arrays;

public class Q5_MergeIntervals {

    static int[][] merge(int[][] intervals) {

        if (intervals.length == 0 || intervals == null) {
            return new int[0][];
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        ArrayList<int[]> ans = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(intervals[i][1], end);
            } else {
                ans.add(new int[] { start, end });
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        ans.add(new int[] { start, end });
        return ans.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] intervals = { { 8, 10 }, { 1, 3 }, { 2, 6 }, { 15, 18 } };
        int[][] ans = merge(intervals);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

}