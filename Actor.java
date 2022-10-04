// Instructions
// - Initialize a new Springboot + Maven java app.
// - Install the necessary dependencies.
// - Create classes for:
//   - An actor - id, first name, last name, year of birth.
//   - A movie - id, title, description, year, actors (yep, another one-to-many).

// - Build Class methods and Springboot Controllers to achieve these endpoints:
//   - Get a movie with all its actors
//   - Get a single actor 
//   - Create a new actor and immediately assign them to a movie.
//   - Create a new movie
// - Think of a way to auto-increment a new id each time we create a new movie or actor
// - Populate the app with some sample data and test the API

public class Actor {
    

    public static void main(String[] args) {
        Actor actor1 = new Actor(1, "Tom", "Hanks", 1956);
        Actor actor2 = new Actor(2, "Tom", "Cruise", 1962);
        Actor actor3 = new Actor(3, "Tom", "Selleck", 1945);
        Actor actor4 = new Actor(4, "Tom", "Waits", 1949);
        Actor actor5 = new Actor(5, "Tom", "Green", 1971);
        Actor actor6 = new Actor(6, "Tom", "Hiddleston", 1981); 
        actor1.displayInfo();
        actor2.displayInfo();
        actor3.displayInfo();
        actor4.displayInfo();
        actor5.displayInfo();
        actor6.displayInfo();

    }
    String firstName;
    String lastName;
    int yearOfBirth;
    int id;



    public Actor(int id, String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.id = id;
    }

    public void displayInfo(){
        System.out.println("Actor: " + this.firstName + " " + this.lastName + " " + this.yearOfBirth + " " + this.id);
    }

    
}