public class Bag {
    int noOfPockets;
    int price;
    int discountedPrice;
    String color;
    String companyName;
    Boolean waterProof;
    String material;
    int noOfGears;

    public void chargingOption ()
    {
        System.out.println("The Bag comes with a charging usb socket");
    }
    public void antiTheft ()
    {
        System.out.println("The Bag comes with a theft resistant chain");
    }
    public void WheelsOrNot ()
    {
        System.out.println("The Bag comes with four durable wheels");
    }
    Bag(String color)
    {
        this.color= color;
        System.out.println("Bag class (constructor) with color" + " "+ color);
    }
}
