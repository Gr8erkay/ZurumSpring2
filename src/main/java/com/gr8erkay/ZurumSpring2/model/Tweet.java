package com.gr8erkay.ZurumSpring2.model;

import com.gr8erkay.ZurumSpring2.constants.TweetReaction;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "twitter_user_tweets")
public class Tweet {

    @Id
    private Long tweetId;

    private String post;

    private String reaction;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "appUserId",
            referencedColumnName = "appUserId"
    )
    private AppUser appUser;
}
