//package Module1;
//
//import java.util.Scanner;
//
//
//public class Exercise4 {
//    static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//
//        int n;
//        do {
//            System.out.print("Nhập vào số lượng phần tử của mảng:");
//            n = sc.nextInt();
//
//            if (n < 0) {
//                System.out.println("Số lượng phần tử phải > 0. Xin vui lòng kiểm tra lại!");
//            }
//        } while (n < 0);
//
//        int[] arr = new int[n];
//
//        inputArr(arr);
//        ouputArr(arr);
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            if (arr[i] % 2 != 0 && arr[i] >= 2) {
//                System.out.print(arr[i] + "\t");
//            }
//        }
//
//
//    }
//
//    public static void inputArr(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("Nhập vào phần tử của mảng arr[%d]: ", i);
//            arr[i] = sc.nextInt();
//        }
//    }
//
//    public static void ouputArr(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }
//    }
//
//    static int[] getPrimeFromArray(int[] arr) {
//        // Bước 1: Đếm số lượng số nguyên tố
//        int countPrime = 0;
//
//        for (int item : arr) {
//            if (isPrime(item)) {
//                countPrime++;
//            }
//        }
//
//        // Bước 2: Tạo mảng với số lượng số nguyên tố
//        int[] primeArr = new int[countPrime];
//
//        // Bước 3: Đưa các số nguyên tốt vào mảng vừa tạo
//        int indexPrimeArr = 0;
//        for (int item : arr) {
//            if (isPrime(item)) {
//                primeArr[indexPrimeArr++] = item;
//            }
//        }
//
//        // Bước 4: return mảng các số nguyên tố
//        return primeArr;
//    }
//
//
//}
