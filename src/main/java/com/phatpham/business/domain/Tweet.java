package com.phatpham.business.domain;

import com.phatpham.util.Configuration;
import twitter4j.*;

import java.util.List;
import java.util.stream.Collectors;

public class Tweet {
    private String content;

    public Tweet(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    /***
     * Create tweet
     * @param tweet
     * @return
     * @throws TwitterException
     */
    public String createTweet(String tweet) throws TwitterException {
        Twitter twitter = Configuration.getTwitterinstance();
        Status status = twitter.updateStatus("creating baeldung API");
        return status.getText();
    }

    /***
     * Get time line
     * @return
     * @throws TwitterException
     */
    public List<String> getTimeLine() throws TwitterException {
        Twitter twitter = Configuration.getTwitterinstance();

        return twitter.getHomeTimeline().stream()
                .map(item -> item.getText())
                .collect(Collectors.toList());
    }

    public static List<String> searchTweetFromUser(String user, String keyword) throws TwitterException {
        Twitter twitter = Configuration.getTwitterinstance();
        Query query = new Query("from:"+ user + " " + keyword);
        QueryResult result = twitter.search(query);

        return result.getTweets().stream()
                .map(item -> item.getText())
                .collect(Collectors.toList());
    }

}
