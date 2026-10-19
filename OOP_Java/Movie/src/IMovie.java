interface IMovie extends Comparable<IMovie>{
    String getMovieId();
    String getTitle();
    String getDirector();
    int getYear();
    double getRating();
    String getGenre();
    int getDuration();
}

