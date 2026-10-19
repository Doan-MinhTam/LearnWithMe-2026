
interface IMovieCollection {
    boolean addMovie(IMovie movie);
    boolean removeMovie(String movieId);
    IMovie getMovie(String movieId);
    java.util.List<IMovie> getAllMovies();
    int getTotalMovies();
    java.util.List<IMovie> sortByNaturalOrder();
    java.util.List<IMovie> sortByRating();
    java.util.List<IMovie> sortByYear();
    java.util.List<IMovie> sortByTitle();
    java.util.List<IMovie> sortByDuration();
    java.util.List<IMovie> sortByGenreThenRating();
    java.util.List<IMovie> getMoviesByGenre(String genre);
    java.util.List<IMovie> getMoviesByDirector(String director);
    double getAverageRating();
    java.util.List<IMovie> getTopRatedMovies(double minRating);
}