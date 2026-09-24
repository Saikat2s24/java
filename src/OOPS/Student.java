package OOPS;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int rollNo;
        int math, chemistry, physics;

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Mathematics Marks: ");
        math = sc.nextInt();

        System.out.print("Enter Chemistry Marks: ");
        chemistry = sc.nextInt();

        System.out.print("Enter Physics Marks: ");
        physics = sc.nextInt();

        System.out.println("\nStudent Details");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Mathematics: " + math);
        System.out.println("Chemistry: " + chemistry);
        System.out.println("Physics: " + physics);
    }
}