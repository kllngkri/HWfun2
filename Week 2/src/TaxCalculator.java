import java.util.ArrayList;
import java.util.Scanner;

public class TaxCalculator {
    private enum Tax{
        length1(0,150000,0.05),
        length2(150000,300000,0.05),
        length3(300000,500000,0.10),
        length4(500000,750000,0.05),
        length5(750000,1000000,0.05),
        length6(1000000,2000000,0.05),
        length7(2000000,5000000,0.05),
        length8(5000000,999999999,0.05);


        private double income1;
        private double income2;
        private double taxPercent;

        Tax(double income1, double income2, double taxPercent) {
            this.income1 = income1;
            this.income2 = income2;
            this.taxPercent = taxPercent;
         }

        public double getTaxPercent() {
            return taxPercent;
        }

        public double getIncome1() {
            return income1;
        }

        public double getIncome2() {
            return income2;
        }

        public double getTaxOfLength(){
            return (income2 - income1)*taxPercent;
        }

        public double getDeltaLength(){
            return income2-income1;
        }
    }

    private static Tax [] allLenghtTax = {Tax.length1,Tax.length2,Tax.length3,
            Tax.length4,Tax.length5,Tax.length6,Tax.length7,Tax.length8};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary,yearCost,taxDeduction,otherIncome,income = 0.0;

        System.out.print("Enter Salary : ");
        salary = scanner.nextDouble();
        System.out.print("Enter year cost : ");
        yearCost = scanner.nextDouble();
        System.out.print("Enter Tax deduction : ");
        taxDeduction = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("You have other income? ");
        String checkOtherIncome = scanner.nextLine();
        if (checkOtherIncome.equals("N")){
            income = (salary*12) - yearCost - taxDeduction;
            System.out.printf("Income : (%.2fx12) - %.2f - %.2f = %.2f \n",salary,yearCost,taxDeduction,income);
            System.out.println("Tax is "+checkTax(income)*100+"%");

        }else if (checkOtherIncome.equals("Y")){
            System.out.print("input other income : ");
            otherIncome = scanner.nextDouble();
            income = (salary*12) - yearCost - taxDeduction + otherIncome;
            System.out.printf("Income : (%.2fx12) - %.2f - %.2f + %.2f = %.2f \n",salary,yearCost,taxDeduction,otherIncome,income);
            System.out.println("Tax is "+checkTax(income)*100+"%");

        }else System.out.println("Wrong!!");

        printResult(income);

    }

    private static double checkTax(double income) {

        for (Tax tax : allLenghtTax){
            if (income >= tax.getIncome1() && income <= tax.getIncome2())return tax.getTaxPercent();
        }

        return .0;

    }


    private static void printResult(double income){
       var allTax = new ArrayList<Tax>(10);
       double taxOfIncome = 0;
       double incomeForCheck = income;

       for (Tax tax : allLenghtTax ){
           allTax.add(tax);
           if(income >= tax.getIncome1() && income <= tax.getIncome2()){
                break;
           }
       }

        System.out.println(" ");
        System.out.println("Step 1");
       for (Tax tax : allTax){

           if (incomeForCheck - tax.getDeltaLength() < 0 ){
               System.out.print(" = "+incomeForCheck + "*" + tax.getTaxPercent()*100 + "% = " + incomeForCheck*tax.getTaxPercent() + "\n");
               taxOfIncome +=  incomeForCheck*tax.getTaxPercent();
               break;
           }else {
               System.out.print(incomeForCheck+ " - " + tax.getDeltaLength() + " = " + (incomeForCheck - tax.getDeltaLength()));
               incomeForCheck -= tax.getDeltaLength();

           }

       }

       System.out.println("Step 2");
       for (int i = 1;i < (allTax.size()-1);i++){
           Tax tax = allTax.get(i);
           System.out.println(tax.getDeltaLength() + "*" + tax.getTaxPercent()*100 + "% = "+tax.getDeltaLength()*tax.getTaxPercent());
           taxOfIncome += tax.getTaxOfLength();
       }

        System.out.println("Your tax = "+taxOfIncome);

    }



}
