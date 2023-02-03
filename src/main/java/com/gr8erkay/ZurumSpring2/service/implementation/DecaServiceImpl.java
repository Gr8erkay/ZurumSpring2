package com.gr8erkay.ZurumSpring2.service.implementation;

import com.gr8erkay.ZurumSpring2.model.Decagon;
import com.gr8erkay.ZurumSpring2.repository.DecaRepo;
import com.gr8erkay.ZurumSpring2.service.DecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DecaServiceImpl implements DecaService {

    @Autowired
    private DecaRepo decaRepo;

    @Override
    public String saveDecagonPerson(Decagon decagon) {

//        Decagon deca = new Decagon(1L, "name", "email");

        decaRepo.save(decagon);
        return "It is saved";
    }
}
