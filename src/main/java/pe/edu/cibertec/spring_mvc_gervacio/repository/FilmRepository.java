package pe.edu.cibertec.spring_mvc_gervacio.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.cibertec.spring_mvc_gervacio.entity.Film;

public interface FilmRepository extends CrudRepository<Film, Integer> {
}
