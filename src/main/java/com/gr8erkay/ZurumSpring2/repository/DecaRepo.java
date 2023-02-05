package com.gr8erkay.ZurumSpring2.repository;

import com.gr8erkay.ZurumSpring2.model.Decagon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DecaRepo extends JpaRepository<Decagon, Long> {

}
