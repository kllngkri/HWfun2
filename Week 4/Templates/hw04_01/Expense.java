import java.time.LocalDate;
import java.util.PrimitiveIterator;

public class Expense {
    private double expense;
    private String payCause;
    private LocalDate dateOfExpense;

    public Expense(LocalDate dateOfExpense,double expense,String payCause){
        this.dateOfExpense = dateOfExpense;
        this.expense = expense;
        this.payCause = payCause;

    }
    public double getExpense() {
        return expense;
    }
    public LocalDate getDateOfExpense() {
        return dateOfExpense;
    }

    public String getPayCause() {
        return payCause;
    }
}
