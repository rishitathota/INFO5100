public class Chair {
    int noOfLegs;
    String color;
    int noOfHandleModes;
    int noOfHeightAdjustments;
    boolean adjustableOrNot;
    boolean reclineOrNot;
    boolean foldOrNot;
    int price;
    Chair(String colorReceived)
    {
        this.color = colorReceived;
        System.out.println("chair class initialized and object is" +" " +color + " "+"chair" );
    }
    public void revolve() {
        System.out.println("chair can be revolved");

    }

    public void move() {
        System.out.println("chair can be moved");

    }

    public void adjust() {
        System.out.println("chair can be revolved");

    }


}
