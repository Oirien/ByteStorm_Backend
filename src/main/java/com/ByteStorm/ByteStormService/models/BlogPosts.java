package com.ByteStorm.ByteStormService.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "BlogPosts")
public class BlogPosts {
    @Id
    @JsonProperty("_id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("content")
    private String content;
    @JsonProperty("date")
    private String date;
    @JsonProperty("imageRef")
    private String imageRef;

    public BlogPosts(String id, String title, String content, String date, String imageRef) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = date;
        this.imageRef = imageRef;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImageRef() {
        return imageRef;
    }

    public void setImageRef(String imageRef) {
        this.imageRef = imageRef;
    }
}
