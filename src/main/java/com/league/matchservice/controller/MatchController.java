package com.league.matchservice.controller;

import com.league.matchservice.model.Match;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;
import redis.clients.jedis.Jedis;

import java.util.List;

@Controller("/matches")
public class MatchController {

    @Inject
    Jedis jedis;

    @Post
    public Match create(@Body Match match) {
        String key = "match:" + match.getId();
        jedis.hset(key, "teamA", match.getTeamA());
        jedis.hset(key, "teamB", match.getTeamB());
        jedis.hset(key, "referee", match.getReferee());
        jedis.hset(key, "stadium", match.getStadium());
        jedis.hset(key, "date", match.getDate());

        System.out.println("EVENT: match.created -> " + key);
        return match;
    }

    @Get
    public List<String> getAllKeys() {
        return jedis.keys("match:*").stream().toList();
    }
}
