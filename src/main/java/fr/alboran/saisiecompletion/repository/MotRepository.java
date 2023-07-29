package fr.alboran.saisiecompletion.repository;

import fr.alboran.saisiecompletion.entity.Mot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MotRepository extends JpaRepository<Mot, Long> {

    List<Mot> findByContentContainingIgnoreCase(String mot);

}
