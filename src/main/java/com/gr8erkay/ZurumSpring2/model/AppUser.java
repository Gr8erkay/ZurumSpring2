package com.gr8erkay.ZurumSpring2.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "twitter_user")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appUserId;

    @Column(name = "twitter_handle")
    private String name;

    private Tweet tweet;

    private Integer age;





}
