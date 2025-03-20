package ss2_practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PassVariableMethod {
    public static void main(String[] args) {
        int[] a = {10,20,30};
        changData(a);
        System.out.println(Arrays.toString(a));
    }

    public static void changData (int[] arr){
        arr = new int[3];
        arr[0] = 100;
    }

}
