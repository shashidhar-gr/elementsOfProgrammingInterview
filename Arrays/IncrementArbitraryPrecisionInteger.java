/*
 * 6.2 
 * INCREMENT AN ARBITRARY-PRECISION INTEGER
 * Write a program which takes as input an array of digits encoding a decimal number
    D and updates the array to represent the number D + 1. For example, if the input
    is (1,2,9) then you should update the array to (1,3,0). Your algorithm should work
    even if it isimplemented in a language that hasfinite-precision arithmetic.
 */
import java.util.*;

class IncrementArbitraryPrecisionInteger {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(0);
        list.add(8);
        list.add(8);
        list.add(9);

        List<Integer> finalList = addIntegers(list);

        System.out.println(finalList);
    }
    
    static List<Integer> addIntegers(List<Integer> list) {
        
        int i = list.size()-1;
        list.set(i, list.get(i)+1);
        
        while(i > 0 && list.get(i) == 10) {
            list.set(i, 0);
            list.set(i-1, list.get(i-1)+1);
            i--;
        }

        if(list.get(i) == 10) {
           list.add(0, 0);
           list.set(i+1, 0);
           list.set(0, 1);
        }
        
        return list;
    }

    static void printArray(int[] A) {
        for(int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
    }
}