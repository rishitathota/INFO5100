import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Singleton pattern implementation
class Database {
    private static Database instance = null;

    private Database() {
        // Private constructor to prevent instantiation outside of this class
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void save(String data) {
        System.out.println("Saving data to database: " + data);
    }
}

// Factory Method pattern implementation
abstract class Animal {
    public abstract String getSound();
}

class Dog extends Animal {
    public String getSound() {
        return "Woof!";
    }
}

class Cat extends Animal {
    public String getSound() {
        return "Meow!";
    }
}

class AnimalFactory {
    public static Animal createAnimal(String type) {
        if (type.equals("dog")) {
            return new Dog();
        } else if (type.equals("cat")) {
            return new Cat();
        } else {
            throw new IllegalArgumentException("Invalid animal type");
        }
    }
}

// Observer pattern implementation
interface Observer {
    void update(String data);
}

class EmailNotifier implements Observer {
    public void update(String data) {
        System.out.println("Sending email notification: " + data);
    }
}

class SmsNotifier implements Observer {
    public void update(String data) {
        System.out.println("Sending SMS notification: " + data);
    }
}

class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String data;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setData(String data) {
        this.data = data;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(data);
        }
    }
}

public class Exercise5 {
    
    public static void main(String[] args) 
    {
        // Singleton pattern usage
        Database db = Database.getInstance();
        db.save("Hello, world!");

        // Factory Method pattern usage
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter animal type (dog or cat): ");
        String type = scanner.nextLine();
        Animal animal = AnimalFactory.createAnimal(type);
        System.out.println("The animal says: " + animal.getSound());

        // Observer pattern usage
        Subject subject = new Subject();
        subject.addObserver(new EmailNotifier());
        subject.addObserver(new SmsNotifier());
        subject.setData("New data added to database");
    }
}



