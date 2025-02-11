package BasicPart_1;

import java.util.*;
public class problem_144 {
    public static int removeElement(int[] nums, int elem) {
        int length = nums.length;
        if (length == 0) return 0;
        int i = 0;
        for (int j = 0; j < length; j++) {
            if (nums[j] != elem) {
                nums[i] = nums[j];
                i++;
            }
        }
        if (i < length) nums[i] = '\0';
        return i;
    }

    public static void main(String[] args) {
        int x = 6;
        int[] nums = {1, 4, 6, 7, 6, 2};
        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("The length of the new array is: " + removeElement(nums, x));
    }
}
