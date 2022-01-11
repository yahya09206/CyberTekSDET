package Day18_Recap.Replit;

import java.util.Scanner;

public class SMSMessage {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();

        //write your codes here:
        String sender = message.substring((message.indexOf("<") + 1), (message.indexOf(">")));
        String phoneNumber = message.substring((message.indexOf("[") + 1), (message.indexOf("]")));
        String messageBody = message.substring((message.indexOf("{") + 1), (message.indexOf("}")));

        System.out.println("Sender: " + sender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Message body: " + messageBody);
    }
}
