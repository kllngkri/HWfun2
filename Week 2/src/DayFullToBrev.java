import java.util.Scanner;

public class DayFullToBrev {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (Monday, Tuesday, Wednesday, Thursday,Friday, Saturday, Sunday): ");
        String dateFull = sc.nextLine();
        String dateBrev = "";

        switch(dateFull) {
            case "Monday":
                dateBrev = "MON";
                break;
            case "Tuesday":
                dateBrev = "TUE";
                break;
            case "Wednesday":
                dateBrev = "WED";
                break;
            case "Thursday":
                dateBrev = "THU";
                break;
            case "Friday":
                dateBrev = "FRI";
                break;
            case "Saturday":
                dateBrev = "SAT";
                break;
            case "Sunday":
                dateBrev = "SUN";
                break;
            default:
                dateBrev = ""; // หรือให้เป็นค่าอื่นที่ต้องการสำหรับกรณีที่ไม่ตรงกับเงื่อนไขทั้งหมด
        }


        System.out.println("The abbreviation of "+dateFull+"is "+dateBrev+".");

    }
}
