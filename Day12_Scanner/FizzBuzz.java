public class FizzBuzz {

    public static void main(String[] args) {
        int number = 5;
        String result = "";

        switch (number){
            case 3:
            case 6:
            case 9:
                result ="Fizz";
                break;

            case 5:
            case 10:
                result = "Buzz";
                break;

            case 1:
                result = "One";
                break;

            case 2:
                result="Two";
                break;

            case 4:
                result ="Four";
                break;

            case 7:
                result = "Seven";
                break;

            case 8:
               result = "Eight";
                break;

            default:
                result = "Invalid";

        }

        System.out.println("result = " + result);


    }

}