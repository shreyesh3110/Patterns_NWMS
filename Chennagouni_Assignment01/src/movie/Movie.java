package movie;

/**
 * Represents a movie with a title, director, and duration.
 * 
 * @author Shreyesh Chennagouni
 * SID: S576283
 */

public class Movie {
    private String title;
    private String director;
    private int duration;

    /**
     * Constructs a Movie with the specified title and director.
     * 
     * @param title    the title of the movie
     * @param director the director of the movie
     */
    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    /**
     * Gets the director of the movie.
     * 
     * @return the director of the movie
     */
    public String getDirector() {
        return director;
    }

    /**
     * Sets the duration of the movie.
     * 
     * @param duration the duration of the movie in minutes
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Displays the details of the movie, including title, director, and duration.
     */
    public void displayMovie() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Total Duration: " + duration + " minutes.\n");
    }
}
