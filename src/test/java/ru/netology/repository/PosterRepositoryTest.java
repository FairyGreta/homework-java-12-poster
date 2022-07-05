package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.homework.Poster;
import ru.netology.homework.PosterManager;
import ru.netology.repository.PosterRepository;

import static org.mockito.Mockito.*;

public class PosterRepositoryTest {

    PosterRepository repo = Mockito.mock(PosterRepository.class);
    PosterManager manager = new PosterManager(repo);

    Poster movie1 = new Poster(1, "Бладшот", "боевик", "12.03.2020");
    Poster movie2 = new Poster(2, "Вперед", "мультфильм", "05.03.2020");
    Poster movie3 = new Poster(3, "Отель Белград", "комедия", "05.03.2020");
    Poster movie4 = new Poster(4, "Джентельмены", "боевик", "12.02.2020");
    Poster movie5 = new Poster(5, "Человек-невидимка", "ужасы", "05.03.2020");
    Poster movie6 = new Poster(6, "Тролли. Мировой тур", "мультфильм", "19.05.2020");
    Poster movie7 = new Poster(7, "Номер один", "комедия", "19.03.2020");

    @Test
    public void shouldFindAll() {
        Poster[] movies = {movie1, movie2, movie3, movie4, movie5};
        doReturn(movies).when(repo).getMovies();

        Poster[] expected = {movie1, movie2, movie3, movie4, movie5};
        Poster[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }
}
