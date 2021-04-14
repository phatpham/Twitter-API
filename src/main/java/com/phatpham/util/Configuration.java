package com.phatpham.util;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class Configuration {

    private Configuration() {

    }

    public static Twitter getTwitterinstance(){
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("WJ2P0fdUmxgmfKFLo2pw7mTmd")
                .setOAuthConsumerSecret("l3LvPBbJKUQelPpnr7k6sKQGcdQfCcPuHKmaSQVfzkylzb2tRA")
                .setOAuthAccessToken("1379940926609580039-JuUiQGpvPhlidPI8y63zVRWludek48")
                .setOAuthAccessTokenSecret("axlUb5qE7I54OwcH2D72njvSSaWHFrPJA2iQPj2kiwmJj");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        return twitter;
    }

}
