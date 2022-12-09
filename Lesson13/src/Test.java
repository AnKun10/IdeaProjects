import java.lang.reflect.Array;

public class Test {
    public int searchInsert(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while (leftPointer < rightPointer){
            if (nums[leftPointer] <= target){
                leftPointer++;
            } else {
                return leftPointer;
            }
            if (nums[rightPointer] > target){
                rightPointer--;
            } else if (nums[rightPointer] == target){
                return rightPointer;
            } else {
                return rightPointer+1;
            }
        }
        return rightPointer;
    }
}
