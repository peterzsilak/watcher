package me.tvstore.watcher.model.entity.games.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GamesDTO {

    private String name;
    private int pos;
    private int score;
    private String games;

    public GamesDTO() {
    }

    public String getName() {
        return name;
    }

    public int getPos() {
        return pos;
    }

    public int getScore() {
        return score;
    }

    public String getGames() {
        return games;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setGames(String games) {
        this.games = games;
    }

    @Override
    public String toString() {
        return "games{" +
                "Name=" + getName() +
                ", Position=" + getPos() +
                ", Score=" + getScore() +
                ", games='" + getGames() + '\'' +
                '}';
    }
}
