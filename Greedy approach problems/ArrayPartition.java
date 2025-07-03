import java.util.*;

public class ArrayPartition{

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);  // Sort the array
        int sum = 0;

        // Add every alternate element (the smaller one in each pair)
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of pairs
        System.out.print("Enter number of pairs (n): ");
        int n = sc.nextInt();
        int[] nums = new int[2 * n];

        // Input: 2n integers
        System.out.println("Enter " + (2 * n) + " integers:");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        // Output: max sum of min in pairs
        int result = arrayPairSum(nums);
        System.out.println("Maximum sum of minimums in pairs: " + result);

        sc.close();
    }
}
