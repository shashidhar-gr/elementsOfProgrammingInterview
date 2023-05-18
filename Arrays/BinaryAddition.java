/*
6.2 Variant
 * Write a program which takes as input two strings s and t of bits encoding
    binary numbers Bs and Bt, respectively, and returns a new string of bits representing
    the number Bs + Bt.
 */

public class BinaryAddition {
    public static void main(String[] args) {
        String str1 = "0101";
        String str2 = "1111";

        String str = addBinary(str1, str2);
        
        System.out.print(str);
    }

    static String addBinary(String str1, String str2) {
        String str = "";
        int i = str1.length()-1;
        int j = str2.length()-1;
        int carry = 0;

        while(i >= 0 && j >= 0) {
            int sum = carry + Character.getNumericValue(str1.charAt(i)) + Character.getNumericValue(str2.charAt(j));
            System.out.println("sum: "+sum);
            if(sum < 2){
                str = sum + str;
                carry = 0;
            }
            else if(sum > 2) {
                str = 1 + str;
                carry = 1;
            }
            else {
                str = 0 + str;
                System.out.println("str: "+str);
                carry = 1;
            }

            i--;
            j--;
        }

        while(i >= 0) {
            int sum = carry + Character.getNumericValue(str1.charAt(i));
            if(sum == 2) {
                carry = 1;
                sum = 0;
            }
            else {
                carry = 0;
            }
            str = sum + str;
            i--;
        }

        while(j >= 0) {
            int sum = carry + Character.getNumericValue(str2.charAt(j));
            if(sum == 2) {
                carry = 1;
                sum = 0;
            }
            else {
                carry = 0;
            }
            str = sum + str;
            j--;
            carry = 0;
        }

        if(carry != 0) {
            str = 1 + str;
        }

        return str;
    }

}
