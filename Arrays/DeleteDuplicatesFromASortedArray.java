/*
    6.5
    DELETE DUPLICATES FROM A SORTED ARRAY
    
 * This problem is concerned with deleting repeated elements from a sorted array.
    For example, for the array (2,3,5,5,7,11,11,11,13), then after deletion, the array is
    (2,3,5,7,11,13,0,0,0). After deleting repeated elements, there are 6 valid entries.
    There are no requirements as to the values stored beyond the last valid element.

    Write a program which takes asinput a sorted array and updatesitso that all dupli¬
    cates have been removed and the remaining elements have been shifted left to fill the
    emptied indices. Return the number of valid elements. Many languages have library
    functionsfor performing this operation—you cannot use these functions.
 */
public class DeleteDuplicatesFromASortedArray {
    public static void main(String[] args) {
        int[] A = {2, 3, 5, 7, 7, 11, 11, 11, 13};
        int res = removeDuplicates(A);
        System.out.println(res);
    }

    public static int removeDuplicates(int[] A) {
        int lastUniquePosition = 0, i = 0;

        while(i < A.length-1) {
            if(A[i] != A[i+1]) {
                if(i != lastUniquePosition) {
                    A[lastUniquePosition+1] = A[i+1];
                }
                lastUniquePosition++;
            }
            print(A);
            i++;
        }

        return lastUniquePosition+1;
    }

    public static void print(int[] A) {
        System.out.println("********");
        for(int i = 0; i < A.length; i++) {
            System.out.print(A[i]+ " ");
        }
    }
}
