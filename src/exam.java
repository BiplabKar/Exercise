import java.util.*;
public class exam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int student;
        int roll;
        String name;
        float percentage;
        System.out.println("Enter no of student: ");
        student = sc.nextInt();
        System.out.println("No of student is :"+student);
        for (int i=1;i<student;i++){
            System.out.println("Enter name : ");
            name = sc.nextLine();
            System.out.println("Enter roll : ");
            roll = sc.nextInt();
            System.out.println("Enter percentage : ");
            percentage = sc.nextFloat();
            for (int j = 0;j<student;j++){
                System.out.println("Name : "+name);
                System.out.println("ROll : "+roll);
                System.out.println("Percent : "+percentage);
            }
        }




    }
}
