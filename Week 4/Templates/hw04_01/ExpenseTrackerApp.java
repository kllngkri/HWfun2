import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class ExpenseTrackerApp  {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Expense> expenseList = new ArrayList<>();

    public static void main(String[] args) {

    do {
        Expense expense = addExpense();
        if (expense == null)break;
        else expenseList.add(expense);

    }while (true);
        printExpenseList();
    }


    private static void printExpenseList(){
        double sum = 0;
        int time = 0;

        System.out.println("\nExpense\t\tDate\t\t\tNote");
        System.out.println("----------------------------------");
        for (Expense expense : expenseList){
            System.out.println(expense.getExpense()+"\t\t"+expense.getDateOfExpense()+"\t\t\""+expense.getPayCause()+"\"");
            sum += expense.getExpense();
            time += 1;
        }

        System.out.printf("\n* Total expense : %.2f",sum);
        System.out.printf("\n* Average expenses per time : %.2f",(sum/time));
    }

    private static Expense addExpense(){

        double newExpense;
        System.out.print("Enter expense (Enter x to finish): ");
        String expense = sc.nextLine();
        if (expense.equals("x"))return null;
        else newExpense = Double.parseDouble(expense);

        System.out.print("Enter date ( year month day ex. -> 2020 12 3) : " );
        int year  = sc.nextInt();
        int month = sc.nextInt();
        int day   = sc.nextInt();
        sc.nextLine();

        System.out.print("Note : ");
        String note = sc.nextLine();
        System.out.println("*********************************************************");
        return new Expense(LocalDate.of(year,month,day),newExpense,note);
    }



}
