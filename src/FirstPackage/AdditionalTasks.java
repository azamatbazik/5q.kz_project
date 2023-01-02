package FirstPackage;

import java.io.IOException;
import java.util.Arrays;

public class AdditionalTasks implements Test {
    public String restoreString(String s, int[] indices) {
        String result = null;
        char[] copyResult = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            copyResult[indices[i]] = s.charAt(i);
        }
        result = String.valueOf(copyResult);
        return result;
    }

    public boolean isPalindrome(int x) {
        String copy = String.valueOf(x);
        char[] value = copy.toCharArray();
        char[] copyValue = new char[value.length];
        String palindromeValue;
        boolean TRUE;
        int j = 0;
        for (int i = value.length; i > 0; i--, j++) {
            copyValue[j] = value[i - 1];
        }
        palindromeValue = String.valueOf(copyValue);
        if (copy.equals(palindromeValue)) {
            TRUE = true;
        } else {
            TRUE = false;
        }
        return TRUE;
    }

    public int numberOfSteps(int num) {
        int result = 0;
        int copyNum = num;
        while (copyNum != 0) {
            if (copyNum % 2 == 0) {
                copyNum = copyNum / 2;
                result++;
            } else {
                copyNum--;
                result++;
            }
        }
        return result;
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean result = false;
        String copyWord1 = null;
        String copyWord2 = null;
        for (int i = 0; i < word1.length; i++) {
            copyWord1 += word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            copyWord2 += word2[i];
        }
        if(copyWord1.equals(copyWord2)){
            result = true;
        }
        return result;
    }public int sumOddLengthSubarrays(int[] arr) {
        int result = 0;
        int arrayLength = arr.length;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i; j < arrayLength; j+=2) {
                for (int k = i; k <= j; k++) {
                    result += arr[k];
                }
            }
        }
        return result;
    }


    @Override
    public Object bufferedReader() throws IOException {
        return null;
    }

    @Override
    public String showMathResult() throws IOException {
        return null;
    }

    @Override
    public void oddNumber() throws IOException {

    }

    @Override
    public void replaceObject() throws IOException {

    }

    @Override
    public float bigValue() throws IOException {
        return 0;
    }

    @Override
    public String positiveOrNegative() throws IOException {
        return null;
    }

    @Override
    public String replaceValue() throws IOException {
        return null;
    }

    @Override
    public Float sumValueArray() throws IOException {
        return null;
    }

    @Override
    public Object secondBigValue() throws IOException {
        return null;
    }

    @Override
    public String restoreString() {
        return null;
    }
}
