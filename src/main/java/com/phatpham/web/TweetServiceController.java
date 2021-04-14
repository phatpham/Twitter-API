package com.phatpham.web;

import com.phatpham.business.service.TweetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/tweet")
public class TweetServiceController {

    TweetService tweetService;
    public TweetServiceController(TweetService tweetService) {
        this.tweetService = tweetService;
    }

    @GetMapping
    public String getTweetsWithKeyword(@RequestParam(value="user", required = false) String user,
                                       @RequestParam(value="keyword", required = false) String keyword,
                                       Model model) {
        List<String> tweets = tweetService.findTweetsContainingString(user, keyword);
        System.out.println(tweets);
        model.addAttribute("tweets", tweets);
        return "tweetsDisplay";
    }
}
