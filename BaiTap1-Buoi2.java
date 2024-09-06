import java.util.Arrays;
import java.util.Scanner;
class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp tăng dần: " + Arrays.toString(arr));
        int[] arrDesc = new int[n];
        for (int i = 0; i < n; i++) {
            arrDesc[i] = arr[n - i - 1];
        }
        System.out.println("Mảng sau khi sắp xếp giảm dần: " + Arrays.toString(arrDesc));
        scanner.close();
    }
}
