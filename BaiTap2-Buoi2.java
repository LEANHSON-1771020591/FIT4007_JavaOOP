import java.util.Scanner;
class DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước ma trận (n x n): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Tổng các phần tử trên đường chéo chính là: " + sum);
        scanner.close();
    }
}