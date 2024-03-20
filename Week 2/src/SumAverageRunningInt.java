import java.util.Scanner;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int upperBound;
        int lowerBound;
        int i = 0;
        int sum = 0;

        System.out.print("Enter the lower bound value : ");
        lowerBound = (new Scanner(System.in)).nextInt();
        System.out.print("Enter the upper bound value : ");
        upperBound = (new Scanner(System.in)).nextInt();

        do {
            sum += i;
            i++;
        }while (i <= upperBound);
        System.out.printf("The sum of %d to %d is %d.",lowerBound,upperBound,sum);
    }


}
