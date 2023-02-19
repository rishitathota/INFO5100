

class ExerciseZero {


    public static void main(String args[])
    {

        // Creating object and passing argument for the parameterised constructor in the class
        Chair chair1 = new Chair("red");
        Chair chair2 = new Chair("black");
        Chair chair3 = new Chair("Green");

// Creating object and passing argument for the parameterised constructor in the class
        Table table1 = new Table("White");
        Table table2 = new Table("black");
        Table table3 = new Table("Green");

        // Creating object and passing argument for the parameterised constructor in the class
        Window window1 = new Window(100);
        Window window2 = new Window(200);
        Window window3 = new Window(300);

        // calling method using object reference of window class
        window1.stainProofFrame();

        // Creating object and passing argument for the parameterised constructor in the class
        Door door1 = new Door(300);
        Door door2 = new Door(400);
        Door door3 = new Door(500);

        // Creating object and passing argument for the parameterised constructor in the class
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        // Creating object and passing argument for the parameterised constructor in the class
        Computer computer1 = new Computer(1000);
        Computer computer2 = new Computer(2000);
        Computer computer3 = new Computer(3000);

        // Creating object and passing argument for the parameterised constructor in the class
        Phone phone1 = new Phone(1000);
        Phone phone2 = new Phone(250);
        Phone phone3 = new Phone(1250);

        // Creating object and passing argument for the parameterised constructor in the class
        Utensils utensil1 = new Utensils(30);
        Utensils utensil2 = new Utensils(10);
        Utensils utensil3 = new Utensils(20);

        // Creating object and passing argument for the parameterised constructor in the class
        Pen pn1 = new Pen(10);
        Pen pn2 = new Pen(5);
        Pen pn3 = new Pen(15);

        // Creating object and passing argument for the parameterised constructor in the class
        Bag b1 = new Bag("red");
        Bag b2 = new Bag("green");
        Bag b3 = new Bag("yellow");

        // Creating object and passing argument for the parameterised constructor in the class
        Bicycle bicycle = new Bicycle(500);
        Bicycle bicycle2 = new Bicycle(500);
        Bicycle bicycle3 = new Bicycle(500);
        // accessing a static nested class
        Car.Sedan nestedObject = new Car.Sedan();

        nestedObject.display();

        Car.Xuv xuv = new Car.Xuv();

        xuv.display();

    }
}


