package com.phatpham.data.entity;

import javax.persistence.*;

@Entity
@Table(name="Tweet")
public class TweetEntity {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long tweetID;

    @Column(name="content")
    private String content;


    public String getContent() {
        return content;
    }

    public long getTweetID() {
        return tweetID;
    }
}
