/*
 * 6.4
    ADVANCING THROUGH AN ARRAY
    Write a program to compute the minimum number of steps needed to advance to the last location.
 */
public class AdvancingThroughAnArrayVariant {
    public static void main(String[] args) {
        int[] A = {3, 3, 1, 0, 2, 0, 1};
        int[] B = {3, 2, 0, 0, 2, 0, 1};
        int[] C = {2, 4, 1, 1, 0, 2, 3};
        int[] D = {3, 3, 1, 0, 2, 0, 1};
        System.out.println(minSteps(B));
    }

    public static int minSteps(int[] arr) {
        int count = 0;
        int steps = -1;

        for(int i = arr.length-1; i >= 0; i--) {
            if(arr[i] >= count) {
                count = 0;
                steps++;
            }
            count++;
        }

        if(arr[0] >= count)
            return steps;

        return -1;
    }
}
