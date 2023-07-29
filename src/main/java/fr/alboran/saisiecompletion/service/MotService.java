package fr.alboran.saisiecompletion.service;

import fr.alboran.saisiecompletion.entity.Mot;
import fr.alboran.saisiecompletion.repository.MotRepository;

import java.util.List;

public class MotService {

    private MotRepository motRepository;

    public List<Mot> completionMot(String mot){
        return motRepository.findByContentContainingIgnoreCase(mot);
    }
}
