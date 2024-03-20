import java.util.Scanner;

public class Lab22IfClass {

    public static void main(String[] args)
    {
        Scanner scan_double = new Scanner(System.in);
        Scanner scan_str = new Scanner(System.in);
        String str;
        char member;
        double price;
        System.out.print("Please input your price : ");
        price = scan_double.nextDouble();
        System.out.print("Are you members? : ");
        str = scan_str.nextLine();
        member = str.charAt(0);
        if (member == 'Y'){
            price *= 0.9;
        } else System.out.print("Invalid input");

        System.out.println("Your price is "+price+" baht. Thank you.");

    }

}
