package FirstPackage;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        AdditionalTasks additionalTasks = new AdditionalTasks();
        int[] array = new int[]{1,4,2,5,3};
        System.out.println(additionalTasks.sumOddLengthSubarrays(array));
    }
}
