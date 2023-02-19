public class Car {

    // static member
    static int noOfWheels = 4;

    // instance(non-static) member
    int outer_y = 20;

    // private member
    private static int outer_private = 30;
    static class Sedan
    {
        void display()
        {
            // can access static member of outer class
            System.out.println("A standard car with wheels = " + noOfWheels);

            // can access display private static member of outer class
            System.out.println("outer_private = " + outer_private);
            System.out.println("A sedan class which is nested class to car class's display method has been called");

        }
    }

    static class Xuv
    {
        void display()
        {
            // can access static member of outer class
            System.out.println("A standard car with wheels = " + noOfWheels);

            // can access display private static member of outer class
            System.out.println("outer_private = " + outer_private);
            System.out.println("A Xuv class which is nested class to car class's display method has been called");

        }
    }
}

