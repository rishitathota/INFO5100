public class Utensils {
    int price;
    String material;
    String color;
    String company;

    String length;
    int width;
    boolean stainFree;
    boolean volume;

    public void autoLockFeature()
    {
        System.out.println("The Utensils comes with autoLock feature");

    }
    public void eraserAtTop()
    {
        System.out.println("The Utensils comes with Eraser at top of it ");

    }
    public void antiTheftFeature()
    {
        System.out.println("The Utensils comes with antiTheft feature");

    }
    Utensils(int price)
    {
        this.price = price;
        System.out.println("The Utensils class constructor with price $"+ " "+price );

    }
}

