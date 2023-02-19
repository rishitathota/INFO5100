
public class Bicycle {

    int price;
    String material;
    String color;
    String company;

    String length;
    int width;
    boolean stainFree;
    boolean hornOrNot;
    String ownerName;

    public void autoLockFeature()
    {
        System.out.println("The Bicycle comes with autoLock feature");

    }
    public void eraserAtTop()
    {
        System.out.println("The Bicycle comes with Eraser at top of it ");

    }
    public void antiTheftFeature()
    {
        System.out.println("The Bicycle comes with antiTheft feature");

    }
    Bicycle(int price)
    {
        this.price = price;
        System.out.println("The Bicycle class constructor with price $"+ " "+price );

    }
}
