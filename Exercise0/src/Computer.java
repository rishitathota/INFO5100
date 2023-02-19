public class Computer {

    int price;
    int ramInGB;
    int noOfProcessorCore;

    String launchLocation;
    String companyName;
    int internalMemoryInGB;
    int megaPixelsOfWebcam;
    int batteryCapacity;

    public void connectivityOffered()
    {
        System.out.println("Computer has Wifi connectivity");
    }
    public void processorOffered()
    {
        System.out.println("Computer has quad core processor");
    }
    public void backCamera()
    {
        System.out.println("It comes with webcam ");
    }

    Computer()
    {
        System.out.println("Default Computer class constructor with user input ");
    }
    Computer(int price)
    {
        this.price = price;
        System.out.println("Computer price is $"+ " "+price);
    }
}

