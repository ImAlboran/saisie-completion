package fr.alboran.saisiecompletion.controller;

import fr.alboran.saisiecompletion.entity.Mot;
import fr.alboran.saisiecompletion.repository.MotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MotController {

    @Autowired
    private MotRepository motRepository;

    @GetMapping("/form")
    public String afficherFormulaire() {
        return "form";
    }

    @GetMapping("/autocomplete")
    public String autocomplete(@RequestParam("mot") String mot, Model model) {
        List<Mot> motsSuggestion = motRepository.findByContentContainingIgnoreCase(mot);
        model.addAttribute("motsSuggestion", motsSuggestion);
        return "autocomplete";
    }
}
