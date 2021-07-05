package cinema.dto.response;

public class MovieResponseDto {
    private Long movieId;
    private String movieTitle;
    private String movieDescription;

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public Long getMovieId() {
        return movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }
}
