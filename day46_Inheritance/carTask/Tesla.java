package Day46_Inheritance.carTask;

public class Tesla extends Car {

    public static boolean isElectric = true;


    public Tesla(String model, int year, double price, String color, long miles) {
        super("Tesla", model, year, price, color, miles);
    }


    public void autoPilot(){
        System.out.println(brand+" "+model+" is driving by itself");
    }

    @Override
    public void start() {
        System.out.println("Push the start button");
    }



}
