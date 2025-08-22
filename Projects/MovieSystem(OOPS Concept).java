import java.util.*;

// Abstract Class (Abstraction)
abstract class Movie {
    private String movieName;
    private double ticketPrice;

    // Constructor
    public Movie(String movieName, double ticketPrice) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
    }

    // Encapsulation
    public String getMovieName() {
        return movieName;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    // Abstract Method 
    public abstract double calculatePrice(int persons);
}

// Inheritance
class TamilMovie extends Movie {
    public TamilMovie(String movieName) {
        super(movieName, 200.0); 
    }

    @Override
    public double calculatePrice(int persons) {
        return persons * getTicketPrice();
    }
}

class EnglishMovie extends Movie {
    public EnglishMovie(String movieName) {
        super(movieName, 250.0);  
    }

    @Override
    public double calculatePrice(int persons) {
        return persons * getTicketPrice();
    }
}

class HindiMovie extends Movie {
    public HindiMovie(String movieName) {
        super(movieName, 150.0);  
    }

    @Override
    public double calculatePrice(int persons) {
        return persons * getTicketPrice();
    }
}

public class Movie1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println(" Welcome to MOVIE Booking System");
        System.out.println("Choose Movie Language: 1. Tamil  2. English  3. Hindi");
        int choice = in.nextInt();

        Movie movie = null;

        switch (choice) {
            case 1:
                movie = new TamilMovie("Coolie");
                break;
            case 2:
                movie = new EnglishMovie("Avengers");
                break;
            case 3:
                movie = new HindiMovie("Sitaare Zameen Par");
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.print("Enter number of persons: ");
        int persons = in.nextInt();

        double totalPrice = movie.calculatePrice(persons);

        System.out.println("\n Ticket Booking Confirmed!");
        System.out.println("Movie Title: " + movie.getMovieName());
        System.out.println("No of Persons: " + persons);
        System.out.println("Total Price: Rs:" + totalPrice);
    }
}
