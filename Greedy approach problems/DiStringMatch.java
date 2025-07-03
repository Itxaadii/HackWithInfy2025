import java.util.*;

public class DiStringMatch {

    public static int[] diStringMatch(String s) {
        int n = s.length();
        int low = 0, high = n;
        int[] result = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                result[i] = low++;
            } else {
                result[i] = high--;
            }
        }
        result[n] = low;  // or high, since low == high

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the pattern string (only 'I' and 'D'): ");
        String s = scanner.next();

        // Solve and print result
        int[] res = diStringMatch(s);
        System.out.println("Resulting permutation:");
        System.out.println(Arrays.toString(res));

        scanner.close();
    }
}

