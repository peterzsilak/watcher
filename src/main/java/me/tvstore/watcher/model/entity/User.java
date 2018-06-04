package me.tvstore.watcher.model.entity;

public class User {

    // belépési név
    String name;
    //feltöltött adatmennyiség (byte-okban)
    String up;
    //letöltött adatmennyiség (byte-okban)
    String down;
    //regisztráció ideje (UNIX timestamppel)
    String regdate;
    //utoljára az oldalon (UNIX timestamppel)
    String last_active;
    //solok száma
    String sols;
    // avatar linkje
    String avatar;
    //a felhasználó rangja
    String rank;
    //a felhasználó által beállított ország
    String country;
    //fórumhozzászólások száma
    String forum_post;
    //lájkok száma
    String like_num;
    //seedelt torrentek száma
    String seed;
    //leechelt torrentek száma
    String leech;
}
