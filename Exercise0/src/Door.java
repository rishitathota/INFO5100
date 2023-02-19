public class Door {

    int price;
    String material;
    String color;
    String company;

    String handleMaterial;
    int noOfLocks;
    boolean stainFree;
    boolean autoLock;

    public void autoLockFeature()
    {
        System.out.println("The door comes with autoLock feature");

    }
    public void fireProofFeature()
    {
        System.out.println("The door comes with fireProof feature");

    }
    public void antiTheftFeature()
    {
        System.out.println("The door comes with antiTheft feature");

    }
    Door(int price)
    {
        this.price = price;
        System.out.println("The door class constructor with price $"+ " "+price );

    }
}
