package DSA.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 25, 86, 73, 96, 100, 1, 3, 14, 23, 56, 78, 90, 1000, 12, 33 };
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < (n - i); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = 0;
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
