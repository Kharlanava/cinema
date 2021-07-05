package cinema.service.impl;

import cinema.dao.MovieSessionDao;
import cinema.exception.DataProcessingException;
import cinema.model.MovieSession;
import cinema.service.MovieSessionService;
import java.time.LocalDate;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class MovieSessionServiceImpl implements MovieSessionService {
    private static final Logger logger = LogManager.getLogger(MovieSessionService.class);
    private final MovieSessionDao movieSessionDao;

    public MovieSessionServiceImpl(MovieSessionDao movieSessionDao) {
        this.movieSessionDao = movieSessionDao;
    }

    @Override
    public List<MovieSession> findAvailableSessions(Long movieId, LocalDate date) {
        return movieSessionDao.findAvailableSessions(movieId, date);
    }

    @Override
    public MovieSession add(MovieSession session) {
        MovieSession movieSessionFromDB = movieSessionDao.add(session);
        logger.info("A new movie session was added: " + movieSessionFromDB);
        return movieSessionFromDB;
    }

    @Override
    public MovieSession get(Long id) {
        return movieSessionDao.get(id).orElseThrow(
                () -> new DataProcessingException("Session with id " + id + " was not found."));
    }

    @Override
    public MovieSession update(MovieSession movieSession) {
        MovieSession updatedMovieSession = movieSessionDao.update(movieSession);
        logger.info("The movie session with id " + updatedMovieSession.getId() + " was updated.");
        return updatedMovieSession;
    }

    @Override
    public void delete(Long id) {
        movieSessionDao.delete(id);
        logger.info("Daleted movie session with id " + id);
    }
}
