public class Grade {

    public static void main(String[] args) {

        char grade = 'A';
        String result = "";

        switch (grade) {
            case 'A':
                result = "Excellent";
                break;

            case 'B':
                result = "Great Job";
                break;

            case 'C':
                result = "Good";
                break;

            case 'D':
                result = "Passed";
                break;

            case 'F':
                result = "Failed";
                break;

            default:
                result = "Invalid";

        }

        System.out.println("result = " + result);


    }

}