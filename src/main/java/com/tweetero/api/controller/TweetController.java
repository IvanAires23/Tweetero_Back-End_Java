package com.tweetero.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.api.dto.TweetDTO;
import com.tweetero.api.model.Tweet;
import com.tweetero.api.repository.TweetReposirory;

@RestController
@RequestMapping("/tweets")
public class TweetController {

    @Autowired
    private TweetReposirory reposirory;

    @PostMapping
    String createTweet(@RequestBody TweetDTO req) {
        reposirory.save(new Tweet(req));
        return "OK";
    }

    @GetMapping
    List<Tweet> findTweets() {
        return reposirory.findAll();
    }

}
