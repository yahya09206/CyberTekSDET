package Day18_Recap.Replit;

import java.util.Scanner;

public class AlejandroII {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        if (a.contains("alejandro") && a.contains("project")){
            System.out.println("read");
        }else {
            System.out.println("don't read");
        }
    }
}
