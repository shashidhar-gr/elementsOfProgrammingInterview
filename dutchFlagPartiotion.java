/*
 * 6.1
 * THE DUTCH NATIONAL FLAG PROBLEM
 * Write a program that takes an array A and an index i into A, and rearranges the
    elementssuch that all elements less than A[i] (the "pivot") appear first, followed by
    elements equal to the pivot, followed by elements greater than the pivot.
 */
class DutchFlagPartiotion {
    public static void main(String[] args) {
        int[] A = {1, 0, 1, 0, 2, 0, 2, 1, 0};
        //int[] A = {1, 0, 1, 0};
        //int[] A = {0, 0, 0, 1};
        //int[] A = {1, 1, 1, 1, 1, 0};
        
        int pivot = 2;
        int j = A.length-1;
        int i = 0, k = 0;
        
        while(k <= j) {
            if(A[k] == pivot) {
                k++;
            }
            else if(A[k] < pivot) {
                int temp = A[k];
                A[k] = A[i];
                A[i] = temp;
                i++;
                k++;
            }
            else {
                int temp = A[k];
                A[k] = A[j];
                A[j] = temp;
                j--;
            }
        }
        
        printarray(A);
    }
    
    static void printarray(int[] A) {
        for(int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
    }
}