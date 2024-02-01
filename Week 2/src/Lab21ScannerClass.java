import java.util.Scanner;
public class Lab21ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter NAME : ");
        String name = scanner.nextLine();

        System.out.print("Enter ID : ");
        String id = scanner.nextLine();

        System.out.print("Enter Birthday (dd/mm/yyyy) : ");
        String birthday = scanner.nextLine();

        System.out.print("Enter Age : ");
        int age = scanner.nextInt();

        System.out.print("Enter GPA : ");
        double gpa = scanner.nextDouble();

        // พริ้วข้อมูล
        System.out.println("My Name is " + name);
        System.out.println("Birthday: " + birthday);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        System.out.println("GPA: " + gpa);

        // ปิด Scanner
        scanner.close();
    }
}
