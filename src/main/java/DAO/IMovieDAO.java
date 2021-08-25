package DAO;

import model.Movie;

import java.util.List;
import java.util.Map;

public interface IMovieDAO {
    Movie getMovieByID(String id);
    List<Movie> searchMovies(Map filter, Map sort, int limit, int skip);
    long getMoviesNumber(Map filter);
}
