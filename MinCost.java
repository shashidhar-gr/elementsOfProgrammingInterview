import java.util.Arrays;

public class MinCost {

    public static void main(String[] args) {
        //int[] A = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        //int[] A = {1, 1, 2, 2, 2, 3};
        //int[] A = {1, 1, 1, 2, 2, 3};
        int[] A ={0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.print(removeDuplicatesv2(A));
    }

    public static int removeDuplicatesv2(int[] nums) {
        int i = 1, j = 0, count = 1;

        while(i < nums.length) {
            if(nums[i] == nums[i-1]) {
                if((i-j) > 1 && count < 2) {
                    nums[j+1] = nums[i];
                }
                if(count < 2) {
                    j++;
                }
                count++;
            }
            else {
                if((i-j) > 1) {
                    nums[j+1] = nums[i];
                    j++;
                    count = 1;
                }
                else if((i-j) == 1) {
                    j++;
                    count = 1;
                }
            }
            i++;
        }
        print(nums);
        return j+1;
    }

    public static int removeDuplicates(int[] nums) {
        int i = 1, j = 0, count = 1;

        while(i < nums.length) {
            System.out.println("i: "+i+", j: "+j+", count: "+count);
            if(nums[i] != nums[i-1]) {
                if(count < 2) {
                    j++;
                }
                if((i-j) > 1) {
                    count = 1;
                    nums[j+1] = nums[i];
                    j++;
                }
                if(i-j == 1) {
                    count = 1;
                    j++;
                }
            }
            else {
                if(count < 2) {
                    j++;
                    count++;
                }
            }
            i++;
            
            print(nums);
        }

        print(nums);

        return j;
    }

    public static int nobleElementCountVariant01(int[] A) {
        Arrays.sort(A);

        int i = 0, j = A.length-1;
        while(i < j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }

        j = 0; i = 1;

        while(i < A.length) {
            
            if(A[i] == A[i-1]) {
                if(A[i] == j) {
                    return 1;
                }
            }
            else {
                j = i;
                if(A[i] == j) {
                    return 1;
                }
            }

            i++;
        }

        if(A[0] == 0) {
            return 1;
        }

        return -1;
    }

    public static int nobleElementCountVariant(int[] A) {
        Arrays.sort(A, 0, 0);
        int count = 0, lastOccurance = -1;

        for(int i = 1; i < A.length; i++) {
            if(A[i] != A[i-1]) {
                lastOccurance = i;
            }

            if(lastOccurance == A[i]) {
                count++;
            }
        }
        return count;
    }

    public static int nobleElementCount(int[] A) {
        Arrays.sort(A);
        int count = 0;

        for(int i = 0; i < A.length; i++) {
            if(A[i] == i) {
                count++;
            }
        }
        return count;
    }

    public static int minCost(int[] A) {
        
        Arrays.sort(A);

        int i = 0, j = A.length-1;
        while(i < j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }

        int sum = 0;
        for(int k = 0; k < A.length; k++) {
            sum = sum + (A[k] * (k+1));
            System.out.println(sum);
        }
        return sum;
    }

    public static void print(int[] A) {
        System.out.println("****************");
        for(int element: A) {
            System.out.print(element+" ");
        }
        System.out.println("");
    }
}
