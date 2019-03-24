package com.upc.web.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class News {
    private int newid;
    private String title;
    private String text;
    private Integer newsvip;

    @Id
    @Column(name = "NEWID")
    public int getNewid() {
        return newid;
    }

    public void setNewid(int newid) {
        this.newid = newid;
    }

    @Basic
    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "TEXT")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Basic
    @Column(name = "NEWSVIP")
    public Integer getNewsvip() {
        return newsvip;
    }

    public void setNewsvip(Integer newsvip) {
        this.newsvip = newsvip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass ( ) != o.getClass ( )) return false;

        News news = (News) o;

        if (newid != news.newid) return false;
        if (title != null ? !title.equals (news.title) : news.title != null) return false;
        if (text != null ? !text.equals (news.text) : news.text != null) return false;
        if (newsvip != null ? !newsvip.equals (news.newsvip) : news.newsvip != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = newid;
        result = 31 * result + (title != null ? title.hashCode ( ) : 0);
        result = 31 * result + (text != null ? text.hashCode ( ) : 0);
        result = 31 * result + (newsvip != null ? newsvip.hashCode ( ) : 0);
        return result;
    }
}
