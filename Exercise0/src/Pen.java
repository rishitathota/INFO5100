public class Pen {
    int price;
    String material;
    String color;
    String company;

    String length;
    int width;
    boolean stainFree;
    boolean ticTocSound;

    public void autoLockFeature()
    {
        System.out.println("The Pen comes with autoLock feature");

    }
    public void eraserAtTop()
    {
        System.out.println("The Pen comes with Eraser at top of it ");

    }
    public void antiTheftFeature()
    {
        System.out.println("The Pen comes with antiTheft feature");

    }
    Pen(int price)
    {
        this.price = price;
        System.out.println("The Pen class constructor with price $"+ " "+price );

    }
}

