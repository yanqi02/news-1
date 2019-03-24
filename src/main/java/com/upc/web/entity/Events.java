package com.upc.web.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Events {
    private long eventId;
    private Timestamp eventDate;
    private String title;

    @Id
    @Column(name = "EVENT_ID")
    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    @Basic
    @Column(name = "EVENT_DATE")
    public Timestamp getEventDate() {
        return eventDate;
    }

    public void setEventDate(Timestamp eventDate) {
        this.eventDate = eventDate;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass ( ) != o.getClass ( )) return false;

        Events events = (Events) o;

        if (eventId != events.eventId) return false;
        if (eventDate != null ? !eventDate.equals (events.eventDate) : events.eventDate != null) return false;
        if (title != null ? !title.equals (events.title) : events.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (eventId ^ (eventId >>> 32));
        result = 31 * result + (eventDate != null ? eventDate.hashCode ( ) : 0);
        result = 31 * result + (title != null ? title.hashCode ( ) : 0);
        return result;
    }
}
