import java.util.Scanner;
import java.util.Arrays;

public class march9_02 {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];       // first half
            ans[i + n] = nums[i];   // second half
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        march9_02 sol = new march9_02();  // use the correct class name
        int[] result = sol.getConcatenation(nums);

        System.out.println("Concatenated array: " + Arrays.toString(result));
        sc.close();
    }
}