package com.gr8erkay.ZurumSpring2.service.implementation;

import com.gr8erkay.ZurumSpring2.model.Decagon;
import com.gr8erkay.ZurumSpring2.repository.DecaRepo;
import com.gr8erkay.ZurumSpring2.service.DecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class DecaServiceImpl implements DecaService {

    @Autowired
    private DecaRepo decaRepo;

//    @Override
//    public Decagon saveDecagonPerson(Decagon decagon) {
//
////        Decagon deca = new Decagon(1L, "name", "email");
//
////        decaRepo.save(decagon);
//        return decaRepo.save(decagon);
//    }

    @Override
    public Decagon saveDecaDev(Decagon decagon) {
        return decaRepo.save(decagon);
    }

    @Override
    public Decagon getById(Long Id) {
        return decaRepo.findById(Id).get();
    }

    @Override
    public List<Decagon> getAllDecadev() {
        return decaRepo.findAll();
    }

    @Override
    public void deleteDecadevById(Long Id) {
        decaRepo.deleteById(Id);

    }

    @Override
    public void updateDecadev(Long Id, Decagon decagon) {
        //Two things in one
        Decagon devToUpdate = decaRepo.findById(Id).get();

        devToUpdate.setName(decagon.getName());
        devToUpdate.setEmail(decagon.getEmail());

        decaRepo.save(devToUpdate);

    }
}
