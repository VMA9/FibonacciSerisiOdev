import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, a = 0 , b = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Oluşturulacak Fibonacci Serisi eleman sayısını giriniz : ");
        n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            int c = a + b;
            System.out.print(a + " + " + b + " = " + c);
            a = b;
            b = c;
            System.out.println();
        }

    }
}
