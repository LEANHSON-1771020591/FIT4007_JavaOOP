import java.util.Scanner;
class OddNumbersDivisibleBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số N: ");
        int N = scanner.nextInt();
        System.out.println("Các số lẻ chia hết cho 3 nhỏ hơn " + N + " là:");
        for (int i = 1; i < N; i++) {
            if (i % 2 != 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
