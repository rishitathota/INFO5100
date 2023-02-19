public  class Window {
    int noOfLock;
    int noOfSliders;
    Boolean slideOrNot;
    String color;
    String material;
    String companyName;
    Boolean transparentOrNot;
    int price;

    public void slidingFeature()
    {

        System.out.println("It is a sliding window");
    }
    public void allowSunlight()
    {

        System.out.println("It allows the sunlight ");
    }
    public void stainProofFrame()
    {

        System.out.println("Window comes with stain proof frame");
    }

    //constructor call
    Window(int price)
    {
        this.price= price;
        System.out.println("Window class is instantiated and the price of the window is "+" "+"$"+price );
    }
}

