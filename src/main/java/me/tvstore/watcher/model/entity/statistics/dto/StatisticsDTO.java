package me.tvstore.watcher.model.entity.statistics.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StatisticsDTO {

    private List <String> headers;
    private List <String> genres;
    private List <String> data;
    private List <String> total;

    public StatisticsDTO() {
    }

    public List<String> getHeaders() {
        return headers;
    }

    public List<String> getGenres() {
        return genres;
    }

    public List<String> getData() {
        return data;
    }

    public List<String> getTotal() {
        return total;
    }

    public void setHeaders(List<String> headers) {
        this.headers = headers;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public void setTotal(List<String> total) {
        this.total = total;
    }
}
