public class Dog extends Animal  { // Dog Is An animal

    public Dog(String name, String breed, char gender, String size, int age, String color){
       setInfo(name, breed, gender, size, age, color);
    }

    public void bark(){
        System.out.println(name+" is barking");
    }

}