package collaborativeExercise;

public final class Car {

    //class attributes:
    String name;
    int fuelLevel;
    int maxSpeed;
    boolean broken;


    //constructor:
    public Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;

        System.out.println("Hello, I am " + this.name + " and I can drive " + this.maxSpeed);

    }

    //method:
    void drive() {
        System.out.println("vroom!");
    }
    //method:
    void refuel() {
        System.out.println("Refueling");
    }

    //method:
    public double dragCoefficient(double i, double j) {

        return i / j;
    }
    //main method:
    public static void main(String[] args) {

        Car mini = new Car("Franz", 160);
        System.out.println(mini.name + " says: My drag coefficient is " + String.format("%.02f",mini.dragCoefficient(68, 36))  + "!\n");

        Car ferrari = new Car("Show-Off", 380);
        System.out.println(ferrari.name + " says: My drag coefficient is " + String.format("%.02f",ferrari.dragCoefficient(25, 27)) + "!\n");

        Car beetle = new Car("Ballroom Blizz", 120);
        System.out.println(beetle.name + " says: My drag coefficient is " + String.format("%.02f",beetle.dragCoefficient(44, 77) )+ "!\n");

        beetle.drive();
        ferrari.refuel();

    }
}