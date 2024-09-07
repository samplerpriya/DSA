import java.util.Scanner;

public class swappingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        System.out.println("Enter the a");
        a = sc.nextInt();

        int b;
        System.out.println("Enter the b");
        b = sc.nextInt();

        System.out.println("Before swapping");
        System.out.println(a);
        System.out.println(b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping");
        System.out.println(a);
        System.out.println(b);
    }
}
