package org.selfdevourer.adultlib.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

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
    private String rleaseDate;
    @Field("movie_len")
    private String movieLen;
    private String director;
    private String maker;
    private String publisher;
    private String series;
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

    public String getRleaseDate() {
        return rleaseDate;
    }

    public void setRleaseDate(String rleaseDate) {
        this.rleaseDate = rleaseDate;
    }

    public String getMovieLen() {
        return movieLen;
    }

    public void setMovieLen(String movieLen) {
        this.movieLen = movieLen;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
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
                ", rleaseDate='" + rleaseDate + '\'' +
                ", movieLen='" + movieLen + '\'' +
                ", director='" + director + '\'' +
                ", maker='" + maker + '\'' +
                ", publisher='" + publisher + '\'' +
                ", series='" + series + '\'' +
                ", crateTime=" + crateTime +
                '}';
    }
}
