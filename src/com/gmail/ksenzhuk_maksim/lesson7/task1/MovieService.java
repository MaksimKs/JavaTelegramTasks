package com.gmail.ksenzhuk_maksim.lesson7.task1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MovieService {

    private String movieTitle;

    public MovieService(String movieTitle) {
        setMovieTitle(movieTitle);
    }

    public String getMovieTitle() {
        return movieTitle;
    }
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = Validation.inputValidation(movieTitle);
    }

    public class MovieInfo {
        String movieDuration;
        String movieGenre;
        String movieDirectors;

        public MovieInfo(int hourDuration, int minuteDuration, int secondDuration, String movieGenre, String movieDirectors) {
            setMovieDuration(hourDuration,minuteDuration,secondDuration);
            setMovieGenre(movieGenre);
            setMovieDirectors(movieDirectors);
        }

        public String getMovieDuration() {
            return movieDuration;
        }
        public void setMovieDuration(int hourDuration, int minuteDuration, int secondDuration) {
            if (hourDuration >= 0 && minuteDuration >= 0 && secondDuration >= 0) {
                String timeDurationPattern = "HH:mm:ss";
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(timeDurationPattern);
                LocalTime duration = LocalTime.of(hourDuration,minuteDuration,secondDuration);
                this.movieDuration = dateTimeFormatter.format(duration);
            } else throw new NumberFormatException("Incorrect movie duration.\n" +
                    "\"Hours/minutes/seconds duration shouldn't be less than zero.\" ");
        }

        public String getMovieGenre() {
            return movieGenre;
        }
        public void setMovieGenre(String movieGenre) {
            this.movieGenre = Validation.inputValidation(movieGenre);
        }

        public String getMovieDirectors() {
            return movieDirectors;
        }
        public void setMovieDirectors(String movieDirectors) {
            this.movieDirectors = Validation.inputValidation(movieDirectors);
        }

        @Override
        public String toString () {
            return String.format("Movie info is: " + "%s-title; %s-duration; %s-genre; %s-director;",
                    movieTitle, movieDuration, movieGenre, movieDirectors);
        }
    }

    @Override
    public String toString() {
        return "Movie title: \"" + movieTitle +"\"";
    }
}
