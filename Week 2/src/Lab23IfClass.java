import java.util.Scanner;

public class Lab23IfClass {
    public static void main(String[] args)
    {


        System.out.print("Please input your ages : ");
        int age = (new Scanner(System.in)).nextInt();
        System.out.print("Please input your height : ");
        int height = (new Scanner(System.in)).nextInt();

        if( age <= 10){
            if(height > 100 ){
                System.out.println("Your ticket price is 0 baht.");
            }else{
                System.out.println("Your ticket price is 890 baht.");
            }
        }
        else{
            System.out.println("Your ticket price is 1190 baht.");
        }
    }


}
