package FirstPackage;

import java.io.File;
import java.io.IOException;
import java.util.*;

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
        if (copyWord1.equals(copyWord2)) {
            result = true;
        }
        return result;
    }

    public int sumOddLengthSubArrays(int[] arr) {
        int result = 0;
        int arrayLength = arr.length;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i; j < arrayLength; j += 2) {
                for (int k = i; k <= j; k++) {
                    result += arr[k];
                }
            }
        }
        return result;
    }

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    /*public int maxIceCream(int[] costs, int coins) {

    }*/

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int addIndex = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                nums[i] = nums[i + 1];
                addIndex++;
            }
        }
        return addIndex;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length + nums2.length];
        for (int i = 0, j = 0, k = 0; i < arr.length; i++) {
            if (j == nums1.length)
                for (; i < arr.length; i++)
                    arr[i] = nums2[k++];
            else if (k == nums2.length)
                for (; i < arr.length; i++)
                    arr[i] = nums1[j++];
            else {
                arr[i] = nums1[j] > nums2[k] ? nums2[k++] : nums1[j++];
            }
        }
        int i = arr.length / 2;

        return arr.length % 2 == 0 ? (double) (arr[i] + arr[i - 1]) / 2 : (double) arr[i];

    }

    public int reverse(int x) {
        int copyValue = x;
        double reverse = 0;
        while (copyValue != 0) {
            int remainder = copyValue % 10;
            reverse = reverse * 10 + remainder;
            copyValue = copyValue / 10;
        }
        if (reverse > Integer.MAX_VALUE) {
            reverse = 0;
        } else if (reverse < Integer.MIN_VALUE) {
            reverse = 0;
        }
        return (int) reverse;
    }

    public int divide(int dividend, int divisor) {
        return (dividend) / (divisor);
    }

    public String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public int commonFactors(int a, int b) {
        int minNumber = 0;
        int result = 0;
        if (a > b) {
            minNumber = b;
        } else {
            minNumber = a;
        }
        for (int i = 1; i <= minNumber; i++) {
            if (a % i == 0 && b % i == 0) {
                result++;
            }
        }
        return result;
    }

    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }

    public String firstPalindrome(String[] words) {
        String result = "";
        for (int i = 0; i < words.length; i++) {
            char[] copyValue = words[i].toCharArray();
            char[] secondCopyValue = new char[copyValue.length];
            int copyLength = copyValue.length - 1;
            for (int j = 0; j < secondCopyValue.length; j++, copyLength--) {
                secondCopyValue[j] = copyValue[copyLength];
            }
            if (String.valueOf(copyValue).equals(String.valueOf(secondCopyValue))) {
                result = words[i];
                break;
            }
        }
        return result;
    }

    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        char[] copyValue = new char[word.length()];
        for (int i = 0; i < copyValue.length; i++) {
            if (index >= 0) {
                copyValue[i] = word.charAt(index);
                index--;
            } else {
                copyValue[i] = word.charAt(i);
            }
        }
        return String.valueOf(copyValue);
    }

    public boolean halvesAreAlike(String s) {
        int l = s.length();
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < l / 2; i++) {
            if (checkStr(s.charAt(i)))
                count1++;
        }

        for (int i = l / 2; i < l; i++) {
            if (checkStr(s.charAt(i)))
                count2++;
        }
        if (count1 == count2)
            return true;

        return false;

    }

    boolean checkStr(char ch) {
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
            return true;

        return false;
    }

    public int prefixCount(String[] words, String pref) {
        int result = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(pref)) {
                result++;
            }
        }
        return result;
    }

    public int findNumbers(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            String valueLength = String.valueOf(nums[i]);
            if (valueLength.length() % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        int max = 0;
        for (char ch : s.toCharArray()) {
            int idxFromChar = ch - 'a';
            max = Math.max(max, ++freq[idxFromChar]);
        }

        for (int freqValue : freq) {
            if (freqValue != 0 && freqValue != max)
                return false;
        }
        return true;

    }

    public boolean isStrictlyPalindromic(int n) {
        boolean result = false;
        char[] binaryValue = (Integer.toBinaryString(n)).toCharArray();
        char[] copyBinaryValue = new char[binaryValue.length];
        int a = 0;
        for (int i = copyBinaryValue.length - 1; i > 0; i--) {
            copyBinaryValue[a] = binaryValue[i];
            a++;
        }
        if (String.valueOf(binaryValue).equals(String.valueOf(copyBinaryValue))) {
            result = true;
        }
        return result;
    }

    public int Liters(double time) {

        //Your code goes here! Hint: You should change that -1
        int result = (int) time / 2;
        return result;
    }

    public static int Past(int h, int m, int s) {
        //Happy Coding! ^_^
        int result = 0;
        if (h == 0) {
            result += 0;
        } else {
            result += h * (60 * 60 * 1000);
        }
        {
            if (m == 0) {
                result += 0;
            } else {
                result += m * (60 * 1000);
            }
        }
        if (s == 0) {
            result += 0;
        } else {
            result += s * 1000;
        }
        return result;
    }

    public static int[] invert(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < result.length; i++) {
            if (array[i] > 0) {
                result[i] = (array[i] - (array[i] + array[i]));
            } else {
                result[i] = ((array[i] + array[i]));
            }
        }

        return result;
    }


    public int minSteps(String s, String t) {

        int[] res = validAnagram(s);
        int[] res1 = validAnagram(t);
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (res1[i] < res[i]) {
                ans += res[i] - res1[i];
            }
        }
        return ans;
    }

    static int[] validAnagram(String s) {
        int[] ans = new int[26];
        for (char c : s.toCharArray()) {
            ans[c - 'a']++;
        }
        return ans;
    }

    public int minValueInArray(int[] array) {
        if (array.length == 0) return 0;
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public int[] sortArrayBubble(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        return array;
    }

    public int secondBigValue(int[] array) {
        int maxi1 = Integer.MIN_VALUE;
        int maxi2 = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maxi1 < array[i]) {
                maxi2 = maxi1;
                maxi1 = array[i];
            } else if (maxi2 < array[i]) {
                maxi2 = array[i];
            }
        }
        return maxi2;
    }

    public int dataHashcode(File value) {
        return value.hashCode();
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
