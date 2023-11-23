package com.tweetero.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweetero.api.model.Tweet;

public interface TweetReposirory extends JpaRepository<Tweet, Long> {

}
