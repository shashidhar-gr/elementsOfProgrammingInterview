/*
 * 6.3
 * MULTIPLY TWO ARBITRARY-PRECISION INTEGERS
 * Write a program that takes two arrays representing integers, 
   and returns an integer representing their product.
    For example, since
    193707721 X -761838257287 = -147573952589676412927, 
    if the inputs are (1,9,3, 7,0,7,7, 2,1} and (-7,6,1,8,3,8, 2,5,7, 2,8,7), 
    your function should return (-1,4,7,5,7,3,9,5, 2,5,8,9,6,7,6, 4,1,2,9, 2,7).
 */
import java.util.*;

public class MultiplyTwoArbitraryPrecisionIntegers {
    public static void main(String[] args) {
        int[] aList = {1, 9, 3, 7, 0, 7, 7, 2, 1};
        int[] bList = {7, 6, 1, 8, 3, 8, 2, 5, 7, 2, 8, 7};
        //int[] aList = {-1, 4};
        //int[] bList = {1, 3};
        int[] finalList = getProduct(aList, bList);
        print(finalList);
    }
    static int[] getProduct(int[] alist, int[] blist) {
        int[] finalList = new int[alist.length+blist.length-1];
        
        int i = alist.length-1;
        int j = blist.length-1;
        int k = finalList.length-1, carry = 0, count = 0;

        while(i >= 0) {
            k = finalList.length-1 - count;
            j = blist.length-1;
            while(j >= 0) {
                System.out.println("i: "+i+", j: "+j+", k: "+k);
                int product = (alist[i] * blist[j]) + carry;
                int ans = (product) % 10 + finalList[k];
                finalList[k] = ans;
                System.out.println(ans);
                carry = product / 10;
                k--;
                j--;
            }
            i--;
            count++;
        }
        return finalList;
    } 

    static void print(int[] arr) {
        for(int element: arr) {
            System.out.print(element+" ");
        }
    }
}



