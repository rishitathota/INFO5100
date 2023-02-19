public  class Table {
    int noOfLegs;
    String color;
    int noOfHandleModes;
    int noOfHeightAdjustments;
    boolean adjustableOrNot;
    boolean reclineOrNot;
    boolean foldOrNot;
    int price;
    Table(String colorReceived)
    {
        this.color = colorReceived;
        System.out.println("Table class instantiated with "+color+ "color");


    }

    public void revolve() {
        System.out.println("Table can be revolved");

    }

    public void move() {
        System.out.println("Table can be moved");

    }

    public void adjust() {
        System.out.println("Table can be revolved");

    }
}
