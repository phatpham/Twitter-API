package com.phatpham.business.service;

import com.phatpham.business.domain.Tweet;
import com.phatpham.data.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.TwitterException;

import java.util.List;

@Service
public class TweetService {
    private TweetRepository tweetRepository;

    @Autowired
    public TweetService(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    public List<String> findTweetsContainingString(String user, String keyword) {
        try {
            return Tweet.searchTweetFromUser(user, keyword);
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        return null;
    }
}
