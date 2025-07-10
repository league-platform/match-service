package com.league.matchservice.model;

public class Match {
    private String id;
    private String teamA;
    private String teamB;
    private String referee;
    private String stadium;
    private String date;

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTeamA() { return teamA; }
    public void setTeamA(String teamA) { this.teamA = teamA; }

    public String getTeamB() { return teamB; }
    public void setTeamB(String teamB) { this.teamB = teamB; }

    public String getReferee() { return referee; }
    public void setReferee(String referee) { this.referee = referee; }

    public String getStadium() { return stadium; }
    public void setStadium(String stadium) { this.stadium = stadium; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
}
