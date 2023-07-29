package fr.alboran.saisiecompletion;

import fr.alboran.saisiecompletion.entity.Mot;
import fr.alboran.saisiecompletion.repository.MotRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceContexts;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@DataJpaTest
public class MotRepositoryIntegrationTest {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private MotRepository repository;

    @Before
    public void before() {
        entityManager.persist(Mot.from("Voiture"));
        entityManager.persist(Mot.from("Maison"));
        entityManager.persist(Mot.from("Jardin"));
        entityManager.persist(Mot.from("Garage"));
        entityManager.persist(Mot.from("Toit"));
    }
}
