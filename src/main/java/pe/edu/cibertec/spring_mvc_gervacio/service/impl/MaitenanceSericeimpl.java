package pe.edu.cibertec.spring_mvc_gervacio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.spring_mvc_gervacio.dto.FilmDto;
import pe.edu.cibertec.spring_mvc_gervacio.entity.Film;
import pe.edu.cibertec.spring_mvc_gervacio.repository.FilmRepository;
import pe.edu.cibertec.spring_mvc_gervacio.service.MaintenanceService;

import java.util.ArrayList;
import java.util.List;
@Service
public class MaitenanceSericeimpl implements MaintenanceService {

    @Autowired
    FilmRepository filmRepository;


    @Override
    public List<FilmDto> findAllFilms() {

        List<FilmDto> films = new ArrayList<FilmDto>();
        Iterable<Film> iterable = filmRepository.findAll();
        iterable.forEach(film -> {
            FilmDto filmDto = new FilmDto(film.getFilmId(),
                    film.getTitle(),
                    film.getLanguage().getName(),
                    film.getRentalDuration(),
                    film.getRentalRate());
            films.add(filmDto);
        });
        return films;
    }


}
