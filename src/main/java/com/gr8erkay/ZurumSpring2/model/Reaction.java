package com.gr8erkay.ZurumSpring2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "tweet_reaction_table")
public class Reaction {

    @Id
    private Long reactionId;


}
