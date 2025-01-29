package com.raxrot.sbblogwebapp.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String url;

    @Lob
    @Column(columnDefinition = "LONGTEXT", nullable = false)
    private String content;

    private String shortDescription;

    @CreationTimestamp
    private LocalDateTime createdOn;

    @UpdateTimestamp
    private LocalDateTime updatedOn;

    @OneToMany(mappedBy = "post", cascade = CascadeType.REMOVE)
    private Set<Comment> comments = new HashSet<>();

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Post() {}

    public Post(Long id, String title, String url, String content, String shortDescription, LocalDateTime createdOn, LocalDateTime updatedOn,Set<Comment>comments) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.content = content;
        this.shortDescription = shortDescription;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.comments = comments;
    }

    public Post(Long id, String title, String url, String content, String shortDescription, LocalDateTime createdOn, LocalDateTime updatedOn) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.content = content;
        this.shortDescription = shortDescription;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getShortDescription() { return shortDescription; }
    public void setShortDescription(String shortDescription) { this.shortDescription = shortDescription; }

    public LocalDateTime getCreatedOn() { return createdOn; }
    public void setCreatedOn(LocalDateTime createdOn) { this.createdOn = createdOn; }

    public LocalDateTime getUpdatedOn() { return updatedOn; }
    public void setUpdatedOn(LocalDateTime updatedOn) { this.updatedOn = updatedOn; }
}
