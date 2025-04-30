package movie;

/**
 * The MovieDriver class serves as the entry point to demonstrate the functionality 
 * of the {@link Movie} class by creating movie objects, setting their durations, 
 * and displaying their details.
 * 
 * @author Shreyesh Chennagouni
 * SID: S576283
 */
public class MovieDriver {
    
    /**
     * The main method creates Movie objects, sets their durations, and displays 
     * their details.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Creating Movie objects
        Movie movie1 = new Movie("Animal", "Sandeep Reddy Vanga");
        Movie movie2 = new Movie("RRR", "Rajamouli");

        // Setting durations
        movie1.setDuration(201);
        movie2.setDuration(187);

        // Display movie details
        System.out.println("Movie 1:");
        movie1.displayMovie();

        System.out.println("Movie 2:");
        movie2.displayMovie();
    }
}
