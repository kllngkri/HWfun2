import java.util.ArrayList;
import java.util.Scanner;

public class HwWeek2 {
    private  final double[] taxLength = {150000,300000,500000,750000,1000000,2000000,5000000,9999999999.99};
    private  final double[] TAX  = {0.00,0.05,0.10,0.15,0.20,0.25,0.30,0.35};
    private  double income;
    private  double tax;
    private static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HwWeek2 calTax = new HwWeek2();

        System.out.print("Enter Salary : ");
        double salary = scanner.nextDouble();
        System.out.print("Enter year cost : ");
        double yearCost = scanner.nextDouble();
        System.out.print("Enter Tax deduction : ");
        double taxDeduction = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("You have income? ");
        String checkOtherIncome = scanner.nextLine();
        if (checkOtherIncome.equals("N")){
            calTax.setIncome(salary,yearCost,taxDeduction).setTax();

        }else if (checkOtherIncome.equals("Y")){
            System.out.print("Input Other in come : ");
            double otherIncome = scanner.nextDouble();
            calTax.setIncome(salary,yearCost,taxDeduction,otherIncome).setTax();

        }else System.out.println("Wrong!!");

        calTax.calculateTax();
    }

    private  HwWeek2 setIncome(double salary,double yearCost,double taxDeduction) {
        income = (salary*12) - yearCost - taxDeduction;
        System.out.printf("Income : (%.2fx12) - %.2f - %.2f = %.2f \n",salary,yearCost,taxDeduction,income);
        return  this;
    }

    private  HwWeek2 setIncome(double salary,double yearCost,double taxDeduction,double otherIncome) {
        income = (salary*12) - yearCost - taxDeduction + otherIncome;
        System.out.printf("Income : (%.2fx12) - %.2f - %.2f + %.2f = %.2f \n",salary,yearCost,taxDeduction,otherIncome,income);
        return this;
    }

    private  HwWeek2 setTax(){
        for (int i = 0; i < taxLength.length - 1; i++) {
            if (this.income < taxLength[i + 1]) {
                this.tax = TAX[i];
                break; // ออกจากลูปทันทีเมื่อเจอเงื่อนไข
            }
        }

        System.out.println("Tax is "+tax*100+"%");
        return this;
    }

    private void calculateTax() {
        double remainingIncome = this.income;
        double sumTax = 0;
        int i = 0;

        while (i < taxLength.length - 1) {
            if (remainingIncome < taxLength[i + 1]) {
                // Calculate tax for the current bracket
                sumTax += (remainingIncome - taxLength[i]) * TAX[i];
                break;
            } else {

                sumTax += (taxLength[i + 1] - taxLength[i]) * TAX[i];
                remainingIncome -= (taxLength[i + 1] - taxLength[i]);
            }

            i++;
        }

        System.out.println("Your tax is " + sumTax);
    }







}
