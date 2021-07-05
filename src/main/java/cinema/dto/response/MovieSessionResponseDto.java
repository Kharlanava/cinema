package cinema.dto.response;

public class MovieSessionResponseDto {
    private Long movieSessionId;
    private Long movieId;
    private String movieTitle;
    private Long cinemaHallId;
    private String showTime;

    public void setMovieSessionId(Long movieSessionId) {
        this.movieSessionId = movieSessionId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setCinemaHallId(Long cinemaHallId) {
        this.cinemaHallId = cinemaHallId;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public Long getMovieSessionId() {
        return movieSessionId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public Long getCinemaHallId() {
        return cinemaHallId;
    }

    public String getShowTime() {
        return showTime;
    }
}
