import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter first number : ");
        a = inp.nextInt();
        System.out.print("Enter second number : ");
        b = inp.nextInt();
        System.out.print("Enter third number : ");
        c = inp.nextInt();

        if (a < b & a < c) {
            if (b < c) {
                System.out.println("a<b<c");
            } else {
                System.out.println("a<c<b");

            }
        } else if (b < c & b < a) {
            if (c < a) {
                System.out.println("b<c<a");
            } else {
                System.out.println("b<a<c");
            }
        } else {
            if (b < a) {
                System.out.println("c<b<a");
            } else {
                System.out.println("c<a<b");
            }
        }
    }
}
