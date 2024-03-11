import java.util.Scanner;

public class MessageEncodeTextApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Original message : ");
        String messageEncode = scanner.nextLine();
        System.out.print("Encode Message : "+MassageEncode.encodeMessage(messageEncode));

    }
}
