package FirstPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        AdditionalTasks additionalTasks = new AdditionalTasks();
        int[] array = new int[]{-5, -1,-2,-4};
        System.out.println(additionalTasks.secondBigValue(array));
    }
}
