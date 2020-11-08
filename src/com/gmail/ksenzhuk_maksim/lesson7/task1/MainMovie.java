package com.gmail.ksenzhuk_maksim.lesson7.task1;

/*Создать класс Фильм с внутренним классом, с помощью объектов
* которого можно гранить информацию о продолжительности,
* жанре и режиссерах фильма*/

public class MainMovie {
    public static void main(String[] args) {

        try {
            MovieService firstMovie = new MovieService("The green mile");
            MovieService.MovieInfo firstMovieInfo = firstMovie.
                    new MovieInfo(3,9,0,"Fantasy/Drama", "Frank Darabont");
            System.out.println(firstMovie);
            System.out.println(firstMovieInfo);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
