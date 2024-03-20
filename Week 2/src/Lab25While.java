import java.util.Scanner;

public class Lab25While {
    public static void main(String[] args)
    {
        int i, N,count;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N : ");
        N = scan.nextInt();
        count = 0;
        i = N;

        while(count < N)
        {
            if( i%2 == 0 )
            {
                System.out.println(i);
            }
            i--;
            count++;
        }
    }
}
