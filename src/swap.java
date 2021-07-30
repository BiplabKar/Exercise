import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int a,b;
        int temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two values : ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Values before swapping :");
        System.out.println("A : "+a+"\tB : "+b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("Values after swapping : ");
        System.out.println("A : "+a+ "\tB : "+b);
    }
}
