package FirstPackage;

import java.io.IOException;
import java.util.Arrays;

public class AdditionalTasks implements Test{
    public String restoreString(String s, int[] indices) {
        String result = null;
        char[] copyResult = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            copyResult[indices[i]] = s.charAt(i);
        }
        result = String.valueOf(copyResult);
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
