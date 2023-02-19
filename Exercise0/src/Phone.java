public class Phone {
    int price;
    int ramInGB;
    int noOfProcessorCore;

    String launchLocation;
    String companyName;
    int internalMemoryInGB;
    int megaPixels;
    int batteryCapacity;

    public void connectivityOffered()
    {
        System.out.println("Phone has 5G connectivity");
    }
    public void processorOffered()
    {
        System.out.println("Phone has quad core processor");
    }
    public void backCamera()
    {
        System.out.println("It comes with dual back camera and dual from camera");
    }

    Phone()
    {
        System.out.println("Default Phone class constructor with user input ");
    }
    Phone(int price)
    {
        this.price = price;
        System.out.println("Phone price is $"+ " "+price);
    }
}

