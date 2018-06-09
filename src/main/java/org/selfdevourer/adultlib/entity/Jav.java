package org.selfdevourer.adultlib.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Document(collection = "javs")
public class Jav {

    @Id
    private String id;
    @Indexed
    private String number;
    @Field("details_url")
    private String detailsUrl;
    @Field("small_cover")
    private String smallCover;
    @Field("local_small_cover")
    private String localSmallCover;
    @Field("big_cover")
    private String bigCover;
    @Field("local_big_cover")
    private String localBigCover;
    private String title;
    @Field("release_date")
    private String releaseDate;
    @Field("movie_len")
    private String movieLen;
    private Map<String, Object> director;
    private Map<String, Object> maker;
    private Map<String, Object> publisher;
    private Map<String, Object> series;
    private List<Map<String, Object>> actors;
    private List<Map<String, Object>> tags;
    @Field("create_time")
    private Date crateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDetailsUrl() {
        return detailsUrl;
    }

    public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
    }

    public String getSmallCover() {
        return smallCover;
    }

    public void setSmallCover(String smallCover) {
        this.smallCover = smallCover;
    }

    public String getLocalSmallCover() {
        return localSmallCover;
    }

    public void setLocalSmallCover(String localSmallCover) {
        this.localSmallCover = localSmallCover;
    }

    public String getBigCover() {
        return bigCover;
    }

    public void setBigCover(String bigCover) {
        this.bigCover = bigCover;
    }

    public String getLocalBigCover() {
        return localBigCover;
    }

    public void setLocalBigCover(String localBigCover) {
        this.localBigCover = localBigCover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMovieLen() {
        return movieLen;
    }

    public void setMovieLen(String movieLen) {
        this.movieLen = movieLen;
    }

    public Map<String, Object> getDirector() {
        return director;
    }

    public void setDirector(Map<String, Object> director) {
        this.director = director;
    }

    public Map<String, Object> getMaker() {
        return maker;
    }

    public void setMaker(Map<String, Object> maker) {
        this.maker = maker;
    }

    public Map<String, Object> getPublisher() {
        return publisher;
    }

    public void setPublisher(Map<String, Object> publisher) {
        this.publisher = publisher;
    }

    public Map<String, Object> getSeries() {
        return series;
    }

    public void setSeries(Map<String, Object> series) {
        this.series = series;
    }

    public List<Map<String, Object>> getActors() {
        return actors;
    }

    public void setActors(List<Map<String, Object>> actors) {
        this.actors = actors;
    }

    public List<Map<String, Object>> getTags() {
        return tags;
    }

    public void setTags(List<Map<String, Object>> tags) {
        this.tags = tags;
    }

    public Date getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }

    @Override
    public String toString() {
        return "Jav{" +
                "id='" + id + '\'' +
                ", number='" + number + '\'' +
                ", detailsUrl='" + detailsUrl + '\'' +
                ", smallCover='" + smallCover + '\'' +
                ", localSmallCover='" + localSmallCover + '\'' +
                ", bigCover='" + bigCover + '\'' +
                ", localBigCover='" + localBigCover + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", movieLen='" + movieLen + '\'' +
                ", director=" + director +
                ", maker=" + maker +
                ", publisher=" + publisher +
                ", series=" + series +
                ", actors=" + actors +
                ", tags=" + tags +
                ", crateTime=" + crateTime +
                '}';
    }
}
