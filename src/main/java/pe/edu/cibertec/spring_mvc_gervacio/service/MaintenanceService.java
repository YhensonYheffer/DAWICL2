package pe.edu.cibertec.spring_mvc_gervacio.service;

import pe.edu.cibertec.spring_mvc_gervacio.dto.FilmDto;

import java.util.List;

public interface MaintenanceService {
    List<FilmDto> findAllFilms();
}
