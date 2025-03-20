package ss2_practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        // thêm phần từ x vào cuối mảng
        int x = 100;
        arr = add(arr,x);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] add(int[] arr, int x){
        // Bước 1: Tọa vùng nhớ mới = Độ dài của vùng nhớ củ + 1
        int[] brr = new int[arr.length + 1];
        // Bước 2: Coppy giá trị của vùng nhớ cũ qua vùng nhớ mới
        for (int i = 0 ; i < arr.length; i++){
            brr[i] = arr[i];
        }
        // Bước 3: Gán phần tử muốn them vào cuối mảng
        brr[brr.length - 1] = x;
        // Bước 4: Cho biến mảng ban đầu tham chiếu đến vùng nhớ mới
        return brr;
    }
}
