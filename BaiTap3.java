import java.util.Scanner;
class DivisorsOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        int count = 0;
        System.out.println("Các ước số của " + n + " là:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nSố lượng ước số của " + n + " là: " + count);

        scanner.close();
    }
}
