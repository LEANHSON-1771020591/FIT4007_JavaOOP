import java.util.Scanner;
class EvenNumbersDivisibleBy5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số N: ");
        int N = scanner.nextInt();
        System.out.println("Các số chẵn chia hết cho 5 nhỏ hơn " + N + " là:");
        for (int i = 0; i < N; i += 10) {
            System.out.print(i + " ");
        }
    }
}
