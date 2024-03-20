import java.util.Scanner;

public class Lab24While {
    public static void main(String[] args)
    {
        int i , N,count;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N : ");
        N = scan.nextInt();
        i = N;
        count = 0;
        while(count < N)
        {

            System.out.println(i);
            i--;
            count++;

        }
    }

}
