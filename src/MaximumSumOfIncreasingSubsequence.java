
public class MaximumSumOfIncreasingSubsequence {
    public static int maxSum(int[] a, int n) {
        int[] sum = new int[n];

        for (int i = 0; i < n; i++) {
            sum[i] = a[i];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    sum[i] = Math.max(sum[i], sum[j] + a[i]);
                }
            }
        }

        int max = sum[0];
        for (int i = 1; i < n; i++) {
            if (sum[i] > max) {
                max = sum[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11};
        int n = a.length;

        System.out.println("Sum of maximum increasing subsequence is: " + maxSum(a, n));
    }
}
