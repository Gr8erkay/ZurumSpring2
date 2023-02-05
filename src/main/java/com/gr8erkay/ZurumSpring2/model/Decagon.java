package com.gr8erkay.ZurumSpring2.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "decagon_tbl")
public class Decagon {

    //Mapping
        //One-to-One
            //Bi-directional/Uni-directional
        //Many-to-One
        //One-to-Many
        //Many-to-Many
    //Validations
    //Logging

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long decagonId;

    @Column(name = "deca_email")
    private String email;

    @Column(name = "deca_name")
    private String name;

    @OneToOne
    private Facility facility;

    //Next Decadevs
}
