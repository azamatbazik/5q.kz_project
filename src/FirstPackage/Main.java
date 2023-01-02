package FirstPackage;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        AdditionalTasks additionalTasks = new AdditionalTasks();
        String stringValue = "codeleet";
        int[] arrayValue = new int[]{4,5,6,7,0,2,1,3};
        System.out.println(additionalTasks.restoreString(stringValue , arrayValue));
    }
}
