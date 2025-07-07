import java.util.Scanner;
import java.util.Arrays;

public class CanJump {
    
    public boolean canJump(int[] nums) {
        int finalPosition = nums.length - 1;
        for (int idx = nums.length - 2; idx >= 0; idx--) {
            if (idx + nums[idx] >= finalPosition) {
                finalPosition = idx;
            }
        }
        return finalPosition == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CanJump obj = new CanJump();

        System.out.print("Enter the array elements separated by spaces: ");
        String[] input = scanner.nextLine().trim().split("\\s+");

        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        boolean result = obj.canJump(nums);

        System.out.println("Can reach the last index? " + result);

        scanner.close();
    }
}