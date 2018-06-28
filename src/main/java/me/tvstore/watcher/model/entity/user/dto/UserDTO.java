package me.tvstore.watcher.model.entity.user.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {

    private String name;        // belépési név
    private Long up;            // feltöltött adatmennyiség (byte-okban)
    private Long down;          // letöltött adatmennyiség (byte-okban)
    private Long regdate;       // regisztráció ideje (UNIX timestamppel)
    private Long last_active;   // utoljára az oldalon (UNIX timestamppel)
    private int sols;           // solok száma
    private String avatar;      // avatar linkje
    private String rank;        // a felhasználó rangja
    private String country;     // a felhasználó által beállított ország
    private int forum_post;     // fórumhozzászólások száma
    private int like_num;       // lájkok száma
    private int seed;           // seedelt torrentek száma
    private int leech;          // leechelt torrentek száma

    public UserDTO() {
    }

    public String getName() {
        return name;
    }

    public Long getUp() {
        return up;
    }

    public Long getDown() {
        return down;
    }

    public Long getRegdate() {
        return regdate;
    }

    public Long getLast_active() {
        return last_active;
    }

    public int getSols() {
        return sols;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getRank() {
        return rank;
    }

    public String getCountry() {
        return country;
    }

    public int getForum_post() {
        return forum_post;
    }

    public int getLike_num() {
        return like_num;
    }

    public int getSeed() {
        return seed;
    }

    public int getLeech() {
        return leech;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUp(Long up) {
        this.up = up;
    }

    public void setDown(Long down) {
        this.down = down;
    }

    public void setRegdate(Long regdate) {
        this.regdate = regdate;
    }

    public void setLast_active(Long last_active) {
        this.last_active = last_active;
    }

    public void setSols(int sols) {
        this.sols = sols;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setForum_post(int forum_post) {
        this.forum_post = forum_post;
    }

    public void setLike_num(int like_num) {
        this.like_num = like_num;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }

    public void setLeech(int leech) {
        this.leech = leech;
    }
}
