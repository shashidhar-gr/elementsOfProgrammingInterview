public class MaximumSumInArray {
        public static void main(String[] args) {
            int k = 3;
            int[] A = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};

            int sum = maxSum(A, k);

            System.out.println(sum);
        }

        static int maxSum(int[] A, int k) {
            int i = 0, j = 0;
            int sum = 0, maxSum = Integer.MIN_VALUE;
            
            while(i < k) {
                sum = sum + A[i];
                maxSum = Math.max(maxSum, sum);
                System.out.println(sum);
                i++;
            }

            i = 1; j = k;

            while(i < A.length-k) {
                sum = (sum + A[j]) - A[i-1];
                maxSum = Math.max(maxSum, sum);
                i++;
                j++;
                System.out.println(sum);
            }

            return maxSum; 
        }
}