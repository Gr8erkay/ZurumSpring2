package com.gr8erkay.ZurumSpring2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "decagon_tbl")
public class Decagon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long decagonId;

    @Column(name = "deca_email")
    private String email;

    @Column(name = "deca_name")
    private String name;

    //Next Decadevs
}
