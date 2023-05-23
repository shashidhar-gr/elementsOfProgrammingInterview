public class MaximumSumInArray {
        public static void main(String[] args) {
            int k = 3;
            int[] A = {4, 2, 2, 7, 8, 1, 2, 8, 1, 0};

            int sum = maxSumUsingFixedSlidingWindow(A, k);
            int res[] = maxSumUsingDynamicSlidingWindow(A, 8);
            System.out.println("sum: "+sum);
            System.out.println("minimumindexcount: ");
            System.out.println("res 0: "+res[0]);
            System.out.println("res 1: "+res[1]);
        }

        static int[] maxSumUsingDynamicSlidingWindow(int[] A, int target) {
            int left = 0, right = 0, minimumIndexCount = Integer.MAX_VALUE, sum = 0, maxSum = Integer.MIN_VALUE;
            int[] res = new int[2];

            while(left < A.length && right < A.length) {
                
                if(left == right) {
                    sum = A[left];
                }
                else if(left > 0){
                    sum = (sum + A[right]) - A[left];
                }
                else {
                    sum = sum + A[right];
                }

                System.out.println("left: "+left+", right: "+right+", sum: "+sum);

                if(sum == target) {
                    if((right - left+1) < minimumIndexCount) {
                        minimumIndexCount = right - left+1;
                        res = new int[2];
                        res[0] = right;
                        res[1] = left;
                    }
                    left++;
                }
                else if(sum > target) {
                    left++;
                }
                else {
                    right++;
                }
            }

            return res;
        }

        static int maxSumUsingFixedSlidingWindow(int[] A, int k) {
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