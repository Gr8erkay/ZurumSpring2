package com.gr8erkay.ZurumSpring2.controller;

import ch.qos.logback.core.model.Model;
import com.gr8erkay.ZurumSpring2.model.Decagon;
import com.gr8erkay.ZurumSpring2.service.DecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Purpose of Controller
//Routing
//Validation
//Login

@Controller
public class DecaController {

    //ThymeLeaf
    //Handler methods
    //Routing

    @Autowired
    private DecaService decaService;

    @GetMapping(path = "/devs")
    public String showDecaDashboard(Model model) {
        List<Decagon> listOfDevs = decaService.getAllDecadev();
        model.addAttribute("decadevs", listOfDevs);

        return "devs";
    }

    @PostMapping(path = "/devs")
    public String saveDev(@ModelAttribute("dev") Decagon dev){

        decaService.saveDecaDev(dev);

        return "redirect:/devs";

    }

    @GetMapping(path = "/devs/create-new")
    public String devEnter(Model model){

        Decagon decagon = new Decagon();

        model.addAttribute("dev", decagon);

        return "create_dev";
    }

    @PostMapping(path = "devs/{id}")
    public String updateDev(@PathVariable Long Id, @ModelAttribute("dev") Decagon decagon){

        decaService.updateDecadev(Id, decagon);

        return "redirect:/devs";
    }

    @GetMapping(path = "devs/edit/{id}")
    public String editDev(@PathVariable Long Id, Model model){

        model.addAttribute("dev", decaService.getById(Id));

        return "redirect:/devs";
    }

    @GetMapping(path = "devs/{id}")
    public String editDev(@PathVariable Long Id){

        decaService.deleteDecadevById(Id);

        return "redirect:/devs";
    }


}
