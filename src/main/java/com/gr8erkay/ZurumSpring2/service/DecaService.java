package com.gr8erkay.ZurumSpring2.service;

import com.gr8erkay.ZurumSpring2.model.Decagon;

import java.util.List;

public interface DecaService {
    //CRUD

    Decagon saveDecaDev(Decagon decagon);

    Decagon getById(Long Id);

    List<Decagon> getAllDecadev();

    void deleteDecadevById(Long Id);

    void updateDecadev(Long Id, Decagon decagon);
}
