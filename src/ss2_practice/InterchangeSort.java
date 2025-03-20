package ss2_practice;

public class InterchangeSort {
    public static void main(String[] args) {

    }

    public static void interChangeSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { // 12 2 8 5 1 6 4 15
                    int temp = arr[i]; // temp = 12
                    arr[i] = arr[j]; // arr[i] = 2
                    arr[j] = temp; // arr[j] = 12 ->> 2 12 8 5 1 6 4 15
                }
            }
        }
    }
}
