package me.tvstore.watcher.model.entity.series.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.lang.reflect.Array;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SeriesDTO {

    Integer group;
    Integer id;
    String hun_name;
    String eng_name;
    String pic;
    Integer imdb_link;
    Integer tvcom_link;
    Integer porthu_link;
    Integer tvrage_link;
    Object epnums;
    Array loaded;
    Integer lastseen;
    Integer ended;
}
