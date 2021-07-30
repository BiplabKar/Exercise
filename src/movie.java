import java.util.Scanner;
public class movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much money you have : ");
        int m = sc.nextInt();
        if ( m > 100){
            if( m >200){
                System.out.println("You can go to premium movie");
            }
            else{
                System.out.println("You can watch normal movie");
            }
        }
        else{
            System.out.println("You can't go to movie");
        }
        System.out.println("You have "+m+ " Rupees !!");


    }

}
