import java.util.ArrayList;

public class MovieCollectionRunner
{
  public static void main(String[] args)
  {
    // TASK 1: write the code for the importMovieList helper method
    // in the MovieCollection class then write some test code here to create
    // a new MovieCollection from the movies in the movies_data.csv file
    // ** USE THE CEREAL COLLECTION SAMPLE PROJECT TO HELP YOU! **

    MovieCollection collection = new MovieCollection("src\\movies_data.csv");
    ArrayList<Movie> movieList = collection.getMovies();
    collection.menu();

  }
}